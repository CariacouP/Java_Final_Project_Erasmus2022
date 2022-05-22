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
	
	JButton bSearch;
	JButton ListingS;
	JButton addS;
	JComboBox<String> cb_Field_Search;
	JTextField textfield;
	
	
	boolean running=true;
	boolean added=false;
	
	static JPanel ButtonAdd = new JPanel();
	static JPanel ButtonList = new JPanel();
	static JPanel searchBar = new JPanel();
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
		
		textfield = new JTextField("", 12); //set a TextField
		
		cb_Field_Search = new JComboBox<String>();
		cb_Field_Search.addItem("Name");
		cb_Field_Search.addItem("Surname");
		cb_Field_Search.addItem("Field of study");
		cb_Field_Search.addItem("Adress town");
		cb_Field_Search.addItem("Adress country");
		cb_Field_Search.addItem("Type of study");
		cb_Field_Search.addItem("Level of study");
		cb_Field_Search.addItem("Major");
		cb_Field_Search.addItem("Minor 1");
		cb_Field_Search.addItem("Minor 2");
		cb_Field_Search.addItem("Referral professor");
		cb_Field_Search.addItem("Average grade");
		cb_Field_Search.addItem("Number of hours");
		cb_Field_Search.addItem("School Adress town");
		cb_Field_Search.addItem("School Adress country");
		cb_Field_Search.addItem("University of origin");
		cb_Field_Search.addItem("Country of origin");
		
		bSearch = new JButton("Search"); //set a button
		bSearch.setForeground(Color.WHITE); //change the color of the text
		bSearch.setBackground(new Color(155,155,155)); //change the color of the background
		bSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Field_of_Search_Given;
				String nameGiven;
				String surnameGiven;
				String Field_of_Study_Given;
				String adressTownGiven;
				String adressCountryGiven;
				String type_of_Study_Given;
				int level_of_Study_Given;
				String majorGiven;
				String minor1Given;
				String minor2Given;
				String referalProfGiven;
				float avgGradeGiven;
				int nb_of_Hours_Given;
				String schoolTownGiven;
				String schoolCountryGiven;
				String universityGiven;
				String country_of_Origin_Given;
				
				Field_of_Search_Given=(String)cb_Field_Search.getSelectedItem();
				
				if(Field_of_Search_Given=="Name") {
					nameGiven=textfield.getText();
					showFoundedStudent(searchInStudent(students,1,nameGiven,i),students);
				}
				
				else if(Field_of_Search_Given=="Surname") {
					surnameGiven=textfield.getText();
					searchInStudent(students,2,surnameGiven,i);
				}
				
				else if(Field_of_Search_Given=="Field of study") {
					Field_of_Study_Given=textfield.getText();
					searchInStudent(students,3,Field_of_Study_Given,i);
				}
				
				else if(Field_of_Search_Given=="Adress town") {
					adressTownGiven=textfield.getText();
					searchInStudent(students,7,adressTownGiven,i);
				}
				
				else if(Field_of_Search_Given=="Adress country") {
					adressCountryGiven=textfield.getText();
					searchInStudent(students,9,adressCountryGiven,i);
				}
				
				else if(Field_of_Search_Given=="Type of study") {
					type_of_Study_Given=textfield.getText();
					searchInStudent(students,10,type_of_Study_Given,i);
				}
				
				else if(Field_of_Search_Given=="Level of study") {
					level_of_Study_Given=Integer.parseInt(textfield.getText());
					searchInStudent(students,11,Integer.toString(level_of_Study_Given),i);
				}
				
				else if(Field_of_Search_Given=="Major") {
					majorGiven=textfield.getText();
					searchInStudent(students,12,majorGiven,i);
				}
				
				else if(Field_of_Search_Given=="Minor 1") {
					minor1Given=textfield.getText();
					searchInStudent(students,13,minor1Given,i);
				}
				
				else if(Field_of_Search_Given=="Minor 2") {
					minor2Given=textfield.getText();
					searchInStudent(students,14,minor2Given,i);
				}
				
				else if(Field_of_Search_Given=="Referral professor") {
					referalProfGiven=textfield.getText();
					searchInStudent(students,15,referalProfGiven,i);
				}
				
				else if(Field_of_Search_Given=="Average grade") {
					avgGradeGiven=Float.valueOf(textfield.getText());
					searchInStudent(students,16,Float.toString(avgGradeGiven),i);
				}
				
				else if(Field_of_Search_Given=="Number of hours") {
					nb_of_Hours_Given=Integer.parseInt(textfield.getText());
					searchInStudent(students,17,Integer.toString(nb_of_Hours_Given),i);
				}
				
				else if(Field_of_Search_Given=="School Adress town") {
					schoolTownGiven=textfield.getText();
					searchInStudent(students,20,schoolTownGiven,i);
				}
				
				else if(Field_of_Search_Given=="School Adress country") {
					schoolCountryGiven=textfield.getText();
					searchInStudent(students,22,schoolCountryGiven,i);
				}
				
				else if(Field_of_Search_Given=="University of origin") {
					universityGiven=textfield.getText();
					searchInStudent(students,23,universityGiven,i);
				}
				
				else if(Field_of_Search_Given=="Country of origin") {
					country_of_Origin_Given=textfield.getText();
					searchInStudent(students,24,country_of_Origin_Given,i);
				}
				
			}
		});
		
		ListingS = new JButton();
		ListingS.setText("List all students");
		ListingS.setForeground(Color.WHITE);
		ListingS.setBackground(new Color(66,133,244));
		ListingS.setPreferredSize(new Dimension(378,20));
		ListingS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				listAll(students,i);
				
			}		
		});
		
		addS = new JButton(); // create a new button
		addS.setText("Add a new student"); //set the text inside the button
		addS.setForeground(Color.WHITE); //change the text color of the button
		addS.setBackground(new Color(66,133,244)); //change the background color of the button
		addS.setPreferredSize(new Dimension(378,20)); // set the size of the button
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
			
		// add a new Search bar Panel
		searchBar.removeAll();
		searchBar.setLayout(new FlowLayout());
		searchBar.add(cb_Field_Search);
		searchBar.add(textfield);
		searchBar.add(bSearch);
		searchBar.setBackground(Color.WHITE);
		
		 // add a new Buttons Panel
		ButtonList.removeAll();
		ButtonList.setLayout(new FlowLayout()); // set a grid layout for the two buttons
		ButtonList.add(ListingS); //add the button Listing S to the layout
		ButtonList.setBackground(Color.WHITE);//set Background color of the headerPanel
	
		// add a new Buttons Panel
		ButtonAdd.removeAll();
		ButtonAdd.setLayout(new FlowLayout()); // set a grid layout for the two buttons
		ButtonAdd.add(addS); //add the button addS to the layout
		ButtonAdd.setBackground(Color.WHITE);//set Background color of the headerPanel
		
		
		mainWindow.add(headerPanel); // add the header panel to the window
		mainWindow.add(searchBar);
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
		Image icon = Toolkit.getDefaultToolkit().getImage("ressources/Logo S.png"); // create an image icon
		FrameList.setIconImage(icon); // replace the standard icon of the window
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
		FrameList.setResizable(false); // prevent this from being resize
		FrameList.setVisible(true);
		
	}
	
	public int[] searchInStudent(Student[] students,int fieldOfSearch,String fieldSearched, int i) {
		
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
		
		System.out.println("test1");
		String[] studentFieldChoosenArray = new String[100];
		System.out.println("test2");
		for (int k=0;k<i-1;k++) {
			studentFieldChoosenArray[k]=students[k].toArrayString()[fieldOfSearch];
		}
		System.out.println("test3");
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
		Image icon = Toolkit.getDefaultToolkit().getImage("ressources/Logo S.png"); // create an image icon
		FrameList.setIconImage(icon); // replace the standard icon of the window
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
		FrameList.setResizable(false); // prevent this from being resize
		FrameList.setVisible(true);
	}
}