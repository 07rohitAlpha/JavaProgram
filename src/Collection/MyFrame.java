package Collection;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame {

	public static void main(String[] args) {
		
	// JPanel = a GUI component that function as a container to hold other components
	
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(0, 0, 250, 250);
		
		
		JPanel pinkpanel = new JPanel();
		pinkpanel.setBackground(Color.pink);
		pinkpanel.setBounds(0,250, 250, 250);
		
		JPanel blackpanel = new JPanel();
		blackpanel.setBackground(Color.black);
		blackpanel.setBounds(250,0, 250, 250);
		
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(250, 250, 250, 250);
		
		
		JFrame frame = new JFrame();
		frame .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(550, 550);
		frame.setVisible(true);
		frame.add(bluepanel);
		frame.add(redpanel);
		frame.add(blackpanel);
		frame.add(pinkpanel);
		

	}

}
