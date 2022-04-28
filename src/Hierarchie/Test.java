package Hierarchie;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myWindow = new JFrame();
		myWindow.setSize(500,500);	
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setLayout(new GridLayout(2,1));
		
		
		JPanel panel1 = new JPanel();
		//panel1.setLayout(new GridLayout(2,1));
		JButton button1 = new JButton("B1");
		JButton button2 = new JButton("B2");
		myWindow.add(button1);
		myWindow.add(button2);
		
		//myWindow.add(panel1);
		
		myWindow.setVisible(true);

	}

}
