package Hierarchie;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PartTimeStd extends Student{
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
	public PartTimeStd(String nameGiven, String surnameGiven, String field_Of_StudieGiven, Hierarchie.Adresse adresse,
			int id_StudentGiven) {
		super(nameGiven, surnameGiven, field_Of_StudieGiven, adresse, id_StudentGiven);
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
		return "name: "+this.name+" Surname : " +this.Surname + " Field of Studies: "+ this.Field_Of_Studie+" Adresse : "+ this.Adresse.toString()+ 
				"Level of Studie : "+ this.levelOfStudie+" Number of hours "+ this.NumberOfHours + " Major: "+ this.Major+ "Minor 1 :"+this.Minor1+" Minor 2 "+this.Minor2+"Referal professor : "+this.ReferalProf+ " Average Grade : "+this.avgGrade;
	}
	
	

	@Override
	void windowBUilder() {
		setSize(700,700);
		setLayout(new GridLayout(0,2));
		
		
		
		
		
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
	public void windowInputPartTimeStd(){
		
		
		
		remove(Student.PanelStudent);
		
		windowBUilder();
		
		add(PanelPartTimeStudent);
		setVisible(true);
		
		bn_addSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int levelOfStudieGiven ; // betwen 1 and 5
				int numberOfHoursGiven;
				String MajorGiven ;
				String Minor1Given;
				String Minor2Given;
				String ReferalProfGiven;
				Float avgGradeGiven;
				
				numberOfHoursGiven=Integer.parseInt(tf_number_of_Hours.getText());
				levelOfStudieGiven = Integer.parseInt((String)cb_level.getSelectedItem());
				MajorGiven=tf_Major.getText();
				Minor1Given = tf_Minor1.getText();
				Minor2Given= tf_Minor2.getText();
				ReferalProfGiven= tf_ReferalProf.getText();
				avgGradeGiven=Float.valueOf(tf_AvgGrade.getText());
				
				NumberOfHours=numberOfHoursGiven;
				levelOfStudie=levelOfStudieGiven; // betwen 1 and 5
				Major=MajorGiven;
				Minor1=Minor1Given;
				Minor2=Minor2Given;
				ReferalProf=ReferalProfGiven;
				avgGrade=avgGradeGiven;
				System.out.println(toString());
				
				submitPart=true;
			}
		});	
		
		while (submitPart==false) {
			System.out.print("");
		}
	
		
		
	}
	
}
