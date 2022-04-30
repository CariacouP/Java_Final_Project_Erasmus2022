package Hierarchie;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.*;


public class InputFullTimeStd extends JFrame {

	FullTimeStd fullTimeStd ;
	int levelOfStudie; // betwen 1 and 5
	String Major;
	String Minor1;
	String Minor2;
	String ReferalProf;
	int avgGrade;
	
	JPanel PlevelOfStudie = new JPanel();
	JPanel PMajor = new JPanel();
	JPanel PMinor1 = new JPanel();
	JPanel PMinor2 = new JPanel();
	JPanel PReferalProf = new JPanel();
	JPanel PavgGrade = new JPanel();
	
	
	
	
	InputFullTimeStd(Student student){
		
		fullTimeStd= new FullTimeStd(Student.name,Student.Surname,Student.Field_Of_Studie,Student.Adresse,Student.id_Student);
		this.removeAll();
		
		this.setSize(700,700);
		this.setLayout(new GridLayout(0,2));
		
		this.add(new JLabel("Nouvelle Page"));
		this.setVisible(true);
	}
}
