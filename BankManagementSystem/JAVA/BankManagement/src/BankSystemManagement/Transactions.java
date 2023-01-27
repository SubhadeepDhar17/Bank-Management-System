package BankSystemManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{
	
	JButton deposit, cashWithdrawl, checkBalance, fundTransfer, miniStatement, pinGeneration, fastCash, exit;
	String pinNo;
	
	Transactions(String pinNo) {
		this.pinNo = pinNo;
		
		setLayout(null);
		setTitle("Transaction Page");
		setSize(830,760);
		setLocation(310,30);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(830, 760, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 830, 790);
		add(image);
		
		JLabel text = new JLabel("Please select your Transaction");
		text.setBounds(195, 280, 700, 35);
		text.setFont(new Font("System", Font.BOLD, 14));
		text.setForeground(Color.WHITE);
		image.add(text);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(140, 365, 160, 30);
		deposit.setFont(new Font("System", Font.BOLD, 14));
		deposit.addActionListener(this);
		image.add(deposit);
		
		cashWithdrawl = new JButton("Cash Withdrawl");
		cashWithdrawl.setBounds(320, 365, 160, 30);
		cashWithdrawl.setFont(new Font("System", Font.BOLD, 14));
		cashWithdrawl.addActionListener(this);
		image.add(cashWithdrawl);
		
		checkBalance = new JButton("Check Balance");
		checkBalance.setBounds(140, 395, 160, 30);
		checkBalance.setFont(new Font("System", Font.BOLD, 14));
		checkBalance.addActionListener(this);
		image.add(checkBalance);
		
		fundTransfer = new JButton("Fund Transfer");
		fundTransfer.setBounds(320, 395, 160, 30);
		fundTransfer.setFont(new Font("System", Font.BOLD, 14));
		fundTransfer.addActionListener(this);
		image.add(fundTransfer);
		
		miniStatement = new JButton("Mini Statement");
		miniStatement.setBounds(140, 425, 160, 30);
		miniStatement.setFont(new Font("System", Font.BOLD, 14));
		miniStatement.addActionListener(this);
		image.add(miniStatement);
		
		pinGeneration = new JButton("PIN Generation");
		pinGeneration.setBounds(320, 425, 160, 30);
		pinGeneration.setFont(new Font("System", Font.BOLD, 14));
		pinGeneration.addActionListener(this);
		image.add(pinGeneration);
		
		fastCash = new JButton("Fast Cash");
		fastCash.setBounds(140, 455, 160, 30);
		fastCash.setFont(new Font("System", Font.BOLD, 14));
		fastCash.addActionListener(this);
		image.add(fastCash);

		exit = new JButton("Exit");
		exit.setBounds(320, 455, 160, 30);
		exit.setFont(new Font("System", Font.BOLD, 14));
		exit.addActionListener(this);
		image.add(exit);
		
		setVisible(true); //Always put setVisible at the end
		
	}

	public static void main(String[] args) {
		new Transactions("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == exit) {
			System.exit(0);
		} else if (ae.getSource() == deposit) {
			setVisible(false);
			new Deposit(pinNo).setVisible(true);
		} else if (ae.getSource() == cashWithdrawl) {
			setVisible(false);
			new Withdrawl(pinNo).setVisible(true);
		} else if (ae.getSource() == fastCash) {
			setVisible(false);
			new FastCash(pinNo).setVisible(true);
		}
		
	}

}
