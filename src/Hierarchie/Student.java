package Hierarchie;

public class Student {
	String name;
	String Surname;
	String Field_Of_Studie;
	Adresse Adresse;
	int id_Student;
	
	public Student() {
		
	}
	
	public Student(String name, String surname, String field_Of_Studie, Hierarchie.Adresse adresse, int id_Student) {
		super();
		this.name = name;
		Surname = surname;
		Field_Of_Studie = field_Of_Studie;
		Adresse = adresse;
		this.id_Student = id_Student;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getField_Of_Studie() {
		return Field_Of_Studie;
	}
	public void setField_Of_Studie(String field_Of_Studie) {
		Field_Of_Studie = field_Of_Studie;
	}
	public Adresse getAdresse() {
		return Adresse;
	}
	public void setAdresse(Adresse adresse) {
		Adresse = adresse;
	}
	public int getId_Student() {
		return id_Student;
	}
	public void setId_Student(int id_Student) {
		this.id_Student = id_Student;
	}
	
	

}
