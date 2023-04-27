import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminWelcomeFrame extends MainFrame{
	
	JLabel welcomeText;
	AdminWelcomeFrame(){
		this.setSize(600,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		welcomeText = new JLabel();
		welcomeText.setText("Welcome to NU Library System!");
		welcomeText.setBounds(47, 120, 600, 100);
		welcomeText.setForeground(Color.white);
		welcomeText.setFont(new Font("Comics Sans", Font.BOLD, 32));

		
  
		
		this.add(welcomeText);
	}
}
