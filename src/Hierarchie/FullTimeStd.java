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

public class FullTimeStd extends Student {
	
	
	JFrame frameFullTStd =new JFrame();
	int levelOfStudie; // betwen 1 and 5
	String Major;
	String Minor1;
	String Minor2;
	String ReferalProf;
	Float avgGrade;
	boolean submitFull=false;
	boolean firstTimestd=true;
	
	static JPanel PTitleFullTimeStd = new JPanel();
	static JPanel PLevelOfStudie = new JPanel();
	static JPanel PMajor = new JPanel();
	static JPanel PMinor1 = new JPanel();
	static JPanel PMinor2 = new JPanel();
	static JPanel PReferalProf = new JPanel();
	static JPanel PavgGrade = new JPanel();
	static JPanel PanelFullTimeStudent = new JPanel();
	static JPanel PButtonSubmit=new JPanel();
	
	JTextField tf_Major;
	JTextField tf_Minor1;
	JTextField tf_Minor2;
	JTextField tf_ReferalProf;
	JTextField tf_AvgGrade;
	
	JComboBox<String> cb_level;  //pour récupérer en string int recupVal = Integer.parseInt((String)myComboBox.getSelectedItem())
	JButton bn_addSubmit ;
	
	
	public FullTimeStd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FullTimeStd(String name, String surname, String field_Of_Studie,String typeOfStudie, Hierarchie.Adresse adresse,
			int id_Student) {
		super(name, surname, field_Of_Studie,typeOfStudie, adresse, id_Student);
		// TODO Auto-generated constructor stub
	}
	
	public FullTimeStd(String name, String surname, String field_Of_Studie,String typeOfStudie, Hierarchie.Adresse adresse, int id_Student,
			int levelOfStudie, String major, String minor1, String minor2, String referalProf, Float avgGrade) {
		super(name, surname, field_Of_Studie,typeOfStudie, adresse, id_Student);
		this.levelOfStudie = levelOfStudie;
		Major = major;
		Minor1 = minor1;
		Minor2 = minor2;
		ReferalProf = referalProf;
		this.avgGrade = avgGrade;
	}
	
	public FullTimeStd(int levelOfStudie, String major, String minor1, String minor2, String referalProf,
			Float avgGrade) {
		super();
		this.levelOfStudie = levelOfStudie;
		Major = major;
		Minor1 = minor1;
		Minor2 = minor2;
		ReferalProf = referalProf;
		this.avgGrade = avgGrade;
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
	public Float getAvgGrade() {
		return avgGrade;
	}
	/**
	 * @param avgGrade the avgGrade to set
	 */
	public void setAvgGrade(Float avgGrade) {
		this.avgGrade = avgGrade;
	}
	
	@Override
	public String toString() {
		return "id : "+ id_Student+"name: "+this.name+" Surname : " +this.Surname + " Field of Studies: "+ this.Field_Of_Studie+" Adresse : "+ this.Adresse.toString()+ 
				" Level od Studie"+ this.levelOfStudie + " Major: "+ this.Major+ "Minor 1 :"+this.Minor1+" Minor 2 "+this.Minor2+"Referal professor : "+this.ReferalProf+ " Average Grade : "+this.avgGrade;
	}
	
	@Override
	void windowBUilder() {
		frameFullTStd.setTitle("Student"); // set the title of the window
		frameFullTStd.setSize(960,540); //set the x-dimension and the y-dimension of the this
		Image icon = Toolkit.getDefaultToolkit().getImage("ressources/Logo S.png"); // create an image icon
		frameFullTStd.setIconImage(icon); // replace the standard icon of the window
		frameFullTStd.setLayout(new GridLayout(8,1));
		
		
		PTitleFullTimeStd.removeAll();
		PLevelOfStudie.removeAll();
		PMajor.removeAll();
		PMinor1.removeAll();
		PMinor2.removeAll();
		PReferalProf.removeAll();
		PavgGrade.removeAll();
		PButtonSubmit.removeAll();
	
		
		PTitleFullTimeStd.add(new JLabel("Complete Full time student information"));
		PTitleFullTimeStd.add(new JLabel());
		PTitleFullTimeStd.setBackground(Color.WHITE);
		
		cb_level= new JComboBox<String>();
		cb_level.addItem("1");
		cb_level.addItem("2");
		cb_level.addItem("3");
		cb_level.addItem("4");
		cb_level.addItem("5");
		cb_level.addItem("6");
		cb_level.addItem("7");
		cb_level.addItem("8");
		
		PLevelOfStudie.add(new JLabel("Year of study :  "));
		PLevelOfStudie.add(cb_level);
		PLevelOfStudie.setBackground(Color.WHITE);
		
		PMajor.add(new JLabel("Major :"));
		PMajor.add(tf_Major=new JTextField(16));
		PMajor.setBackground(Color.WHITE);
		
		PMinor1.add(new JLabel("Minor 1 : "));
		PMinor1.add(tf_Minor1=new JTextField(15));
		PMinor1.setBackground(Color.WHITE);
		
		PMinor2.add(new JLabel("Minor 2 : "));
		PMinor2.add(tf_Minor2=new JTextField(15));
		PMinor2.setBackground(Color.WHITE);
		
		PReferalProf.add(new JLabel("Refferal Prof :  "));
		PReferalProf.add(tf_ReferalProf=new JTextField(12));
		PReferalProf.setBackground(Color.WHITE);
		
		PavgGrade.add(new JLabel("Average Grade :  "));
		PavgGrade.add(tf_AvgGrade=new JTextField(11));
		PavgGrade.setBackground(Color.WHITE);
		
		bn_addSubmit = new JButton("Submit");
		bn_addSubmit.setForeground(Color.WHITE);
		bn_addSubmit.setBackground(new Color(66,133,244));
		bn_addSubmit.setPreferredSize(new Dimension(224,20));
		PButtonSubmit.setBackground(Color.WHITE);
		PButtonSubmit.add(bn_addSubmit);
		
		
		frameFullTStd.add(PTitleFullTimeStd);
		frameFullTStd.add(PLevelOfStudie);
		frameFullTStd.add(PMajor);
		frameFullTStd.add(PMinor1);
		frameFullTStd.add(PMinor2);
		frameFullTStd.add(PReferalProf);
		frameFullTStd.add(PavgGrade);
		frameFullTStd.add(PButtonSubmit);
		
		
	}
	public void windowInputFullTimeStd(Student[] students, int i ){
		
		
		
		//remove(Student.PanelStudent);
		
		windowBUilder();
		
		frameFullTStd.setResizable(false); // prevent this from being resize
		frameFullTStd.getContentPane().setBackground(new Color(255,255,255)); //change the color of the background
		frameFullTStd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameFullTStd.setVisible(true);
		
		bn_addSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int levelOfStudieGiven ; // betwen 1 and 5
				String MajorGiven ;
				String Minor1Given;
				String Minor2Given;
				String ReferalProfGiven;
				Float avgGradeGiven;
				
				
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
				
				levelOfStudie=levelOfStudieGiven; // between 1 and 5
				Major=MajorGiven;
				Minor1=Minor1Given;
				Minor2=Minor2Given;
				ReferalProf=ReferalProfGiven;
				avgGrade=avgGradeGiven;
		
				
				submitFull=true;
				students[i]= new FullTimeStd( name,  Surname,  Field_Of_Studie,typeOfStudie, Adresse,  i,
						 levelOfStudie,  Major,  Minor1,  Minor2,  ReferalProf,  avgGrade);
				
				mainWindowBuilder(students,i+1);
				frameFullTStd.dispose();
				
				
				
				
				
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
		
		informationFrame.setVisible(true);
		
	}
}
