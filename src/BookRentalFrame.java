import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookRentalFrame extends MainFrame implements ActionListener {
	
	private ArrayList<Book> bookList;
    private JLabel rentalWelcomeText;
    private JLabel labelBook1;
    private JLabel labelBook2;
    private JLabel labelBook3;
    private JLabel labelBook4;
    private JLabel labelEnterBook;
    private JTextField textEnterBook;
    private JButton buttonEnterBook;
    private JLabel showBook;

	BookRentalFrame(){
		bookList = new ArrayList<Book>();
		
		Book book1 = new Book();
        book1.setBookName("Atomic Habits");
        book1.setAuthorName("James Clear");
        book1.setCopy(2);

        Book book2 = new Book();
        book2.setBookName("The Alchemist");
        book2.setAuthorName("Paulo Coelho");
        book2.setCopy(10);

        Book book3 = new Book();
        book3.setBookName("Great Expectations");
        book3.setAuthorName("Charles Dickens");
        book3.setCopy(6);
        
        Book book4 = new Book();
        book4.setBookName("To Kill a MockingBird");
        book4.setAuthorName("Harper Lee");
        book4.setCopy(8);
        
       

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        
		 rentalWelcomeText = new JLabel("WELCOME TO BOOK RENTAL SYSTEM!");
		rentalWelcomeText.setBounds(77,35,600,100);
		rentalWelcomeText.setFont(new Font("Comics Sans", Font.BOLD, 23));
		rentalWelcomeText.setForeground(Color.white);

		this.add(rentalWelcomeText);
		
		 labelBook1 = new JLabel("Index: 01 | "+book1.bookName+" by "+book1.authorName+ " | Copies: "+book1.getCopy());
		labelBook1.setBounds(77,75,600,100);
		labelBook1.setForeground(Color.white);

		labelBook1.setFont(new Font("Comics Sans", Font.PLAIN, 15));
		this.add(labelBook1);
		
		 labelBook2 = new JLabel("Index: 02 | "+book2.bookName+" by "+book2.authorName+ " | Copies: "+book2.getCopy());
		labelBook2.setBounds(77,105,600,100);
		labelBook2.setForeground(Color.white);

		labelBook2.setFont(new Font("Comics Sans", Font.PLAIN, 15));
		this.add(labelBook2);
		
		 labelBook3 = new JLabel("Index: 03 | "+book3.bookName+" by "+book3.authorName+ " | Copies: "+book3.getCopy());
		labelBook3.setBounds(77,135,600,100);
		labelBook3.setForeground(Color.white);
		labelBook3.setFont(new Font("Comics Sans", Font.PLAIN, 15));
		this.add(labelBook3);
		
		 labelBook4 = new JLabel("Index: 04 | "+book4.bookName+" by "+book4.authorName+ " | Copies: "+book4.getCopy());
		labelBook4.setBounds(77,165,600,100);
		labelBook4.setFont(new Font("Comics Sans", Font.PLAIN, 15));
		labelBook4.setForeground(Color.white);

		this.add(labelBook4);
		
		 labelEnterBook = new JLabel("Enter the index of your desired book: ");
		labelEnterBook.setBounds(77,210,600,100);
		labelEnterBook.setFont(new Font("Comics Sans", Font.BOLD, 15));
		labelEnterBook.setForeground(Color.white);
		this.add(labelEnterBook);
		
		 textEnterBook = new JTextField("");
		textEnterBook.setBounds(370,254,50,15);
		textEnterBook.setFont(new Font("Comics Sans", Font.PLAIN, 12));
		this.add(textEnterBook);
		
		 buttonEnterBook = new JButton("RENT");
		buttonEnterBook.setBounds(422,254,50,15);
		buttonEnterBook.setFont(new Font("Comics Sans", Font.PLAIN, 12));
		buttonEnterBook.addActionListener(this);
		this.add(buttonEnterBook);
		
		showBook = new JLabel();
		showBook.setVisible(false);
		this.add(showBook);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	   /* if (e.getSource() == buttonEnterBook) {
	        String enteredIndex = textEnterBook.getText();
	        

	        

	        if (!enteredIndex.isEmpty()) {
	            try {
	                int index = Integer.parseInt(enteredIndex); 
	                if (index > 0 && index <= bookList.size()) {
	                    bookList.get(index - 1); 

	                    
	                    if (bookList.get(index - 1).getCopy() > 0) {
	                        bookList.get(index - 1).setCopy(bookList.get(index - 1).getCopy() - 1); 
	                        updateBookLabels(); 
	                        showBook.setText("You rented "+bookList.get(index-1).getBookName());
	            	        showBook.setBounds(81,240,600,100);
	            	        showBook.setForeground(Color.white);
	            	        showBook.setFont(new Font("Comics Sans", Font.BOLD, 15));

	            	   
	            			showBook.setVisible(true);
	            			
	                    } else {
	                        JOptionPane.showMessageDialog(this, "NO COPIES AVAILABLE", "Error", JOptionPane.ERROR_MESSAGE);
	                    }
	                } else {
	                    JOptionPane.showMessageDialog(this, "Invalid Index. Enter only the indices indicated above.", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(this, "Invalid Index. Enter only the indices indicated above.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        } else {
	            JOptionPane.showMessageDialog(this, "Please enter an index.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	        if (bookList.get(0).getCopy()==0 &&
	        		bookList.get(1).getCopy()==0 && 
	        		bookList.get(2).getCopy()==0 && 
	        		bookList.get(3).getCopy()==0) {
	        	System.exit(0);
	        }
	        
	  
	    }  */
		
		if(e.getSource()==buttonEnterBook) {
			String selectedBook = textEnterBook.getText();
			
			try {
				int index = Integer.parseInt(selectedBook);
				if (!selectedBook.isEmpty()) {
					if(index >0 && index <=bookList.size()) {
						if (bookList.get(index-1).getCopy()> 0) {
							bookList.get(index-1).setCopy(bookList.get(index-1).getCopy()-1);
							updateBookLabels();
							showBook.setVisible(true);
							showBook.setText("You rented "+bookList.get(index-1).bookName);
							showBook.setForeground(Color.white);
	            	        showBook.setBounds(81,240,600,100);
							showBook.setFont(new Font("Comic Sans", Font.BOLD, 35));
							
							
						} else {
							JOptionPane.showMessageDialog(this, "NO COPIES AVAILABLE", "EREROR", JOptionPane.ERROR_MESSAGE);

						}
					}else {
						JOptionPane.showMessageDialog(this, "You entered an unvalid index", "EREROR", JOptionPane.ERROR_MESSAGE);

					}
				} else {
					JOptionPane.showMessageDialog(this, "Please enter a number", "EREROR", JOptionPane.ERROR_MESSAGE);
				}
					
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "Please enter a number", "EREROR", JOptionPane.ERROR_MESSAGE);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "Please check the index you entered", "EREROR", JOptionPane.ERROR_MESSAGE);
			}
			
			if (bookList.get(0).getCopy() == 0 &&
					bookList.get(1).getCopy() == 0 &&
					bookList.get(2).getCopy() == 0 &&
					bookList.get(3).getCopy() == 0) {
				System.exit(0);
			}
			
			
		}
	}


	private void updateBookLabels() {
	    labelBook1.setText("Index: 01 | " + bookList.get(0).getBookName() + " by " + bookList.get(0).getAuthorName() + " | Copies: " + bookList.get(0).getCopy());
	    labelBook2.setText("Index: 02 | " + bookList.get(1).getBookName() + " by " + bookList.get(1).getAuthorName() + " | Copies: " + bookList.get(1).getCopy());
	    labelBook3.setText("Index: 03 | " + bookList.get(2).getBookName() + " by " + bookList.get(2).getAuthorName() + " | Copies: " + bookList.get(2).getCopy());
	    labelBook4.setText("Index: 04 | " + bookList.get(3).getBookName() + " by " + bookList.get(3).getAuthorName() + " | Copies: " + bookList.get(3).getCopy());
	}
	
	
	
	
	




}
