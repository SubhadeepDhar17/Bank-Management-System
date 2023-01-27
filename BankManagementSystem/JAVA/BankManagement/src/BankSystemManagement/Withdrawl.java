package BankSystemManagement;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import javax.swing.*;

public class Withdrawl extends JFrame implements ActionListener {
	
	JTextField withdrawlTextField;
	JButton withdrawl, back;
	String pinNo;
	
	Withdrawl(String pinNo) {
		
		this.pinNo = pinNo;
		
		setLayout(null);
		setSize(830,760);
		setLocation(310,30);
		setTitle("Withdrawl");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(830, 760, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 830, 790);
		add(image);
		
		JLabel depositText = new JLabel("Enter Amount: ");
		depositText.setFont(new Font("System", Font.BOLD, 16));
		depositText.setForeground(Color.WHITE);
		depositText.setBounds(155,300,200,30);
		image.add(depositText);
		
		withdrawlTextField = new JTextField();
		withdrawlTextField.setFont(new Font("Raleway", Font.BOLD, 16));
		withdrawlTextField.setBounds(285, 295, 185, 40);
		image.add(withdrawlTextField);
		
		withdrawl = new JButton("Withdraw");
		withdrawl.setFont(new Font("System", Font.BOLD, 16));
		withdrawl.setBounds(320, 425, 160, 30);
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		back = new JButton("Back");
		back.setBounds(140, 425, 160, 30);
		back.setFont(new Font("System", Font.BOLD, 14));
		back.addActionListener(this);
		image.add(back);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Withdrawl("");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == withdrawl) {
			String amount = withdrawlTextField.getText();
			Date date = new Date();
			
			try {
				if (amount.equals("") || (amount.equals("0"))) {
				JOptionPane.showMessageDialog(null, "You need to enter an amount greater than 0");
				} else {
					Conn c = new Conn();
					ResultSet rs = c.s.executeQuery("Select * from bank where pinNo = '"+pinNo+"'"); // To check if there is efficient balance
					Integer balance = 0;
					while (rs.next()) {
						if (rs.getString("type").equals("Deposit")) {
							balance = balance + Integer.parseInt(rs.getString("amount"));
						} else {
							balance -= Integer.parseInt(rs.getString("amount"));
						}
					}
					
					if (ae.getSource() != back && balance<Integer.parseInt(amount)) {
						JOptionPane.showMessageDialog(null, "Insufficient Balance");
						return;
					}
					
					String query = "Insert into bank values('"+pinNo+"', '"+date+"', 'Withdrawl', '"+amount+"')";
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs. " + amount + " withdrawn succesfully");
					setVisible(false);
					new Transactions(pinNo).setVisible(true);
				}
			} catch (Exception e) {
					System.out.println(e);
				}
			}
		else if (ae.getSource() == back) {
			setVisible(false);
			new Transactions(pinNo).setVisible(true);
		}
		
	}

}
