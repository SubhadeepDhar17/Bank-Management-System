package BankSystemManagement;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SignUpThree extends JFrame implements ActionListener{
	
	JRadioButton savings, current, fd, recurring;
	JCheckBox debitCard, chequeBook, passBook, mobileBanking, netBanking, sms, declare;
	JButton submit, cancel;
	String formNo;
	
	SignUpThree(String formNo) { //To pass the value of formNo from SignUpOne
		
		this.formNo = formNo;
		
		setLayout(null);
		setTitle("Sign Up Form");
		
		
		JLabel accDetails = new JLabel("Page3 : Account Details");
		accDetails.setBounds(280, 80, 500, 40);
		accDetails.setForeground(Color.WHITE);
		accDetails.setFont(new Font("Raleway", Font.BOLD, 22));	
		add(accDetails);
		
		JLabel accType = new JLabel("Account Type: ");
		accType.setBounds(100, 160, 200, 30);
		accType.setForeground(Color.WHITE);
		accType.setFont(new Font("Raleway", Font.BOLD, 20));
		add(accType);
		
		savings = new JRadioButton("Savings");
		savings.setBounds(400, 160, 200, 30);
		savings.setForeground(Color.WHITE);
		savings.setFont(new Font("Raleway", Font.BOLD, 18));
		add(savings);
		
		current = new JRadioButton("Current");
		current.setBounds(600, 160, 200, 30);
		current.setForeground(Color.WHITE);
		current.setFont(new Font("Raleway", Font.BOLD, 18));
		add(current);
		
		fd = new JRadioButton("Fixed Deposing");
		fd.setBounds(400, 200, 200, 30);
		fd.setForeground(Color.WHITE);
		fd.setFont(new Font("Raleway", Font.BOLD, 18));
		add(fd);
		
		recurring = new JRadioButton("Recurring");
		recurring.setBounds(600, 200, 200, 30);
		recurring.setForeground(Color.WHITE);
		recurring.setFont(new Font("Raleway", Font.BOLD, 18));
		add(recurring);
		
		ButtonGroup accTypeGroup = new ButtonGroup();
		accTypeGroup.add(current);
		accTypeGroup.add(savings);
		accTypeGroup.add(fd);
		accTypeGroup.add(recurring);
		
		JLabel cardNo = new JLabel("Card No: ");
		cardNo.setBounds(100, 270, 200, 30);
		cardNo.setForeground(Color.WHITE);
		cardNo.setFont(new Font("Raleway", Font.BOLD, 20));
		add(cardNo);
		
		JLabel cardNoDetails = new JLabel("This is your 16 digit Card Number");
		cardNoDetails.setBounds(100, 290, 300, 30);
		cardNoDetails.setForeground(Color.WHITE);
		cardNoDetails.setFont(new Font("Raleway", Font.BOLD, 10));
		add(cardNoDetails);
		
		JLabel cardNoDemo = new JLabel("XXXX-XXXX-XXXX-3124");
		cardNoDemo.setBounds(410, 270, 300, 30);
		cardNoDemo.setForeground(Color.WHITE);
		cardNoDemo.setFont(new Font("Raleway", Font.BOLD, 18));
		add(cardNoDemo);
		
		JLabel pin = new JLabel("Pin: ");
		pin.setBounds(100, 350, 100, 30);
		pin.setForeground(Color.WHITE);
		pin.setFont(new Font("Raleway", Font.BOLD, 20));
		add(pin);
		
		JLabel pinNo = new JLabel("XXXX");
		pinNo.setBounds(410, 350, 100, 30);
		pinNo.setForeground(Color.WHITE);
		pinNo.setFont(new Font("Raleway", Font.BOLD, 18));
		add(pinNo);
		
		JLabel pinNoDetails = new JLabel("This is your 4 digit Pin Number");
		pinNoDetails.setBounds(100, 370, 300, 30);
		pinNoDetails.setForeground(Color.WHITE);
		pinNoDetails.setFont(new Font("Raleway", Font.BOLD, 10));
		add(pinNoDetails);
		
		JLabel services = new JLabel("Services Required: ");
		services.setBounds(100, 430, 400, 30);
		services.setForeground(Color.WHITE);
		services.setFont(new Font("Raleway", Font.BOLD, 20));
		add(services);
		
		debitCard = new JCheckBox("Debit Card");
		debitCard.setBounds(400, 430, 200, 30);
		debitCard.setForeground(Color.WHITE);
		debitCard.setFont(new Font("Raleway", Font.BOLD, 18));
		add(debitCard);
		
		chequeBook = new JCheckBox("Cheque Book");
		chequeBook.setBounds(600, 430, 200, 30);
		chequeBook.setForeground(Color.WHITE);
		chequeBook.setFont(new Font("Raleway", Font.BOLD, 18));
		add(chequeBook);
		
		passBook = new JCheckBox("Pass Book");
		passBook.setBounds(400, 470, 200, 30);
		passBook.setForeground(Color.WHITE);
		passBook.setFont(new Font("Raleway", Font.BOLD, 18));
		add(passBook);
		
		mobileBanking = new JCheckBox("Mobile Banking");
		mobileBanking.setBounds(600, 470, 200, 30);
		mobileBanking.setForeground(Color.WHITE);
		mobileBanking.setFont(new Font("Raleway", Font.BOLD, 18));
		add(mobileBanking);
		
		netBanking = new JCheckBox("Net Banking");
		netBanking.setBounds(400, 510, 200, 30);
		netBanking.setForeground(Color.WHITE);
		netBanking.setFont(new Font("Raleway", Font.BOLD, 18));
		add(netBanking);
		
		sms = new JCheckBox("SMS");
		sms.setBounds(600, 510, 200, 30);
		sms.setForeground(Color.WHITE);
		sms.setFont(new Font("Raleway", Font.BOLD, 18));
		add(sms);
		
		declare = new JCheckBox("I hereby declare that the information provided are correct and to the best of my knowledge");
		declare.setBounds(110, 580, 700, 30);
		declare.setForeground(Color.WHITE);
		declare.setFont(new Font("Raleway", Font.BOLD, 12));
		add(declare);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		submit.setBounds(250, 630, 120, 40);
		submit.setFont(new Font("Raleway", Font.BOLD, 18));
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		cancel.setBounds(460, 630, 120, 40);
		cancel.setFont(new Font("Raleway", Font.BOLD, 18));
		add(cancel);
		
		getContentPane().setBackground(Color.BLACK);
		setVisible(true);
		setSize(830,760);
		setLocation(310, 30);
		
	}

	public static void main(String[] args) {
		new SignUpThree("");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == submit) {
			String accType = null;
			if (savings.isSelected()) {
				accType = "Savings";
			} else if (current.isSelected()) {
				accType = "Current";
			} else if (fd.isSelected()) {
				accType = "Fixed Deposit";
			} else if (recurring.isSelected()) {
				accType = "Recurring";
			}
			
			Random cardRandom = new Random();
			String cardNo =  "" + Math.abs((cardRandom.nextLong() % 90000000L) + 4900718100000000L);
			
			Random pinRandom = new Random();
			String pinNo = "" + Math.abs((pinRandom.nextLong() % 9000L) + 1000L);
			
			String services = "";
			if (debitCard.isSelected()) {
				services = services + " Debit Card";
			} else if (chequeBook.isSelected()) {
				services = services + " Cheque Book";
			} else if (passBook.isSelected()) {
				services = services + " Pass Book";
			} else if (mobileBanking.isSelected()) {
				services = services + " Mobile Banking";
			} else if (netBanking.isSelected()) {
				services = services + " Net Banking";
			} else if (sms.isSelected()) {
				services = services + " SMS";
			}
			
			try {
				Conn c = new Conn();
				String query1 = "Insert into signUpThree values('"+formNo+"', '"+accType+"', '"+cardNo+"', '"+pinNo+"', '"+services+"')";
				c.s.executeUpdate(query1);
				String query2 = "Insert into logIn values('"+formNo+"', '"+cardNo+"', '"+pinNo+"')";
				c.s.executeUpdate(query2);
				JOptionPane.showMessageDialog(null, "Your Card Number: " + cardNo + "\n Pin Number: " + pinNo);
				JOptionPane.showMessageDialog(null, "Please deposit some amount");
				
				setVisible(false);
				new Deposit(pinNo).setVisible(true); //To deposit money right after account opening
			} catch (Exception e) {
				System.out.println(e);
			}
			
		} else if (ae.getSource() == cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
		
	}

}
