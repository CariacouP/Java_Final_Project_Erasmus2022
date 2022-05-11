package Hierarchie;

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
		frameErasmusTStd.setLayout(new GridLayout(0,2));
		

		
		cb_level= new JComboBox<String>();
		cb_level.addItem("1");
		cb_level.addItem("2");
		cb_level.addItem("3");
		cb_level.addItem("4");
		cb_level.addItem("5");
		cb_level.addItem("6");
		cb_level.addItem("7");
		cb_level.addItem("8");
		
		//PNumber.setLayout(new GridLayout(6,1));
		PNumber.removeAll();
		PNumber.add(new JLabel("Number :"));			
		PNumber.add(tf_Number=new JTextField(10));
		
		//PStreet.setLayout(new GridLayout(6,2));
		PStreet.removeAll();
		PStreet.add(new JLabel("Street :"));			
		PStreet.add(tf_Street=new JTextField(10));			
		
		//PTown.setLayout(new GridLayout(7,1));
		PTown.removeAll();
		PTown.add(new JLabel("Town :"));
		PTown.add(tf_Town=new JTextField(10));
		
		//PZipCode.setLayout(new GridLayout(7,2))
		PZipCode.removeAll();
		PZipCode.add(new JLabel("Zip Code :"));
		PZipCode.add(tf_ZipCode=new JTextField(10));
		
		//PCountry.setLayout(new GridLayout(7,3));
		PCountry.removeAll();
		PCountry.add(new JLabel("Country :"));
		PCountry.add(tf_Country=new JTextField(10));
		
		PAdress.removeAll();
		PAdress.add(new JLabel("Adress :"));
		PAdress.add(PNumber);
		PAdress.add(PStreet);
		PAdress.add(PTown);
		PAdress.add(PZipCode);
		PAdress.add(PCountry);
		
		PLevelOfStudie.removeAll();
		PLevelOfStudie.add(new JLabel("year of Studie : "));
		PLevelOfStudie.add(cb_level);
		
		PMajor.removeAll();
		PMajor.add(new JLabel("Major : "));
		PMajor.add(tf_Major=new JTextField(10));
		
		PMinor1.removeAll();
		PMinor1.add(new JLabel("Minor 1 : "));
		PMinor1.add(tf_Minor1=new JTextField(10));
		
		PMinor2.removeAll();
		PMinor2.add(new JLabel("Minor 2 : "));
		PMinor2.add(tf_Minor2=new JTextField(10));
		
		PReferalProf.removeAll();
		PReferalProf.add(new JLabel("Refferal Prof : "));
		PReferalProf.add(tf_ReferalProf=new JTextField(10));
		
		PavgGrade.removeAll();
		PavgGrade.add(new JLabel("Average Grade"));
		PavgGrade.add(tf_AvgGrade=new JTextField(10));
		
		PUnivversityOfOrigin.removeAll();
		PUnivversityOfOrigin.add(new JLabel("University of origin: "));
		PUnivversityOfOrigin.add(tf_University_Of_Origin=new JTextField(10));
		
		PCountryOfOrigin.removeAll();
		PCountryOfOrigin.add(new JLabel("Country of origin: "));
		PCountryOfOrigin.add(tf_Country_Of_Origin=new JTextField(10));
		
		bn_addSubmit = new JButton("Submit");
		
		PButtonSubmit.removeAll();
		PButtonSubmit.add(bn_addSubmit);
		
		
		
		PanelErasmusTimeStudent.add(PLevelOfStudie);
		PanelErasmusTimeStudent.add(PMajor);
		PanelErasmusTimeStudent.add(PMinor1);
		PanelErasmusTimeStudent.add(PMinor2);
		PanelErasmusTimeStudent.add(PReferalProf);
		PanelErasmusTimeStudent.add(PavgGrade);
		PanelErasmusTimeStudent.add(PUnivversityOfOrigin);
		PanelErasmusTimeStudent.add(PCountryOfOrigin);
		
		PanelErasmusTimeStudent.add(PAdress);
		
		PanelErasmusTimeStudent.add(PButtonSubmit);
		
		
	}
	
void windowInputErasmusStd(Student[] students, int i) {
		
		windowBUilder();
		
		
		frameErasmusTStd.add(PanelErasmusTimeStudent);
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

	
	
	
	
	
}
