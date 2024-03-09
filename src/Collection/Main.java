package Collection;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
//		ImageIcon image = new ImageIcon("dude.png");
//		JLabel label = new JLabel();
//		label.setText("This is MyFrame"); // create a label
//		label.setIcon(image);
		
		JFrame frame = new JFrame(); // create a frame
		frame.setTitle("JFrame title goes here"); // sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
	    frame.setResizable(false); // prevent frame from being resized
		frame.setSize(320,320); // sets the x-dimension , and y-dimension of frame
		frame.setVisible(true); // male frame visible
		ImageIcon image = new ImageIcon("logo.png"); // create an ImageIcon
		frame.setIconImage(image.getImage()); // chnage icon of frame
		frame.getContentPane().setBackground(Color.pink);// chnage color of background 
		
	}

} 
