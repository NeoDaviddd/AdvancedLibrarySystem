import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GeneralLoginFrame extends MainFrame implements ActionListener{
	JButton adminLogin;
	JButton librarianLogin;

	
	GeneralLoginFrame(){
		
		
		adminLogin = new JButton();
		adminLogin.setBounds(150,70,300,100);
		adminLogin.setForeground(new Color(0X76C6D8));
		adminLogin.setFont(new Font("Comics Sans", Font.BOLD, 23));
		adminLogin.addActionListener(this);
		adminLogin.setText("Admin Login");
		adminLogin.setVisible(true);
		this.add(adminLogin);

		librarianLogin = new JButton();
		librarianLogin.setBounds(150,180,300,100);
		librarianLogin.setForeground(new Color(0X76C6D8));
		librarianLogin.setFont(new Font("Comics Sans", Font.BOLD, 23));
		librarianLogin.addActionListener(this);
		librarianLogin.setText("Librarian Login");
		librarianLogin.setVisible(true);
		this.add(librarianLogin);
	
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==adminLogin) {
			adminLogin.setVisible(false);
			librarianLogin.setVisible(false);
			new AdminLoginFrame();
			
		}
		else if (e.getSource()==librarianLogin) {
			adminLogin.setVisible(false);
			librarianLogin.setVisible(false);
			new LibrarianLoginFrame();
		}
		
	}
}
