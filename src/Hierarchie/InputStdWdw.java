package Hierarchie;



import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.*;

public class InputStdWdw extends JFrame {
		
		Boolean submit=false;
		Student newStudent = new Student();
		
		JPanel PButton=new JPanel();
		// Panel pour l'etuduant de base
		JPanel PTitle=new JPanel();
		JPanel PName=new JPanel();
		JPanel PSurname=new JPanel();
		JPanel PField_Of_Studie=new JPanel();
		JPanel PAdress=new JPanel();
		JPanel PNumber=new JPanel();
		JPanel PStreet=new JPanel();
		JPanel PTown=new JPanel();
		JPanel PZipCode=new JPanel();
		JPanel PCountry=new JPanel();
		JPanel PTypeStd=new JPanel();
		
		JPanel PanelStudent=new JPanel();
		
		
		
	
		//pannel full time std
		JPanel PLevelOfStudie = new JPanel();
		JPanel PMajor = new JPanel();
		JPanel PMinor1 = new JPanel();
		JPanel PMinor2 = new JPanel();
		JPanel PReferalProf = new JPanel();
		JPanel PavgGrade = new JPanel();
		JPanel PanelFullTimeStudent = new JPanel();
		JPanel PButtonSubmit=new JPanel();

		public InputStdWdw(){
			//this.removeAll();
			this.setSize(700,700);
			this.setLayout(new GridLayout(0,2));
			
			
			
			
			JTextField tf_name;
			JTextField tf_Surname;
			JTextField tf_Field_of_Studie;
			JTextField tf_Number;
			JTextField tf_Street;
			JTextField tf_Town;
			JTextField tf_ZipCode;
			JTextField tf_Country;
			JComboBox<String> cb_Type_Studie;
			JButton bn_addStd ;
			
			//PTitle.setLayout(new GridLayout(1,1));
			PTitle.add(new JLabel("Student :"));
			PTitle.add( new JLabel());
			
			//PName.setLayout(new GridLayout(2,1));
			PName.add(new JLabel("Name :"));		
			PName.add(tf_name=new JTextField(10));
			
			//PSurname.setLayout(new GridLayout(3,1));
			PSurname.add(new JLabel("Surname :"));			
			PSurname.add(tf_Surname=new JTextField(10));
			
			//PField_Of_Studie.setLayout(new GridLayout(4,1));
			PField_Of_Studie.add(new JLabel("Field of studies"));			
			PField_Of_Studie.add(tf_Field_of_Studie=new JTextField(10));
			
			//PAdress.setLayout(new GridLayout(5,1));
			PAdress.add(new JLabel("Adress :"));
			PAdress.add(new JLabel());
			
			
			//PNumber.setLayout(new GridLayout(6,1));
			PNumber.add(new JLabel("Number :"));			
			PNumber.add(tf_Number=new JTextField(10));
			
			//PStreet.setLayout(new GridLayout(6,2));
			PStreet.add(new JLabel("Street :"));			
			PStreet.add(tf_Street=new JTextField(10));			
			
			//PTown.setLayout(new GridLayout(7,1));
			PTown.add(new JLabel("Town :"));
			PTown.add(tf_Town=new JTextField(10));
			
			//PZipCode.setLayout(new GridLayout(7,2));
			PZipCode.add(new JLabel("Zip Code :"));
			PZipCode.add(tf_ZipCode=new JTextField(10));
			
			//PCountry.setLayout(new GridLayout(7,3));
			PCountry.add(new JLabel("Country :"));
			PCountry.add(tf_Country=new JTextField(10));
			
			//PTypeStd.setLayout(new GridLayout(8,1));
			PTypeStd.add(new JLabel("Type student :"));
			
			cb_Type_Studie = new JComboBox<String>();
			cb_Type_Studie.addItem("Full time student");
			cb_Type_Studie.addItem("Part time Student");
			cb_Type_Studie.addItem("Erasmus Student");
			PTypeStd.add(cb_Type_Studie);
			
			bn_addStd = new JButton("Next");
			PButton.add(bn_addStd);
		
			
			PanelStudent.add(PTitle);
			PanelStudent.add(PName);
			PanelStudent.add(PSurname);
			PanelStudent.add(PField_Of_Studie);
			PanelStudent.add(PAdress);
			PanelStudent.add(PStreet);
			PanelStudent.add(PNumber);
			PanelStudent.add(PTown);
			PanelStudent.add(PZipCode);
			PanelStudent.add(PCountry);
			PanelStudent.add(PTypeStd);
			PanelStudent.add(PButton);
			
			
			this.add(PanelStudent);
			
			
			
			setVisible(true);
			System.out.println("3");
			bn_addStd.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String name ;
					String surname;
					String Field_of_Studie;
					String Type_Studie;	
					Adresse student_Adress;
					
					name = tf_name.getText();
					surname=tf_Surname.getText();
					Field_of_Studie = tf_Field_of_Studie.getText();
					Type_Studie=(String) cb_Type_Studie.getSelectedItem();
					student_Adress= new Adresse(tf_Number.getText(),tf_Street.getText(),tf_Town.getText(),tf_ZipCode.getText(),tf_Country.getText());
					
					
					System.out.println(name+" "+surname+" "+Field_of_Studie+" "+Type_Studie+" "+student_Adress.toString());
					Student.setName(name);
					Student.setSurname(surname);
					Student.setField_Of_Studie(Field_of_Studie);
					Student.setAdresse(student_Adress);
					
					if (Type_Studie=="Full time student") {
						//this.removeAll();
						
						FullTimeStd fullTimeStd = InputFullTimeStd(newStudent);
						
					}
					
					
					
				}
			});
			
			
			
			
			
			
			
			
			
			
		}
		
		public FullTimeStd InputFullTimeStd(Student student){
			FullTimeStd fullTimeStd;
			
			
			
			
			
			fullTimeStd= new FullTimeStd(Student.name,Student.Surname,Student.Field_Of_Studie,Student.Adresse,Student.id_Student);
			this.remove(PanelStudent);
			
	
			
			this.setSize(700,700);
			this.setLayout(new GridLayout(0,2));
			
			
			
			JTextField tf_Major;
			JTextField tf_Minor1;
			JTextField tf_Minor2;
			JTextField tf_ReferalProf;
			JTextField tf_AvgGrade;
			
			JComboBox<String> cb_level;  //pour récupérer en string int recupVal = Integer.parseInt((String)myComboBox.getSelectedItem())
			JButton bn_add = new JButton("Save");
			
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
			
			JButton bn_addSubmit = new JButton("Submit");
			PButtonSubmit.add(bn_addSubmit);
			
			
			
			PanelFullTimeStudent.add(PLevelOfStudie);
			PanelFullTimeStudent.add(PMajor);
			PanelFullTimeStudent.add(PMinor1);
			PanelFullTimeStudent.add(PMinor2);
			PanelFullTimeStudent.add(PReferalProf);
			PanelFullTimeStudent.add(PavgGrade);
			PanelFullTimeStudent.add(PButtonSubmit);
			this.add(PanelFullTimeStudent);
			setVisible(true);
			
			bn_addSubmit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int levelOfStudie; // betwen 1 and 5
					String Major;
					String Minor1;
					String Minor2;
					String ReferalProf;
					Float avgGrade;
					
					levelOfStudie = Integer.parseInt((String)cb_level.getSelectedItem());
					Major=tf_Major.getText();
					Minor1 = tf_Minor1.getText();
					Minor2= tf_Minor2.getText();
					ReferalProf= tf_ReferalProf.getText();
					avgGrade=Float.valueOf(tf_AvgGrade.getText());
					
					
					fullTimeStd.setAvgGrade(avgGrade);
					fullTimeStd.setLevelOfStudie(levelOfStudie);
					fullTimeStd.setMajor(Major);
					fullTimeStd.setMinor1(Minor1);
					fullTimeStd.setMinor2(Minor2);
					fullTimeStd.setReferalProf(ReferalProf);
					System.out.println(fullTimeStd.toString());
					
					
				}
			});			
			
		
			
			return fullTimeStd;
		}
		
}
