package Hierarchie;



import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.*;

public class InputStdWdw extends JFrame {
		String name ;
		String surname;
		String Field_of_Studie;
		String Type_Studie;	
		Adresse student_Adress;
		
		Student newStudent = new Student();
	

		public InputStdWdw(){
			//this.removeAll();
			this.setSize(700,700);
			this.setLayout(new GridLayout(0,2));
			
			
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
			
			JTextField tf_name;
			JTextField tf_Surname;
			JTextField tf_Field_of_Studie;
			JTextField tf_Number;
			JTextField tf_Street;
			JTextField tf_Town;
			JTextField tf_ZipCode;
			JTextField tf_Country;
			JComboBox<String> cb_Type_Studie;
			JButton bn_add = new JButton("Next");
			
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
			
		
			
			
			this.add(PTitle);
			this.add(PName);
			this.add(PSurname);
			this.add(PField_Of_Studie);
			this.add(PAdress);
			this.add(PStreet);
			this.add(PNumber);
			this.add(PTown);
			this.add(PZipCode);
			this.add(PCountry);
			this.add(PTypeStd);
			this.add(bn_add);
			
			bn_add.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					name = tf_name.getText();
					surname=tf_Surname.getText();
					Field_of_Studie = tf_Field_of_Studie.getText();
					Type_Studie=(String) cb_Type_Studie.getSelectedItem();
					student_Adress= new Adresse(tf_Number.getText(),tf_Street.getText(),tf_Town.getText(),tf_ZipCode.getText(),tf_Country.getText());
					System.out.println(name+" "+surname+" "+Field_of_Studie+" "+Type_Studie+" "+student_Adress.toString());
					newStudent.setName(name);
					newStudent.setSurname(surname);
					newStudent.setField_Of_Studie(Field_of_Studie);
					newStudent.setAdresse(student_Adress);
					
					if (Type_Studie=="Full time student") {
						
						InputFullTimeStd fullTimeStd = new InputFullTimeStd(newStudent);
						
					}
					
					
					
				}
			});
			
			
			
			setVisible(true);
			
			
			
			
		}
		
}
