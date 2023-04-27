import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LibrarianLoginFrame extends MainFrame implements ActionListener {
	
	private String [] username= {"Librarian_01","Librarian_02","Librarian_03"};
	private String [] password= {"LibOne","LibTwo","LibThree"};
	JLabel usernameText;
	JLabel textLibrary;
	JTextField usernameBox;
	JLabel passwordText;
	JPasswordField passwordBox;
	JButton enterButton;
	JLabel successText;
	LibrarianLoginFrame(){
			
		textLibrary = new JLabel("Library Login");
		textLibrary.setFont(new Font("Comics Sans", Font.BOLD, 35));
		textLibrary.setBounds(165,20,400,100);
		textLibrary.setForeground(Color.white);


		
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
		


		this.add(textLibrary);
		this.add(usernameText);
		this.add(usernameBox);
		this.add(passwordText);
		this.add(passwordBox);
		this.add(enterButton);
		this.add(successText);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == enterButton) {
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
	            new BookRentalFrame();
	        } else if (!usernameMatch && !passwordMatch) {
	            JOptionPane.showMessageDialog(this, "INCORRECT USERNAME and PASSWORD.", "Error", JOptionPane.ERROR_MESSAGE);
	        } else if (!usernameMatch) {
	            JOptionPane.showMessageDialog(this, "INCORRECT USERNAME.", "Error", JOptionPane.ERROR_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(this, "INCORRECT PASSWORD.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}





}
