package Hierarchie;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class main_StudentH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mainWindow = new JFrame(); // create a new frame name mainWindow
		mainWindow.setTitle("Student"); // set the title of the window
		mainWindow.setSize(960,540); //set the x-dimension and the y-dimension of the mainWindow
		mainWindow.setResizable(false); // prevent mainWindow from being resize
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		
		/*Image icon = Toolkit.getDefaultToolkit().getImage("Logo.png"); // create an image icon
		mainWindow.setIconImage(icon);*/
		
		mainWindow.setVisible(true); //make the mainWindow visible
	}

}
