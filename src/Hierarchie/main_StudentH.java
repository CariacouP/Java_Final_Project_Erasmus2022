package Hierarchie;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.*;

public class main_StudentH extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student newStd =new Student();
		newStd.windowInputDataStudent();
		//int i=0;
		//Student[] students= new Student[100];
		
		/*
		while (i<students.length) {
			Student newStd =new Student();
			newStd.setId_Student(i);
			newStd.windowInputDataStudent();
			*/
					
				
				if (newStd.typeOfStudie=="Full time student") {
					//this.removeAll();
					
					FullTimeStd newFullStd= new FullTimeStd(newStd.name,newStd.Surname,newStd.Field_Of_Studie,newStd.Adresse,newStd.id_Student);
					
					newFullStd.windowInputFullTimeStd();
					System.out.println("3");
					System.out.println(newFullStd.toString());
					//students[i]=newFullStd;
				}
				
				else if (newStd.typeOfStudie=="Part time Student") {
					PartTimeStd newPartStd= new PartTimeStd(newStd.name,newStd.Surname,newStd.Field_Of_Studie,newStd.Adresse,newStd.id_Student);
					
					newPartStd.windowInputPartTimeStd();
					System.out.println(newPartStd.toString());
					//students[i]=newPartStd;
					
				}
				
				else if (newStd.typeOfStudie=="Erasmus Student") {
					ErasmusStd newErasmusStd= new ErasmusStd(newStd.name,newStd.Surname,newStd.Field_Of_Studie,newStd.Adresse,newStd.id_Student);
					
					newErasmusStd.windowInputErasmusStd();
					System.out.println(newErasmusStd.toString());
					//students[i]=newErasmusStd;
				}
			//i++;
		//}
	}
}

