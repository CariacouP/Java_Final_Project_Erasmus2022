package Hierarchie;


public class main_StudentH  {

	/**
	 * 
	 */
	Student[] students= new Student[100];
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		mainWindow newWind =new mainWindow();
	}
	
	public void createNewStudent() {
		
		if (students.length<100) {
			int i =students.length;
			Student newStd =new Student();
			newStd.windowInputDataStudent();
								
					if (newStd.typeOfStudie=="Full time student") {
						//this.removeAll();
						
						FullTimeStd newFullStd= new FullTimeStd(newStd.name,newStd.Surname,newStd.Field_Of_Studie,newStd.Adresse,newStd.id_Student);
						
						newFullStd.windowInputFullTimeStd();
						System.out.println("3");
						System.out.println(newFullStd.toString());
						students[i]=newFullStd;
					}
					
					else if (newStd.typeOfStudie=="Part time Student") {
						PartTimeStd newPartStd= new PartTimeStd(newStd.name,newStd.Surname,newStd.Field_Of_Studie,newStd.Adresse,newStd.id_Student);
						
						newPartStd.windowInputPartTimeStd();
						System.out.println(newPartStd.toString());
						students[i]=newPartStd;
						
					}
					
					else if (newStd.typeOfStudie=="Erasmus Student") {
						ErasmusStd newErasmusStd= new ErasmusStd(newStd.name,newStd.Surname,newStd.Field_Of_Studie,newStd.Adresse,newStd.id_Student);
						
						newErasmusStd.windowInputErasmusStd();
						System.out.println(newErasmusStd.toString());
						students[i]=newErasmusStd;
					}
			}
		
	}
}

