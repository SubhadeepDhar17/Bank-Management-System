package BankSystemManagement;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
	
	JButton rs100, rs200, rs500, rs1000, rs2000, rs5000, rs10000, back;
	String pinNo;
	
	FastCash(String pinNo) {
		
		this.pinNo = pinNo;
		
		setLayout(null);
		setSize(830,760);
		setLocation(310,30);
		setTitle("FastCash");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(830, 760, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 830, 790);
		add(image);
		
		JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
		text.setBounds(195, 280, 700, 35);
		text.setFont(new Font("System", Font.BOLD, 14));
		text.setForeground(Color.WHITE);
		image.add(text);
		
		rs100 = new JButton("Rs 100");
		rs100.setBounds(140, 365, 160, 30);
		rs100.setFont(new Font("System", Font.BOLD, 14));
		rs100.addActionListener(this);
		image.add(rs100);
		
		rs200 = new JButton("Rs 200");
		rs200.setBounds(320, 365, 160, 30);
		rs200.setFont(new Font("System", Font.BOLD, 14));
		rs200.addActionListener(this);
		image.add(rs200);
		
		rs500 = new JButton("Rs 500");
		rs500.setBounds(140, 395, 160, 30);
		rs500.setFont(new Font("System", Font.BOLD, 14));
		rs500.addActionListener(this);
		image.add(rs500);
		
		rs1000 = new JButton("Rs 1000");
		rs1000.setBounds(320, 395, 160, 30);
		rs1000.setFont(new Font("System", Font.BOLD, 14));
		rs1000.addActionListener(this);
		image.add(rs1000);
		
		rs2000 = new JButton("Rs 2000");
		rs2000.setBounds(140, 425, 160, 30);
		rs2000.setFont(new Font("System", Font.BOLD, 14));
		rs2000.addActionListener(this);
		image.add(rs2000);
		
		rs5000 = new JButton("Rs 5000");
		rs5000.setBounds(320, 425, 160, 30);
		rs5000.setFont(new Font("System", Font.BOLD, 14));
		rs5000.addActionListener(this);
		image.add(rs5000);
		
		rs10000 = new JButton("Rs 10000");
		rs10000.setBounds(140, 455, 160, 30);
		rs10000.setFont(new Font("System", Font.BOLD, 14));
		rs10000.addActionListener(this);
		image.add(rs10000);

		back = new JButton("Back");
		back.setBounds(320, 455, 160, 30);
		back.setFont(new Font("System", Font.BOLD, 14));
		back.addActionListener(this);
		image.add(back);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new FastCash("");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == back) {
			setVisible(false);
			new Transactions(pinNo).setVisible(true);
		} else {
			String amount = ((JButton)ae.getSource()).getText().substring(3); //To get '500' or '100' from 'Rs 100' when buttons are pressed
			Conn c = new Conn();
			try {
				ResultSet rs = c.s.executeQuery("Select * from bank where pinNo = '"+pinNo+"'");
				int balance = 0;
				while (rs.next()) {
					if (rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
					} else {
						balance -= Integer.parseInt(rs.getString("amount"));
					}
				}
				
				if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return;
				}
				
				Date date = new Date();
				String query = "Insert into bank values('"+pinNo+"', '"+date+"', 'Withdrawl', '"+amount+"')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs. " + amount + " withdrawn succesfully");
				setVisible(false);
				new Transactions(pinNo).setVisible(true);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}

}
