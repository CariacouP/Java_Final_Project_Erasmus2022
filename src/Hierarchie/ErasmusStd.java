package Hierarchie;

public class ErasmusStd extends Student
{	
	int levelOfStudie; // betwen 1 and 5
	String Major;
	String Minor1;
	String Minor2;
	String ReferalProf;
	int avgGrade;
	Adresse localAdresse;
	String UnivversityOfOrigin;
	String CountryOfOrigin;
	
	
	public ErasmusStd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ErasmusStd(String name, String surname, String field_Of_Studie, Hierarchie.Adresse adresse, int id_Student) {
		super(name, surname, field_Of_Studie, adresse, id_Student);
		// TODO Auto-generated constructor stub
	}
	
	public ErasmusStd(String name, String surname, String field_Of_Studie, Hierarchie.Adresse adresse, int id_Student,
			int levelOfStudie, String major, String minor1, String minor2, String referalProf, int avgGrade,
			Hierarchie.Adresse localAdresse, String univversityOfOrigin, String countryOfOrigin) {
		super(name, surname, field_Of_Studie, adresse, id_Student);
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
	
	public ErasmusStd(int levelOfStudie, String major, String minor1, String minor2, String referalProf, int avgGrade,
			Hierarchie.Adresse localAdresse, String univversityOfOrigin, String countryOfOrigin) {
		super();
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
	public int getAvgGrade() {
		return avgGrade;
	}

	/**
	 * @param avgGrade the avgGrade to set
	 */
	public void setAvgGrade(int avgGrade) {
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
	
}
