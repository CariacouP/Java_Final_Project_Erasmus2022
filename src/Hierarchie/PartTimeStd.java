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

public class PartTimeStd extends Student{
	
	
	JFrame framePartTimeTStd =new JFrame();
	int NumberOfHours;
	int levelOfStudie;
	String Major;
	String Minor1;
	String Minor2;
	String ReferalProf;
	float avgGrade;
	boolean submitPart=false;
	
	
	static JPanel PLevelOfStudie = new JPanel();
	static JPanel PNumberOfHours = new JPanel();
	static JPanel PMajor = new JPanel();
	static JPanel PMinor1 = new JPanel();
	static JPanel PMinor2 = new JPanel();
	static JPanel PReferalProf = new JPanel();
	static JPanel PavgGrade = new JPanel();
	static JPanel PanelPartTimeStudent = new JPanel();
	static JPanel PButtonSubmit=new JPanel();
	
	JTextField tf_number_of_Hours;
	JTextField tf_Major;
	JTextField tf_Minor1;
	JTextField tf_Minor2;
	JTextField tf_ReferalProf;
	JTextField tf_AvgGrade;
	
	JComboBox<String> cb_level;  //pour récupérer en string int recupVal = Integer.parseInt((String)myComboBox.getSelectedItem())
	JButton bn_addSubmit ;
	 
	/**
	 * 
	 */
	public PartTimeStd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nameGiven
	 * @param surnameGiven
	 * @param field_Of_StudieGiven
	 * @param adresse
	 * @param id_StudentGiven
	 */
	public PartTimeStd(String nameGiven, String surnameGiven, String field_Of_StudieGiven,String typeOfStudie, Hierarchie.Adresse adresse,
			int id_StudentGiven) {
		super(nameGiven, surnameGiven, field_Of_StudieGiven,typeOfStudie, adresse, id_StudentGiven);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nameGiven
	 * @param surnameGiven
	 * @param field_Of_StudieGiven
	 * @param adresse
	 * @param id_StudentGiven
	 * @param avgGrade2 
	 * @param referalProf2 
	 * @param minor22 
	 * @param minor12 
	 * @param major2 
	 * @param levelOfStudie2 
	 */
	public PartTimeStd(String nameGiven, String surnameGiven, String field_Of_StudieGiven,String typeOfStudie, Hierarchie.Adresse adresse,
			int id_StudentGiven, int levelOfStudie2, String major2, String minor12, String minor22, String referalProf2, float avgGrade2) {
		super(nameGiven, surnameGiven, field_Of_StudieGiven,typeOfStudie, adresse, id_StudentGiven);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the numberOfHours
	 */
	public int getNumberOfHours() {
		return NumberOfHours;
	}

	/**
	 * @param numberOfHours the numberOfHours to set
	 */
	public void setNumberOfHours(int numberOfHours) {
		NumberOfHours = numberOfHours;
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

	@Override
	public String toString() {
		return "id : "+ id_Student+"name: "+this.name+" Surname : " +this.Surname + " Field of Studies: "+ this.Field_Of_Studie+" Adresse : "+ this.Adresse.toString()+ 
				"Level of Studie : "+ this.levelOfStudie+" Number of hours : "+ this.NumberOfHours + " Major: "+ this.Major+ "Minor 1 :"+this.Minor1+" Minor 2 "+this.Minor2+"Referal professor : "+this.ReferalProf+ " Average Grade : "+this.avgGrade;
	}
	
	

	@Override
	void windowBUilder() {
		framePartTimeTStd.setTitle("Student"); // set the title of the window
		framePartTimeTStd.setSize(960,540); //set the x-dimension and the y-dimension of the this
		Image icon = Toolkit.getDefaultToolkit().getImage("ressources/Logo S.png"); // create an image icon
		framePartTimeTStd.setIconImage(icon); // replace the standard icon of the window
		framePartTimeTStd.setLayout(new GridLayout(0,2));
		
		PLevelOfStudie.removeAll();
		PMajor.removeAll();
		PMinor1.removeAll();
		PMinor2.removeAll();
		PReferalProf.removeAll();
		PavgGrade.removeAll();
		PButtonSubmit.removeAll();
		PNumberOfHours.removeAll();

		
		
		
		
		cb_level= new JComboBox<String>();
		cb_level.addItem("1");
		cb_level.addItem("2");
		cb_level.addItem("3");
		cb_level.addItem("4");
		cb_level.addItem("5");
		cb_level.addItem("6");
		cb_level.addItem("7");
		cb_level.addItem("8");
		
		PLevelOfStudie.add(new JLabel("year of Studie : "));
		PLevelOfStudie.add(cb_level);
		
		PNumberOfHours.add(new JLabel("Number of Hours : "));
		PNumberOfHours.add(tf_number_of_Hours=new JTextField(10));
		
		PMajor.add(new JLabel("Major : "));
		PMajor.add(tf_Major=new JTextField(10));
		
		PMinor1.add(new JLabel("Minor 1 : "));
		PMinor1.add(tf_Minor1=new JTextField(10));
		
		PMinor2.add(new JLabel("Minor 2 : "));
		PMinor2.add(tf_Minor2=new JTextField(10));
		
		PReferalProf.add(new JLabel("Refferal Prof : "));
		PReferalProf.add(tf_ReferalProf=new JTextField(10));
		
		PavgGrade.add(new JLabel("Average Grade"));
		PavgGrade.add(tf_AvgGrade=new JTextField(10));
		
		bn_addSubmit = new JButton("Submit");
		PButtonSubmit.add(bn_addSubmit);
		
		
		PanelPartTimeStudent.add(PNumberOfHours);
		PanelPartTimeStudent.add(PLevelOfStudie);
		PanelPartTimeStudent.add(PMajor);
		PanelPartTimeStudent.add(PMinor1);
		PanelPartTimeStudent.add(PMinor2);
		PanelPartTimeStudent.add(PReferalProf);
		PanelPartTimeStudent.add(PavgGrade);
		PanelPartTimeStudent.add(PButtonSubmit);
		
		
	}
	public void windowInputPartTimeStd(Student[] students,int i){
		
		
		
		//frameStd.remove(Student.PanelStudent);
		
		windowBUilder();
		
		framePartTimeTStd.add(PanelPartTimeStudent);
		framePartTimeTStd.setVisible(true);
		
		bn_addSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int levelOfStudieGiven ; // betwen 1 and 5
				int numberOfHoursGiven;
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
				
				try {
					numberOfHoursGiven=Integer.parseInt(tf_number_of_Hours.getText());
				}
				catch(Exception exeption) {
					numberOfHoursGiven = 0;
				}
				
			
				NumberOfHours=numberOfHoursGiven;
				levelOfStudie=levelOfStudieGiven; // betwen 1 and 5
				Major=MajorGiven;
				Minor1=Minor1Given;
				Minor2=Minor2Given;
				ReferalProf=ReferalProfGiven;
				avgGrade=avgGradeGiven;
				
				
				submitPart=true;
				students[i]= new PartTimeStd(  name,  Surname,  Field_Of_Studie,typeOfStudie,Adresse,
						 id_Student,  levelOfStudie,  Major,  Minor1,  Minor2,  ReferalProf,  avgGrade);
		
				mainWindowBuilder(students,i+1);
				framePartTimeTStd.dispose();
				
				
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
		
		informationFrame.add(new JLabel("YNumber of hour per week : "+NumberOfHours));
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
