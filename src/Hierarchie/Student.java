package Hierarchie;

public class Student {
	static String name;
	static String Surname;
	static String Field_Of_Studie;
	static Adresse Adresse;
	static int id_Student;
	
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
	public static void setName(String nameGiven) {
		name = nameGiven;
	}
	public String getSurname() {
		return Surname;
	}
	public static void setSurname(String surnameGiven) {
		Surname = surnameGiven;
	}
	public String getField_Of_Studie() {
		return Field_Of_Studie;
	}
	public static void setField_Of_Studie(String field_Of_StudieGiven) {
		Field_Of_Studie = field_Of_StudieGiven;
	}
	public static Adresse getAdresse() {
		return Adresse;
	}
	public static  void setAdresse(Adresse adresseGiven) {
		Adresse = adresseGiven;
	}
	public int getId_Student() {
		return id_Student;
	}
	public static void setId_Student(int id_StudentGiven) {
		id_Student = id_StudentGiven;
	}
	
	

}
