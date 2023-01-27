package BankSystemManagement;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class Deposit extends JFrame implements ActionListener {
	
	JTextField depositTextField;
	JButton deposit, back;
	String pinNo;
	
	Deposit(String pinNo) {
		
		this.pinNo = pinNo;
		
		setLayout(null);
		setSize(830,760);
		setLocation(310,30);
		setTitle("Deposit");
		
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
		
		depositTextField = new JTextField();
		depositTextField.setFont(new Font("Raleway", Font.BOLD, 16));
		depositTextField.setBounds(285, 295, 185, 40);
		image.add(depositTextField);
		
		deposit = new JButton("Deposit");
		deposit.setFont(new Font("System", Font.BOLD, 16));
		deposit.setBounds(320, 425, 160, 30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		back = new JButton("Back");
		back.setBounds(140, 425, 160, 30);
		back.setFont(new Font("System", Font.BOLD, 14));
		back.addActionListener(this);
		image.add(back);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Deposit("");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == deposit) {
			String amount = depositTextField.getText();
			Date date = new Date();
			
			try {
				if (amount.equals("") || (amount.equals("0"))) {
				JOptionPane.showMessageDialog(null, "You need to enter an amount greater than 0");
				} else {
					Conn c = new Conn();
					String query = "Insert into bank values('"+pinNo+"', '"+date+"', 'Deposit', '"+amount+"')";
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs. " + amount + " deposited succesfully");
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
