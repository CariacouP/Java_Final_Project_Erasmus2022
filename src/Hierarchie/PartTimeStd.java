package Hierarchie;

public class PartTimeStd extends Student{
	int NumberOfHours;
	String Major;
	String Minor1;
	String Minor2;
	String ReferalProf;
	int avgGrade;
	
	 
	public PartTimeStd(int numberOfHours, String major, String minor1, String minor2, String referalProf,
			int avgGrade) {
		super();
		NumberOfHours = numberOfHours;
		Major = major;
		Minor1 = minor1;
		Minor2 = minor2;
		ReferalProf = referalProf;
		this.avgGrade = avgGrade;
	}
	
	public PartTimeStd(String name, String surname, String field_Of_Studie, Hierarchie.Adresse adresse, int id_Student,
			int numberOfHours, String major, String minor1, String minor2, String referalProf, int avgGrade) {
		super(name, surname, field_Of_Studie, adresse, id_Student);
		NumberOfHours = numberOfHours;
		Major = major;
		Minor1 = minor1;
		Minor2 = minor2;
		ReferalProf = referalProf;
		this.avgGrade = avgGrade;
	}
	
	
	public PartTimeStd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PartTimeStd(String name, String surname, String field_Of_Studie, Hierarchie.Adresse adresse,
			int id_Student) {
		super(name, surname, field_Of_Studie, adresse, id_Student);
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
	public int getAvgGrade() {
		return avgGrade;
	}

	/**
	 * @param avgGrade the avgGrade to set
	 */
	public void setAvgGrade(int avgGrade) {
		this.avgGrade = avgGrade;
	}
	
	
}
