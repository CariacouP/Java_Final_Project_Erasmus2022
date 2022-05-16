package Hierarchie;

import javax.swing.*;
import javax.swing.event.CellEditorListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.util.Arrays;
import java.util.EventObject;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class mainWindow /*implements TableCellRenderer,TableCellEditor/*implements ActionListener*/{
	
	//JButton bSearch;
	JButton ListingS;
	JButton addS;
	JTextField textfield;
	
	
	boolean running=true;
	boolean added=false;
	
	static JPanel ButtonAdd = new JPanel();
	static JPanel ButtonList = new JPanel();
	//static JPanel searchBar = new JPanel();
	static JPanel headerPanel = new JPanel();
	int j = 0;
	mainWindow(){
		
		
	}
	
	public void mainWindowBuilder(Student[] students,int i) {
		JFrame mainWindow = new JFrame();
		
			
		
		mainWindow.setTitle("Student"); // set the title of the window
		mainWindow.setSize(960,540); //set the x-dimension and the y-dimension of the this
		Image icon = Toolkit.getDefaultToolkit().getImage("ressources/Logo S.png"); // create an image icon
		mainWindow.setIconImage(icon); // replace the standard icon of the window
		mainWindow.setLayout(new GridLayout(4,1)); // set a Layout for all the window
		
		JLabel label = new JLabel(); // create a new label
		ImageIcon image = new ImageIcon("ressources/Logo Student.png"); // add an image to the label
		label.setIcon(image);// set the image on the label
		
		textfield = new JTextField("Enter student's name and surname...", 20); //set a TextField
		/*
		bSearch = new JButton("Search"); //set a button
		//bSearch.addActionListener(this); //add an actionListener when the button is pressed
		bSearch.setForeground(Color.WHITE); //change the color of the text
		bSearch.setBackground(new Color(155,155,155)); //change the color of the background
		*/
		ListingS = new JButton();
		ListingS.setText("List students");
		ListingS.setForeground(Color.WHITE);
		ListingS.setBackground(new Color(66,133,244));
		ListingS.setPreferredSize(new Dimension(300,20));
		ListingS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				listAll(students,i);
				
			}	
				
		});
		addS = new JButton(); // create a new button
		addS.setText("Add a new student"); //set the text inside the button
		addS.setForeground(Color.WHITE); //change the text color of the button
		addS.setBackground(new Color(66,133,244)); //change the background color of the button
		addS.setPreferredSize(new Dimension(300,20)); // set the size of the button
		addS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				mainWindow.dispose();
			
				createNewStudent(students,i);
				
			}	
				
		});
		
			
		// create a headerPanel
		headerPanel.removeAll();
		headerPanel.setLayout(new FlowLayout());
		headerPanel.add(label); // add the label to the headerPanel
		headerPanel.setBackground(Color.WHITE);//set Background color of the headerPanel
		headerPanel.setPreferredSize(new Dimension(960,120)); //set the place of the headerPanel
			
		 // add a new Buttons Panel
		ButtonList.removeAll();
		ButtonList.setLayout(new FlowLayout(FlowLayout.CENTER,0,50)); // set a grid layout for the two buttons
		ButtonList.add(ListingS); //add the button Listing S to the layout
		ButtonList.setBackground(Color.WHITE);//set Background color of the headerPanel
	
		// add a new Buttons Panel
		ButtonAdd.removeAll();
		ButtonAdd.setLayout(new FlowLayout(FlowLayout.CENTER,0,20)); // set a grid layout for the two buttons
		ButtonAdd.add(addS); //add the button addS to the layout
		ButtonAdd.setBackground(Color.WHITE);//set Background color of the headerPanel
		
		
		
			
		mainWindow.add(headerPanel); // add the header panel to the window
		mainWindow.add(ButtonList); // add the Buttons panel to the window
		mainWindow.add(ButtonAdd); // add the Buttons panel to the window
		mainWindow.setResizable(false); // prevent this from being resize
		mainWindow.getContentPane().setBackground(new Color(255,255,255)); //change the color of the background
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		
		
	
		mainWindow.setVisible(true); //make the this visible
		
		
	}

	
	
	
	public void createNewStudent(Student[] students,int i) {
		System.out.println(students.length);
		if (students.length<=100) {
			System.out.println("adans le if");
			Student newStd =new Student();
			newStd.windowInputDataStudent(students,i);
			
		}
		
	}	
	
	public void listAll(Student[] studentList, int i ) {
		
		for (j=0;j<i;j++) {
			System.out.println(j);
			System.out.println(studentList[j].toString());
		}
		
		
		JFrame FrameList = new JFrame();
		FrameList.setTitle("Student"); // set the title of the window
		FrameList.setSize(960,540); //set the x-dimension and the y-dimension of the this
		FrameList.setLocationRelativeTo(null);
		
		//JButton bn_giveInformation =new JButton("more information here");
		
		String  title[] = {"Id","Name", "Surmame","Field of studie","Type of student","More Information"};
		
		 
		 Object[][] data = new Object [i][6];
		 
		 
		 for (j = 0; j<i;j++) {
			data[j][0]= studentList[j].id_Student;
			data[j][1]=studentList[j].name;
			data[j][2]=studentList[j].Surname;
			data[j][3]=studentList[j].Field_Of_Studie;
			data[j][4]=studentList[j].typeOfStudie;
			
		 }
		 
		 
		DefaultTableModel model= new DefaultTableModel(data, title);
		 
		JTable Table = new JTable(model);
		Table.setRowHeight(50);
		
		
		
		FrameList.getContentPane().add(new JScrollPane(Table));
		 
		

		
		FrameList.setVisible(true);
		
		
		
		
		
		
	}
	
	public int[] searchInStudent(Student[] students,int fieldOfSearch,String fieldSearched) {
		
		/*
		 * Explcation des Fields :
		 *  0 : Integer.toString(id_Student)
		 *  1: name, 
		 *  3 : Surname,
		 * 	4: Field_Of_Studie,
		 *  5 : Adresse.number, 
		 *  6 : Adresse.street, 
		 *  7: Adresse.town, 
		 *  8: Adresse.zipCode, 
		 *  9: Adresse.Country,
		 *  10: typeOfStudie,
		 *  11: Integer.toString(levelOfStudie),
		 *  12 : Major,
		 *  13 : Minor1,
		 *  14: Minor2,
		 *  15 : ReferalProf,
		 *  16: Float.toString(avgGrade),
		 *  17: Integer.toString(NumberOfHours)
		 *  18 : localAdresse.number, 
		 *  19 : localAdresse.street, 
		 *  20 : localAdresse.town, 
			21 : localAdresse.zipCode, 
			22 : localAdresse.Country,
			23 : UnivversityOfOrigin,
			24 : CountryOfOrigin
		
		 */
		 
		String[] studentFieldChoosenArray = new String[100];
		for (int k=0;k<students.length;k++) {
			studentFieldChoosenArray[k]=students[k].toArrayString()[fieldOfSearch];
             
		}
		
		return searchAll(studentFieldChoosenArray,fieldSearched);
		
	}
	
	
	public int[] searchAll(String[] listToSearch, String fieldSearched) {
		int[] listOfIndexFound = new int[100];
		int a=0;
		int l=0;
		while( a != listToSearch.length) {
			listOfIndexFound[l]=Arrays.binarySearch(Arrays.copyOfRange(listToSearch, a,listToSearch.length),fieldSearched);
			l++;
			a=listOfIndexFound[l]+1;
			
		}
		
		
		
		return listOfIndexFound;
	}
	
	
	public void showFoundedStudent(int[] listOfIdFound,Student[] studentList) {
		
		int n=listOfIdFound.length;
		Student[] ListOfStudentFounded =new Student[n];
		
		for (int l=0;l<n;l++) {
			ListOfStudentFounded[l]=studentList[ listOfIdFound[l] ];
		}
		
		JFrame FrameList = new JFrame();
		FrameList.setTitle("Student"); // set the title of the window
		FrameList.setSize(960,540); //set the x-dimension and the y-dimension of the this
		FrameList.setLocationRelativeTo(null);
		
		//JButton bn_giveInformation =new JButton("more information here");
		
		String  title[] = {"Id","Name", "Surmame","Field of studie","Type of student"};
		
		 
		 Object[][] data = new Object [n][5];
		 
		 
		 for (j = 0; j<n;j++) {
			data[j][0]= ListOfStudentFounded[j].id_Student;
			data[j][1]=ListOfStudentFounded[j].name;
			data[j][2]=ListOfStudentFounded[j].Surname;
			data[j][3]=ListOfStudentFounded[j].Field_Of_Studie;
			data[j][4]=ListOfStudentFounded[j].typeOfStudie;
			System.out.println(ListOfStudentFounded[j].toString());
			
		 }
		 DefaultTableModel model= new DefaultTableModel(data, title);
		 
		JTable Table = new JTable(model);
		Table.setRowHeight(50);
	
		FrameList.getContentPane().add(new JScrollPane(Table));
		FrameList.setVisible(true);
	}
}



