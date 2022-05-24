package Hierarchie;

public class main_StudentH {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
			
		mainWindow newWindow= new mainWindow();
		int i=0;
		Student[] students = new Student[100];
		newWindow.mainWindowBuilder(students,i);
			
	}
}

