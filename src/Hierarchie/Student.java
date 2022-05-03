package Hierarchie;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Student extends main_StudentH{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	
	public Student(String nameGiven, String surnameGiven, String field_Of_StudieGiven, Hierarchie.Adresse adresse, int id_StudentGiven) {
		super();
		name = nameGiven;
		Surname = surnameGiven;
		Field_Of_Studie = field_Of_StudieGiven;
		Adresse = adresse;
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
		return "name: "+name+" Surname : " +Surname + " Field of Studies: "+ Field_Of_Studie+" Adresse : "+ Adresse.toString() +" tyoe of Studies : "+ typeOfStudie;
	}
	
	void windowBUilder() {
		this.setSize(700,700);
		this.setLayout(new GridLayout(0,2));
		
		//PTitle.setLayout(new GridLayout(1,1));
		PTitle.add(new JLabel("Student :"));
		PTitle.add( new JLabel());
		
		//PName.setLayout(new GridLayout(2,1));
		PName.add(new JLabel("Name :"));		
		PName.add(tf_name=new JTextField(10));
		
		//PSurname.setLayout(new GridLayout(3,1));
		PSurname.add(new JLabel("Surname :"));			
		PSurname.add(tf_Surname=new JTextField(10));
		
		//PField_Of_Studie.setLayout(new GridLayout(4,1));
		PField_Of_Studie.add(new JLabel("Field of studies"));			
		PField_Of_Studie.add(tf_Field_of_Studie=new JTextField(10));
		
		//PAdress.setLayout(new GridLayout(5,1));
		PAdress.add(new JLabel("Adress :"));
		PAdress.add(new JLabel());
		
		
		//PNumber.setLayout(new GridLayout(6,1));
		PNumber.add(new JLabel("Number :"));			
		PNumber.add(tf_Number=new JTextField(10));
		
		//PStreet.setLayout(new GridLayout(6,2));
		PStreet.add(new JLabel("Street :"));			
		PStreet.add(tf_Street=new JTextField(10));			
		
		//PTown.setLayout(new GridLayout(7,1));
		PTown.add(new JLabel("Town :"));
		PTown.add(tf_Town=new JTextField(10));
		
		//PZipCode.setLayout(new GridLayout(7,2));
		PZipCode.add(new JLabel("Zip Code :"));
		PZipCode.add(tf_ZipCode=new JTextField(10));
		
		//PCountry.setLayout(new GridLayout(7,3));
		PCountry.add(new JLabel("Country :"));
		PCountry.add(tf_Country=new JTextField(10));
		
		//PTypeStd.setLayout(new GridLayout(8,1));
		PTypeStd.add(new JLabel("Type student :"));
		
		cb_Type_Studie = new JComboBox<String>();
		cb_Type_Studie.addItem("Full time student");
		cb_Type_Studie.addItem("Part time Student");
		cb_Type_Studie.addItem("Erasmus Student");
		PTypeStd.add(cb_Type_Studie);
		
		bn_addStd = new JButton("Next");
		PButton.add(bn_addStd);

		
		PanelStudent.add(PTitle);
		PanelStudent.add(PName);
		PanelStudent.add(PSurname);
		PanelStudent.add(PField_Of_Studie);
		PanelStudent.add(PAdress);
		PanelStudent.add(PNumber);
		PanelStudent.add(PStreet);
		PanelStudent.add(PTown);
		PanelStudent.add(PZipCode);
		PanelStudent.add(PCountry);
		PanelStudent.add(PTypeStd);
		PanelStudent.add(PButton);
	}
	
	void windowInputDataStudent() {
		
		windowBUilder();
		
		
		add(PanelStudent);
		
		
		setVisible(true);
		
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
				submit=true;
				
			}
		});
		
		while (submit==false) {
			System.out.print("");
		}
		
		
	}

}
