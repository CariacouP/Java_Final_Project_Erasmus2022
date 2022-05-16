package Hierarchie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Student extends mainWindow{
	/**
	 * 
	 */
	JFrame frameStd =new JFrame();
	
	String name;
	String Surname;
	String Field_Of_Studie;
	String typeOfStudie;
	Adresse Adresse;
	int id_Student;
	boolean submit=false;
	
	static JPanel PButton=new JPanel();
	
	// Panel pour l'etuduant de base
	static JPanel PTitle=new JPanel();
	static JPanel PName=new JPanel();
	static JPanel PSurname=new JPanel();
	static JPanel PField_Of_Studie=new JPanel();
	static JPanel PAdress=new JPanel();
	static JPanel PNumber=new JPanel();
	static JPanel PStreet=new JPanel();
	static JPanel PTown=new JPanel();
	static JPanel PZipCode=new JPanel();
	static JPanel PCountry=new JPanel();
	static JPanel PTypeStd=new JPanel();
	
	static JPanel PanelStudent=new JPanel();
	
	JTextField tf_name;
	JTextField tf_Surname;
	JTextField tf_Field_of_Studie;
	JTextField tf_Number;
	JTextField tf_Street;
	JTextField tf_Town;
	JTextField tf_ZipCode;
	JTextField tf_Country;
	JComboBox<String> cb_Type_Studie;
	JButton bn_addStd;
	
	
	
	
	public Student() {
		
	}
	
	public Student(String nameGiven, String surnameGiven, String field_Of_StudieGiven,String type_of_studie, Adresse adresse, int id_StudentGiven) {
		super();
		name = nameGiven;
		Surname = surnameGiven;
		Field_Of_Studie = field_Of_StudieGiven;
		Adresse = adresse;
		typeOfStudie=type_of_studie;
		id_Student = id_StudentGiven;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String nameGiven) {
		name = nameGiven;
	}
	public String getSurname() {
		return Surname;
	}
	public  void setSurname(String surnameGiven) {
		Surname = surnameGiven;
	}
	public String getField_Of_Studie() {
		return Field_Of_Studie;
	}
	public  void setField_Of_Studie(String field_Of_StudieGiven) {
		Field_Of_Studie = field_Of_StudieGiven;
	}
	public  Adresse getAdresse() {
		return Adresse;
	}
	public   void setAdresse(Adresse adresseGiven) {
		Adresse = adresseGiven;
	}
	public int getId_Student() {
		return id_Student;
	}
	public void setId_Student(int id_StudentGiven) {
		id_Student = id_StudentGiven;
	}
	
	public String toString() {
		return "id : "+ id_Student+"name: "+name+" Surname : " +Surname + " Field of Studies: "+ Field_Of_Studie+" Adresse : "+ Adresse.toString() +" type of Studies : "+ typeOfStudie;
	}
	
	public String[] toArrayString() {
		String[] arrayString= {Integer.toString(id_Student), name, Surname,Field_Of_Studie,Adresse.number, Adresse.street, Adresse.town, Adresse.zipCode, Adresse.Country,typeOfStudie};
		return arrayString;
	}
	
 	void windowBUilder() {
		PTitle.removeAll();
		PName.removeAll();
		PSurname.removeAll();
		PField_Of_Studie.removeAll();
		PAdress.removeAll();
		PNumber.removeAll();
		PStreet.removeAll();
		PTown.removeAll();
		PZipCode.removeAll();
		PCountry.removeAll();
		PTypeStd.removeAll();
		PButton.removeAll();
		
		
		frameStd.setTitle("Student"); // set the title of the window
		frameStd.setSize(960,540); //set the x-dimension and the y-dimension of the this
		Image icon = Toolkit.getDefaultToolkit().getImage("ressources/Logo S.png"); // create an image icon
		frameStd.setIconImage(icon); // replace the standard icon of the window
		frameStd.setLayout(new GridLayout(12,1));
		
		//PTitle.setLayout(new GridLayout(1,1));
		PTitle.add(new JLabel("COMPLETE STUDENT INFORMATION        "));
		PTitle.add( new JLabel());
		PTitle.setBackground(Color.WHITE);
		
		//PName.setLayout(new GridLayout(2,1));
		PName.add(new JLabel("Name : "));		
		PName.add(tf_name=new JTextField(16));
		PName.setBackground(Color.WHITE);
		
		//PSurname.setLayout(new GridLayout(3,1));
		PSurname.add(new JLabel("Surname :  "));			
		PSurname.add(tf_Surname=new JTextField(14));
		PSurname.setBackground(Color.WHITE);
		
		//PField_Of_Studie.setLayout(new GridLayout(4,1));
		PField_Of_Studie.add(new JLabel("Field of studies :  "));			
		PField_Of_Studie.add(tf_Field_of_Studie=new JTextField(11));
		PField_Of_Studie.setBackground(Color.WHITE);
		
		//PAdress.setLayout(new GridLayout(5,1));
		PAdress.add(new JLabel("Enter student adress                                  "));
		PAdress.add(new JLabel());
		PAdress.setBackground(Color.WHITE);
		
		//PNumber.setLayout(new GridLayout(6,1));
		PNumber.add(new JLabel("Number :"));
		PNumber.add(tf_Number=new JTextField(15));
		PNumber.setBackground(Color.WHITE);
		
		//PStreet.setLayout(new GridLayout(6,2));
		PStreet.add(new JLabel("Street :"));			
		PStreet.add(tf_Street=new JTextField(16));
		PStreet.setBackground(Color.WHITE);
		
		//PTown.setLayout(new GridLayout(7,1));
		PTown.add(new JLabel("Town : "));
		PTown.add(tf_Town=new JTextField(16));
		PTown.setBackground(Color.WHITE);
		
		//PZipCode.setLayout(new GridLayout(7,2));
		PZipCode.add(new JLabel("Zip Code :  "));
		PZipCode.add(tf_ZipCode=new JTextField(14));
		PZipCode.setBackground(Color.WHITE);
		
		//PCountry.setLayout(new GridLayout(7,3));
		PCountry.add(new JLabel("Country :"));
		PCountry.add(tf_Country=new JTextField(15));
		PCountry.setBackground(Color.WHITE);
		
		//PTypeStd.setLayout(new GridLayout(8,1));
		PTypeStd.add(new JLabel("Type student :     "));
		PTypeStd.setBackground(Color.WHITE);
		
		cb_Type_Studie = new JComboBox<String>();
		cb_Type_Studie.addItem("Full time student");
		cb_Type_Studie.addItem("Part time Student");
		cb_Type_Studie.addItem("Erasmus Student");
		
		
		PTypeStd.add(cb_Type_Studie);
		
		bn_addStd = new JButton("Next");
		bn_addStd.setForeground(Color.WHITE);
		bn_addStd.setBackground(new Color(66,133,244));
		bn_addStd.setPreferredSize(new Dimension(220,20));
		PButton.setBackground(Color.WHITE);
		PButton.add(bn_addStd);
		
		frameStd.add(PTitle);
		frameStd.add(PName);
		frameStd.add(PSurname);
		frameStd.add(PField_Of_Studie);
		frameStd.add(PTypeStd);
		frameStd.add(PAdress);
		frameStd.add(PNumber);
		frameStd.add(PStreet);
		frameStd.add(PTown);
		frameStd.add(PZipCode);
		frameStd.add(PCountry);
		frameStd.add(PButton);
		
		frameStd.setResizable(false); // prevent this from being resize
		frameStd.getContentPane().setBackground(new Color(255,255,255)); //change the color of the background
		frameStd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frameStd.setVisible(true);
	}
	
	void windowInputDataStudent(Student[] students, int i ) {
		
		
		windowBUilder();
		
		
		
		bn_addStd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String nameGiven ;
				String surnameGiven;
				String Field_of_StudieGiven;
				String Type_StudieGiven;	
				Adresse student_AdressGiven;
				
				nameGiven = tf_name.getText();
				surnameGiven=tf_Surname.getText();
				Field_of_StudieGiven = tf_Field_of_Studie.getText();
				Type_StudieGiven=(String) cb_Type_Studie.getSelectedItem();
				student_AdressGiven= new Adresse(tf_Number.getText(),tf_Street.getText(),tf_Town.getText(),tf_ZipCode.getText(),tf_Country.getText());
				
				name=nameGiven;
				Surname=surnameGiven;
				Field_Of_Studie=Field_of_StudieGiven;
				typeOfStudie=Type_StudieGiven;
				Adresse=student_AdressGiven;
				
				
				
				if (typeOfStudie=="Full time student") {
					//this.removeAll();
					
					FullTimeStd newFullStd= new FullTimeStd(name,Surname,Field_Of_Studie,typeOfStudie,Adresse,i);
					frameStd.dispose();		
					newFullStd.windowInputFullTimeStd(students,i);
					
					
					
					
					//submit=true;		
					
					
					
				}
						
				else if (typeOfStudie=="Part time Student") {
					
					PartTimeStd newPartStd= new PartTimeStd(name,Surname,Field_Of_Studie,typeOfStudie,Adresse,i);
					frameStd.dispose();
					newPartStd.windowInputPartTimeStd(students,i);
			
					
					
					
					
				}
						
				else if (typeOfStudie=="Erasmus Student") {
					ErasmusStd newErasmusStd= new ErasmusStd(name,Surname,Field_Of_Studie,typeOfStudie,Adresse,i);
					frameStd.dispose();
					newErasmusStd.windowInputErasmusStd(students,i);
					
					
					}
				
				
				
			}
		});
		
		
	}
public void informationFrame() {
		
		JFrame informationFrame=new JFrame();
		informationFrame.setTitle("Student"); // set the title of the window
		informationFrame.setSize(960,540);
		informationFrame.setLayout(new GridLayout(0,2));
		
		
		informationFrame.add(new JLabel("Id : "+id_Student));
		informationFrame.add(new JLabel("Name : "+name));
		informationFrame.add(new JLabel("Surname : "+ Surname));
		informationFrame.add(new JLabel("Field of Studies : "+Field_Of_Studie));
		informationFrame.add(new JLabel("Type of Studies : "+typeOfStudie));
		informationFrame.add(new JLabel("Adresse : " +Adresse.toString()));
		informationFrame.add(new JLabel("Type of Studies : "+typeOfStudie));
		
		
		
		informationFrame.setVisible(true);
		
	}
}
