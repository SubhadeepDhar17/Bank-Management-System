package BankSystemManagement;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	
	JButton login, signUp, clear; //Globally defined buttons so that they can be used outside Login() Constructor 
	JTextField cardTextField;
	JPasswordField pinTextField;
	
	Login() { //Login Constructor for designing the entire layout
		
		setTitle("ATM");
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/pngwing.com.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		text.setForeground(Color.white);
		add(text);
		
		JLabel cardNo = new JLabel("Card No:");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
		cardNo.setBounds(120, 150, 150, 30);
		cardNo.setForeground(Color.white);
		add(cardNo);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 250, 30);
		add(cardTextField);
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 220, 250, 30);
		pin.setForeground(Color.white);
		add(pin);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 250, 30);
		add(pinTextField);
		
		login = new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("CLEAR");
		clear.setBounds(455, 300, 100, 30);
		clear.addActionListener(this);
		add(clear);
		
		signUp = new JButton("SIGN UP");
		signUp.setBounds(315, 350, 230, 30);
		signUp.addActionListener(this);
		add(signUp);
		
		getContentPane().setBackground(Color.BLACK);
		
		setSize(700, 500);
		setVisible(true);
		setLocation(350, 200);
		
	}

	public static void main(String[] args) {
		new Login();

	}

	@Override
	public void actionPerformed(ActionEvent ae) { // To check which button is clicked and work accordingly
		
		if(ae.getSource() == clear) {
			
			cardTextField.setText("");
			pinTextField.setText("");
			
		} else if (ae.getSource() == login) {
			Conn c = new Conn();
			String cardNo = cardTextField.getText();
			String pinNo = pinTextField.getText();
			String query = "Select * from login where cardNo = '"+cardNo+"' and pinNo = '"+pinNo+"'";
			try {
				ResultSet rs = c.s.executeQuery(query);
				if (rs.next()) {
					setVisible(false);
					new Transactions(pinNo).setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Card No. or PIN incorrect");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (ae.getSource() == signUp) {
			setVisible(false);
			new SignUpOne().setVisible(true); // To close login form and open Sign up form
		}
		
	}

}
