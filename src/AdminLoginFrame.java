import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLoginFrame extends MainFrame implements ActionListener{
	JLabel welcomeText;
	private String [] username= {"Admin_01","Admin_02","Admin_03"};
	private String [] password= {"AdminOne","AdminTwo","AdminThree"};
	JLabel usernameText;
	JTextField usernameBox;
	JLabel passwordText;
	JPasswordField passwordBox;
	JButton enterButton;
	JLabel successText;
	JLabel textAdmin;
	
	AdminLoginFrame(){
		
		textAdmin = new JLabel("Admin Login");
		textAdmin.setFont(new Font("Comics Sans", Font.BOLD, 35));
		textAdmin.setBounds(165,20,400,100);
		textAdmin.setForeground(Color.white);

	
		 usernameText = new JLabel("Username");
			usernameText.setBounds(110,80,80,100);
			usernameText.setForeground(Color.white);
			
			usernameText.setFont(new Font("Comics Sans", Font.BOLD, 15));

			
			 usernameBox = new JTextField();
			usernameBox.setBounds(190,115,250,30);
			
			 passwordText = new JLabel("Password");
			passwordText.setBounds(110,120,80,100);
			passwordText.setForeground(Color.white);

			passwordText.setFont(new Font("Comics Sans", Font.BOLD, 15));
			
			 passwordBox = new JPasswordField();
			passwordBox.setBounds(190,160,250,30);
			
			 enterButton = new JButton("Enter");
			enterButton.setBounds(190,200,250,30);
			enterButton.setForeground(new Color(0X76C6D8));
			enterButton.setFont(new Font("Comics Sans", Font.BOLD, 15));

			enterButton.addActionListener(this);
			


			this.add(textAdmin);
			this.add(usernameText);
			this.add(usernameBox);
			this.add(passwordText);
			this.add(passwordBox);
			this.add(enterButton);
			this.add(successText); 
			
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	   /* if (e.getSource() == enterButton) {
	        String enteredUsername = usernameBox.getText();
	        String enteredPassword = new String(passwordBox.getPassword());

	        boolean usernameMatch = false;
	        boolean passwordMatch = false;

	        if (enteredUsername.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Please enter a username.", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        if (enteredPassword.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Please enter a password.", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        
	        for (int i = 0; i < username.length; i++) {
	            if (enteredUsername.equals(username[i])) {
	                usernameMatch = true;
	                if (enteredPassword.equals(password[i])) {
	                    passwordMatch = true;
	                    break;
	                }
	            }
	        }

	        if (usernameMatch && passwordMatch) {
	            new AdminWelcomeFrame();
	        } else if (!usernameMatch && !passwordMatch) {
	            JOptionPane.showMessageDialog(this, "INCORRECT USERNAME and PASSWORD.", "Error", JOptionPane.ERROR_MESSAGE);
	        } else if (!usernameMatch) {
	            JOptionPane.showMessageDialog(this, "INCORRECT USERNAME.", "Error", JOptionPane.ERROR_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(this, "INCORRECT PASSWORD.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }*/
		
		
		
		if (e.getSource()==enterButton) {
			String enteredUsername = usernameBox.getText();
			String enteredPassword = new String (passwordBox.getPassword());
			
			boolean usernameMatch = false;
			boolean passwordMatch = false;
			
			if (enteredUsername.isEmpty() && enteredPassword.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please enter your username and password", "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			else if (enteredPassword.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please enter your password", "ERROR", JOptionPane.ERROR_MESSAGE);
			    return;
			}
			else if (enteredUsername.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please enter your username", "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			
			for (int i = 0; i<username.length; i++) {
				if (enteredUsername.equals(username[i])) {
					usernameMatch = true;
					break;
					
				}
				if (enteredPassword.equals(password[i])) {
					passwordMatch = true;
					break;
				}
			}
			
		
			if (usernameMatch && passwordMatch ) {
				new AdminWelcomeFrame();
				
			} else if (!usernameMatch && !passwordMatch) {
				JOptionPane.showMessageDialog(this, "INCORRECT USERNAME AND PASSWORD", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else if (!usernameMatch) {
				JOptionPane.showMessageDialog(this, "INCORRECT USERNAME", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this, "INCORRECT PASSWORD", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		
		
		
		
		
		
	} 
	
}
