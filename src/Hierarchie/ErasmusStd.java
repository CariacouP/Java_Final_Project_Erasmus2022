package Hierarchie;

import java.awt.Color;
import java.awt.Dimension;
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

public class ErasmusStd extends Student
{	
	JFrame frameErasmusTStd =new JFrame();
	
	int levelOfStudie; // betwen 1 and 5
	String Major;
	String Minor1;
	String Minor2;
	String ReferalProf;
	float avgGrade;
	Adresse localAdresse;
	String UnivversityOfOrigin;
	String CountryOfOrigin;
	boolean submitErasmus=false;
	
	static JPanel PTitleErasmusStd = new JPanel();
	static JPanel PLevelOfStudie = new JPanel();
	static JPanel PMajor = new JPanel();
	static JPanel PMinor1 = new JPanel();
	static JPanel PMinor2 = new JPanel();
	static JPanel PReferalProf = new JPanel();
	static JPanel PavgGrade = new JPanel();
	static JPanel PAdress =new JPanel();
	
	static JPanel PNumber=new JPanel();
	static JPanel PStreet=new JPanel();
	static JPanel PTown=new JPanel();
	static JPanel PZipCode=new JPanel();
	static JPanel PCountry=new JPanel();
	
	static JPanel PUnivversityOfOrigin =new JPanel();
	static JPanel PCountryOfOrigin =new JPanel();
	static JPanel PanelErasmusTimeStudent = new JPanel();
	static JPanel PButtonSubmit=new JPanel();
	
	JTextField tf_Major;
	JTextField tf_Minor1;
	JTextField tf_Minor2;
	JTextField tf_ReferalProf;
	JTextField tf_AvgGrade;
	
	JTextField tf_Number;
	JTextField tf_Street;
	JTextField tf_Town;
	JTextField tf_ZipCode;
	JTextField tf_Country;
	
	JTextField tf_University_Of_Origin;
	JTextField tf_Country_Of_Origin;
	
	
	JComboBox<String> cb_level;  //pour récupérer en string int recupVal = Integer.parseInt((String)myComboBox.getSelectedItem())
	JButton bn_addSubmit ;
	

	
	
	public ErasmusStd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ErasmusStd(String name, String surname, String field_Of_Studie,String typeOfStudie ,Hierarchie.Adresse adresse, int id_Student) {
		super(name, surname, field_Of_Studie,typeOfStudie, adresse, id_Student);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param nameGiven
	 * @param surnameGiven
	 * @param field_Of_StudieGiven
	 * @param adresse
	 * @param id_StudentGiven
	 * @param frameErasmusTStd
	 * @param levelOfStudie
	 * @param major
	 * @param minor1
	 * @param minor2
	 * @param referalProf
	 * @param avgGrade
	 * @param localAdresse
	 * @param univversityOfOrigin
	 * @param countryOfOrigin
	 */
	public ErasmusStd(String nameGiven, String surnameGiven, String field_Of_StudieGiven,String typeOfStudie, Hierarchie.Adresse adresse,
			int id_StudentGiven, int levelOfStudie, String major, String minor1, String minor2,
			String referalProf, float avgGrade, Hierarchie.Adresse localAdresse, String univversityOfOrigin,
			String countryOfOrigin) {
		super(nameGiven, surnameGiven, field_Of_StudieGiven,typeOfStudie, adresse, id_StudentGiven);
		
		this.levelOfStudie = levelOfStudie;
		Major = major;
		Minor1 = minor1;
		Minor2 = minor2;
		ReferalProf = referalProf;
		this.avgGrade = avgGrade;
		this.localAdresse = localAdresse;
		UnivversityOfOrigin = univversityOfOrigin;
		CountryOfOrigin = countryOfOrigin;
	}

	/**
	 * @return the levelOfStudie
	 */
	public int getLevelOfStudie() {
		return levelOfStudie;
	}

	/**
	 * @param levelOfStudie the levelOfStudie to set
	 */
	public void setLevelOfStudie(int levelOfStudie) {
		this.levelOfStudie = levelOfStudie;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return Major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		Major = major;
	}

	/**
	 * @return the minor1
	 */
	public String getMinor1() {
		return Minor1;
	}

	/**
	 * @param minor1 the minor1 to set
	 */
	public void setMinor1(String minor1) {
		Minor1 = minor1;
	}

	/**
	 * @return the minor2
	 */
	public String getMinor2() {
		return Minor2;
	}

	/**
	 * @param minor2 the minor2 to set
	 */
	public void setMinor2(String minor2) {
		Minor2 = minor2;
	}

	/**
	 * @return the referalProf
	 */
	public String getReferalProf() {
		return ReferalProf;
	}

	/**
	 * @param referalProf the referalProf to set
	 */
	public void setReferalProf(String referalProf) {
		ReferalProf = referalProf;
	}

	/**
	 * @return the avgGrade
	 */
	public float getAvgGrade() {
		return avgGrade;
	}

	/**
	 * @param avgGrade the avgGrade to set
	 */
	public void setAvgGrade(float avgGrade) {
		this.avgGrade = avgGrade;
	}

	/**
	 * @return the localAdresse
	 */
	public Adresse getLocalAdresse() {
		return localAdresse;
	}

	/**
	 * @param localAdresse the localAdresse to set
	 */
	public void setLocalAdresse(Adresse localAdresse) {
		this.localAdresse = localAdresse;
	}

	/**
	 * @return the univversityOfOrigin
	 */
	public String getUnivversityOfOrigin() {
		return UnivversityOfOrigin;
	}

	/**
	 * @param univversityOfOrigin the univversityOfOrigin to set
	 */
	public void setUnivversityOfOrigin(String univversityOfOrigin) {
		UnivversityOfOrigin = univversityOfOrigin;
	}

	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return CountryOfOrigin;
	}

	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		CountryOfOrigin = countryOfOrigin;
	}
	
	@Override
	public String toString() {
		return "id : "+ id_Student+"name: "+this.name+" Surname : " +this.Surname + " Field of Studies: "+ this.Field_Of_Studie+" Adresse : "+ this.Adresse.toString()+ 
				" Level od Studie"+ this.levelOfStudie + " Major: "+ this.Major+ "Minor 1 :"+this.Minor1+" Minor 2 "+this.Minor2+
				"Referal professor : "+this.ReferalProf+ " Average Grade : "+this.avgGrade +" Local Adress : "+localAdresse + 
				"University of Origin : " +UnivversityOfOrigin+ "Country of Origin : "+ CountryOfOrigin ;
	}
	
	@Override
	void windowBUilder() {
		
		
		
		frameErasmusTStd.setTitle("Student"); // set the title of the window
		frameErasmusTStd.setSize(960,540); //set the x-dimension and the y-dimension of the this
		Image icon = Toolkit.getDefaultToolkit().getImage("ressources/Logo S.png"); // create an image icon
		frameErasmusTStd.setIconImage(icon); // replace the standard icon of the window
		frameErasmusTStd.setLayout(new GridLayout(16,1));
		
		PTitleErasmusStd.removeAll();
		PNumber.removeAll();
		PStreet.removeAll();
		PTown.removeAll();
		PZipCode.removeAll();
		PCountry.removeAll();
		PAdress.removeAll();
		PLevelOfStudie.removeAll();
		PMajor.removeAll();
		PMinor1.removeAll();
		PMinor2.removeAll();
		PReferalProf.removeAll();
		PavgGrade.removeAll();
		PUnivversityOfOrigin.removeAll();
		PCountryOfOrigin.removeAll();
		PButtonSubmit.removeAll();
		
		cb_level= new JComboBox<String>();
		cb_level.addItem("1");
		cb_level.addItem("2");
		cb_level.addItem("3");
		cb_level.addItem("4");
		cb_level.addItem("5");
		cb_level.addItem("6");
		cb_level.addItem("7");
		cb_level.addItem("8");
		
		PTitleErasmusStd.add(new JLabel("Complete Erasmus student information"));
		PTitleErasmusStd.add(new JLabel());
		PTitleErasmusStd.setBackground(Color.WHITE);
		
		PLevelOfStudie.add(new JLabel("Year of study : "));
		PLevelOfStudie.add(cb_level);
		PLevelOfStudie.setBackground(Color.WHITE);
		
		PMajor.add(new JLabel("Major : "));
		PMajor.add(tf_Major=new JTextField(16));
		PMajor.setBackground(Color.WHITE);
		
		PMinor1.add(new JLabel("Minor 1 :  "));
		PMinor1.add(tf_Minor1=new JTextField(15));
		PMinor1.setBackground(Color.WHITE);
		
		PMinor2.add(new JLabel("Minor 2 :  "));
		PMinor2.add(tf_Minor2=new JTextField(15));
		PMinor2.setBackground(Color.WHITE);
		
		PReferalProf.add(new JLabel("Refferal Prof :   "));
		PReferalProf.add(tf_ReferalProf=new JTextField(12));
		PReferalProf.setBackground(Color.WHITE);
		
		PavgGrade.add(new JLabel("Average Grade :   "));
		PavgGrade.add(tf_AvgGrade=new JTextField(11));
		PavgGrade.setBackground(Color.WHITE);
		
		PUnivversityOfOrigin.add(new JLabel("University of origin :   "));
		PUnivversityOfOrigin.add(tf_University_Of_Origin=new JTextField(9));
		PUnivversityOfOrigin.setBackground(Color.WHITE);
		
		PCountryOfOrigin.add(new JLabel("Country of origin :"));
		PCountryOfOrigin.add(tf_Country_Of_Origin=new JTextField(11));
		PCountryOfOrigin.setBackground(Color.WHITE);
		
		PAdress.add(new JLabel("School Adress :                                             "));
		PAdress.add(new JLabel());
		PAdress.setBackground(Color.WHITE);
		
		PNumber.add(new JLabel("Number : "));			
		PNumber.add(tf_Number=new JTextField(15));
		PNumber.setBackground(Color.WHITE);
		
		PStreet.add(new JLabel("Street :"));			
		PStreet.add(tf_Street=new JTextField(16));	
		PStreet.setBackground(Color.WHITE);
		
		PTown.add(new JLabel("Town : "));
		PTown.add(tf_Town=new JTextField(16));
		PTown.setBackground(Color.WHITE);
		
		PZipCode.add(new JLabel("Zip Code :  "));
		PZipCode.add(tf_ZipCode=new JTextField(14));
		PZipCode.setBackground(Color.WHITE);
		
		PCountry.add(new JLabel("Country :"));
		PCountry.add(tf_Country=new JTextField(15));
		PCountry.setBackground(Color.WHITE);
		
		bn_addSubmit = new JButton("Submit");
		bn_addSubmit.setForeground(Color.WHITE);
		bn_addSubmit.setBackground(new Color(66,133,244));
		bn_addSubmit.setPreferredSize(new Dimension(224,20));
		PButtonSubmit.setBackground(Color.WHITE);
		PButtonSubmit.add(bn_addSubmit);
		
		
		frameErasmusTStd.add(PTitleErasmusStd);
		frameErasmusTStd.add(PLevelOfStudie);
		frameErasmusTStd.add(PMajor);
		frameErasmusTStd.add(PMinor1);
		frameErasmusTStd.add(PMinor2);
		frameErasmusTStd.add(PReferalProf);
		frameErasmusTStd.add(PavgGrade);
		frameErasmusTStd.add(PUnivversityOfOrigin);
		frameErasmusTStd.add(PCountryOfOrigin);
		
		frameErasmusTStd.add(PAdress);
		frameErasmusTStd.add(PNumber);
		frameErasmusTStd.add(PStreet);
		frameErasmusTStd.add(PTown);
		frameErasmusTStd.add(PZipCode);
		frameErasmusTStd.add(PCountry);
		frameErasmusTStd.add(PButtonSubmit);
		
		
	}
	
void windowInputErasmusStd(Student[] students, int i) {
		
		windowBUilder();
		frameErasmusTStd.setResizable(false); // prevent this from being resize
		frameErasmusTStd.getContentPane().setBackground(new Color(255,255,255)); //change the color of the background
		frameErasmusTStd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frameErasmusTStd.setVisible(true);
		
		bn_addSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int levelOfStudieGiven ; // betwen 1 and 5
				String MajorGiven ;
				String Minor1Given;
				String Minor2Given;
				String ReferalProfGiven;
				Float avgGradeGiven;
				Adresse localAdressOGiven;
				String UniversityOriginGiven;
				String CountryOriginGiven;
				
				try{
					levelOfStudieGiven = Integer.parseInt((String)cb_level.getSelectedItem());
				}
				catch(Exception exeption){
					levelOfStudieGiven= 0;
				}
				try {
					MajorGiven=tf_Major.getText();
				}
				catch(Exception exeption) {
					MajorGiven="Error";
				}
				try {
					Minor1Given = tf_Minor1.getText();
				}
				catch(Exception exeption) {
					Minor1Given="Error";
				}
				try {
					Minor2Given= tf_Minor2.getText();
				}
				catch(Exception exeption) {
					Minor2Given="Error";
				}
				try {
					ReferalProfGiven= tf_ReferalProf.getText();
				}
				catch(Exception exeption) {
					ReferalProfGiven="Error";
				}
				try {
					avgGradeGiven=Float.valueOf(tf_AvgGrade.getText());
				}
				catch(Exception exeption) {
					avgGradeGiven = (float) 0.0;
				}
				
				try {
					localAdressOGiven = new Adresse(tf_Number.getText(),tf_Street.getText(),tf_Town.getText(),tf_ZipCode.getText(),tf_Country.getText());
				}
				catch(Exception exeption) {
					localAdressOGiven = null;
				}
				try {
					UniversityOriginGiven=tf_University_Of_Origin.getText();
				}
				catch(Exception exeption) {
					UniversityOriginGiven = "error";
				}
				try {
					CountryOriginGiven=tf_Country_Of_Origin.getText();
				}
				catch(Exception exeption) {
					CountryOriginGiven = "error";
				}
				
				
				
				levelOfStudie=levelOfStudieGiven; // betwen 1 and 5
				Major=MajorGiven;
				Minor1=Minor1Given;
				Minor2=Minor2Given;
				ReferalProf=ReferalProfGiven;
				avgGrade=avgGradeGiven;
				submitErasmus=true;
				localAdresse=localAdressOGiven;
				UnivversityOfOrigin=UniversityOriginGiven;
				CountryOfOrigin=CountryOriginGiven;
				
				
				
				
				students[i]= new ErasmusStd(  name,  Surname,  Field_Of_Studie,typeOfStudie,Adresse,
						 id_Student,  levelOfStudie,  Major,  Minor1,  Minor2,  ReferalProf,  avgGrade,localAdresse,UnivversityOfOrigin,CountryOfOrigin);
				
				
				
				
				mainWindowBuilder(students,i+1);
				frameErasmusTStd.dispose();
				
				
			}
		});
		
		
	}

	@Override
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
		
		
		informationFrame.add(new JLabel("Year of Study : "+levelOfStudie));
		informationFrame.add(new JLabel("Major : "+ Major));
		informationFrame.add(new JLabel("First Minor : "+Minor1));
		informationFrame.add(new JLabel("Second Minor : "+Minor2));
		informationFrame.add(new JLabel("Second Minor : "+Minor2));
		informationFrame.add(new JLabel("Referal Teacher : "+ReferalProf));
		informationFrame.add(new JLabel("Average Grade : "+avgGrade));
		informationFrame.add(new JLabel("Local Adresse : "+localAdresse));
		informationFrame.add(new JLabel("University of Origin : "+UnivversityOfOrigin));
		informationFrame.add(new JLabel("Country of Origin: "+CountryOfOrigin));
		
		
		informationFrame.setVisible(true);
		
}
	
	
	
}
