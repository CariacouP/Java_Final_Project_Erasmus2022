package Hierarchie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;

public class mainWindow extends JFrame implements ActionListener{
	
	JButton bSearch;
	JButton ListingS;
	JButton addS;
	JTextField textfield;
	Student[] students= new Student[100];
	
	JPanel ButtonAdd = new JPanel();
	JPanel ButtonList = new JPanel();
	JPanel searchBar = new JPanel();
	JPanel headerPanel = new JPanel();
	
	mainWindow(){
		
		this.setTitle("Student"); // set the title of the window
		this.setSize(960,540); //set the x-dimension and the y-dimension of the this
		Image icon = Toolkit.getDefaultToolkit().getImage("ressources/Logo S.png"); // create an image icon
		this.setIconImage(icon); // replace the standard icon of the window
		this.setLayout(new GridLayout(4,1)); // set a Layout for all the window
		
		JLabel label = new JLabel(); // create a new label
		ImageIcon image = new ImageIcon("ressources/Logo Student.png"); // add an image to the label
		label.setIcon(image);// set the image on the label
		
		textfield = new JTextField("Enter student's name and surname...", 20); //set a TextField
		
		bSearch = new JButton("Search"); //set a button
		bSearch.addActionListener(this); //add an actionListener when the button is pressed
		bSearch.setForeground(Color.WHITE); //change the color of the text
		bSearch.setBackground(new Color(155,155,155)); //change the color of the background
		
		ListingS = new JButton();
		ListingS.setText("List students");
		ListingS.setForeground(Color.WHITE);
		ListingS.setBackground(new Color(66,133,244));
		ListingS.setPreferredSize(new Dimension(300,20));
		
		addS = new JButton(); // create a new button
		addS.setText("Add a new student"); //set the text inside the button
		addS.setForeground(Color.WHITE); //change the text color of the button
		addS.setBackground(new Color(66,133,244)); //change the background color of the button
		addS.setPreferredSize(new Dimension(300,20)); // set the size of the button
		addS.addActionListener(this);
		
		 // create a headerPanel
		headerPanel.setLayout(new FlowLayout());
		headerPanel.add(label); // add the label to the headerPanel
		headerPanel.setBackground(Color.WHITE);//set Background color of the headerPanel
		headerPanel.setPreferredSize(new Dimension(960,120)); //set the place of the headerPanel
		
		 //create a searchBar Panel
		searchBar.setLayout(new FlowLayout());
		searchBar.add(textfield); // add the textField to the middle Panel
		searchBar.add(bSearch); // add the Search button
		searchBar.setBackground(Color.WHITE);//set Background color of the headerPanel
		
		
		 // add a new Buttons Panel
		ButtonList.setLayout(new FlowLayout()); // set a grid layout for the two buttons
		ButtonList.add(ListingS); //add the button Listing S to the layout
		ButtonList.setBackground(Color.WHITE);//set Background color of the headerPanel
		
		 // add a new Buttons Panel
		ButtonAdd.setLayout(new FlowLayout()); // set a grid layout for the two buttons
		ButtonAdd.add(addS); //add the button addS to the layout
		ButtonAdd.setBackground(Color.WHITE);//set Background color of the headerPanel
		
	
		
		this.add(headerPanel); // add the header panel to the window
		this.add(searchBar); // add the searchbar panel to the window
		this.add(ButtonList); // add the Buttons panel to the window
		this.add(ButtonAdd); // add the Buttons panel to the window
		
		this.setResizable(false); // prevent this from being resize
		this.getContentPane().setBackground(new Color(255,255,255)); //change the color of the background
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setVisible(true); //make the this visible
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bSearch) {
			this.getContentPane().removeAll();
			this.repaint();
		}
		if(e.getSource()==addS) {
			//this.getContentPane().removeAll();
			this.remove(headerPanel);
			this.remove(ButtonAdd);
			this.remove(ButtonList);
			this.remove(searchBar);
			//this.repaint();
			createNewStudent();
			
		}
		
	}
	
	public void createNewStudent() {
		
		if (students.length<100) {
			int i =students.length;
			Student newStd =new Student();
			newStd.windowInputDataStudent();
								
					if (newStd.typeOfStudie=="Full time student") {
						//this.removeAll();
						
						FullTimeStd newFullStd= new FullTimeStd(newStd.name,newStd.Surname,newStd.Field_Of_Studie,newStd.Adresse,newStd.id_Student);
						
						newFullStd.windowInputFullTimeStd();
						System.out.println("3");
						System.out.println(newFullStd.toString());
						students[i]=newFullStd;
					}
					
					else if (newStd.typeOfStudie=="Part time Student") {
						PartTimeStd newPartStd= new PartTimeStd(newStd.name,newStd.Surname,newStd.Field_Of_Studie,newStd.Adresse,newStd.id_Student);
						
						newPartStd.windowInputPartTimeStd();
						System.out.println(newPartStd.toString());
						students[i]=newPartStd;
						
					}
					
					else if (newStd.typeOfStudie=="Erasmus Student") {
						ErasmusStd newErasmusStd= new ErasmusStd(newStd.name,newStd.Surname,newStd.Field_Of_Studie,newStd.Adresse,newStd.id_Student);
						
						newErasmusStd.windowInputErasmusStd();
						System.out.println(newErasmusStd.toString());
						students[i]=newErasmusStd;
					}
			}
		
	}
	
	
	
	
}
