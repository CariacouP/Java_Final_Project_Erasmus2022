package Hierarchie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import javax.swing.JScrollPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mainWindow /*implements ActionListener*/{
	
	JButton bSearch;
	JButton ListingS;
	JButton addS;
	JTextField textfield;
	
	
	boolean running=true;
	boolean added=false;
	
	static JPanel ButtonAdd = new JPanel();
	static JPanel ButtonList = new JPanel();
	static JPanel searchBar = new JPanel();
	static JPanel headerPanel = new JPanel();
	
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
		
		bSearch = new JButton("Search"); //set a button
		//bSearch.addActionListener(this); //add an actionListener when the button is pressed
		bSearch.setForeground(Color.WHITE); //change the color of the text
		bSearch.setBackground(new Color(155,155,155)); //change the color of the background
		
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
		
		 //create a searchBar Panel
		searchBar.removeAll();
		searchBar.setLayout(new FlowLayout());
		searchBar.add(textfield); // add the textField to the middle Panel
		searchBar.add(bSearch); // add the Search button
		searchBar.setBackground(Color.WHITE);//set Background color of the headerPanel
			
			
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
		mainWindow.add(searchBar); // add the searchbar panel to the window
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
		
		for (int j=0;j<i;j++) {
			System.out.println(j);
			System.out.println(studentList[j].toString());
		}
		
		
		JFrame FrameList = new JFrame();
		FrameList.setTitle("Student"); // set the title of the window
		FrameList.setSize(960,540); //set the x-dimension and the y-dimension of the this
		FrameList.setLocationRelativeTo(null);
		
		
		
		
		//JPanel PList = new JPanel();
		
		
		
		String  title[] = {"Id","Name", "Surmame","Field of studie","Type of student"};
		/*
		Object[][] data = {{0,"Luca","Bankofski","Computer science","Full Time Student"},
				 			{1,"Alexis","Marie","Computer science","Full Time Student"},
		 					{2,"Geraud","Cazenave","Marine","Part time Stude,t"}};
		 */
		 
		 Object[][] data = new Object [i][5];
		 
		 
		 for (int j = 0; j<i;j++) {
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
}



