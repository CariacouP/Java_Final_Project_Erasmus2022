package Hierarchie;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FullTimeStd extends Student {

	int levelOfStudie; // betwen 1 and 5
	String Major;
	String Minor1;
	String Minor2;
	String ReferalProf;
	Float avgGrade;
	boolean submitFull=false;
	
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
	
	public FullTimeStd(String name, String surname, String field_Of_Studie, Hierarchie.Adresse adresse,
			int id_Student) {
		super(name, surname, field_Of_Studie, adresse, id_Student);
		// TODO Auto-generated constructor stub
	}
	
	public FullTimeStd(String name, String surname, String field_Of_Studie, Hierarchie.Adresse adresse, int id_Student,
			int levelOfStudie, String major, String minor1, String minor2, String referalProf, Float avgGrade) {
		super(name, surname, field_Of_Studie, adresse, id_Student);
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
		return "name: "+this.name+" Surname : " +this.Surname + " Field of Studies: "+ this.Field_Of_Studie+" Adresse : "+ this.Adresse.toString()+ 
				" Level od Studie"+ this.levelOfStudie + " Major: "+ this.Major+ "Minor 1 :"+this.Minor1+" Minor 2 "+this.Minor2+"Referal professor : "+this.ReferalProf+ " Average Grade : "+this.avgGrade;
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
		
		
		
		PanelFullTimeStudent.add(PLevelOfStudie);
		PanelFullTimeStudent.add(PMajor);
		PanelFullTimeStudent.add(PMinor1);
		PanelFullTimeStudent.add(PMinor2);
		PanelFullTimeStudent.add(PReferalProf);
		PanelFullTimeStudent.add(PavgGrade);
		PanelFullTimeStudent.add(PButtonSubmit);
		
		
	}
	public void windowInputFullTimeStd(){
		
		
		
		remove(Student.PanelStudent);
		
		windowBUilder();
		
		add(PanelFullTimeStudent);
		setVisible(true);
		
		bn_addSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int levelOfStudieGiven ; // betwen 1 and 5
				String MajorGiven ;
				String Minor1Given;
				String Minor2Given;
				String ReferalProfGiven;
				Float avgGradeGiven;
				
				
				levelOfStudieGiven = Integer.parseInt((String)cb_level.getSelectedItem());
				MajorGiven=tf_Major.getText();
				Minor1Given = tf_Minor1.getText();
				Minor2Given= tf_Minor2.getText();
				ReferalProfGiven= tf_ReferalProf.getText();
				avgGradeGiven=Float.valueOf(tf_AvgGrade.getText());
				
				
				levelOfStudie=levelOfStudieGiven; // betwen 1 and 5
				Major=MajorGiven;
				Minor1=Minor1Given;
				Minor2=Minor2Given;
				ReferalProf=ReferalProfGiven;
				avgGrade=avgGradeGiven;
				System.out.println(toString());
				
				submitFull=true;
			}
		});	
		
		while (submitFull==false) {
			System.out.print("");
		}
	
		
		
	}
	
	
}
