import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	MainFrame(){
		this.getContentPane().setBackground(new Color(0X76C6D8));
		this.setSize(600,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
	}

}
