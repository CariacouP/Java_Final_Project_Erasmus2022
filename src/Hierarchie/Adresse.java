package Hierarchie;

public class Adresse {
	int number;
	String street;
	String town;
	String zipCode;
	String Country;
	
	

	public Adresse(int number, String street, String town, String zipCode, String country) {
		super();
		this.number = number;
		this.street = street;
		this.town = town;
		this.zipCode = zipCode;
		Country = country;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
