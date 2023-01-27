package BankSystemManagement;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener {
		
		JTextField panTextField, aadharTextField;
		JButton next;
		JRadioButton sYes, sNo, exYes, exNo;
		JComboBox religionCombo, categoryCombo, incomeCombo, eduCombo, ocuCombo;
		String formNo;
		
		SignUpTwo(String formNo) { // We design the entire layout in this constructor
			
			this.formNo = formNo; //To pass the value of formNo from SignUpOne
			
			setLayout(null);
			setTitle("Sign Up Form");
			
			JLabel additionalDetail = new JLabel("Page2 : Additional Details");
			additionalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
			additionalDetail.setBounds(280, 80, 500, 40);
			additionalDetail.setForeground(Color.WHITE);
			add(additionalDetail);
			
			JLabel religion = new JLabel("Religion: ");
			religion.setFont(new Font("Raleway", Font.BOLD, 20));
			religion.setBounds(100, 160, 100, 30);
			religion.setForeground(Color.WHITE);
			add(religion);
			
			String valReligion[] = {"Hinduism", "Islam", "Christianity", "Sikhism", "Jainism", "Buddhism", "Others"};
			religionCombo = new JComboBox(valReligion);
			religionCombo.setBounds(300, 160, 200, 30);
			add(religionCombo);
			
			JLabel Category = new JLabel("Category: ");
			Category.setFont(new Font("Raleway", Font.BOLD, 20));
			Category.setBounds(100, 210, 200, 30);
			Category.setForeground(Color.WHITE);
			add(Category);
			
			String valCategory[] = {"UC", "SC", "ST", "OBC", "Others"};
			categoryCombo = new JComboBox(valCategory);
			categoryCombo.setBounds(300, 210, 200, 30);
			add(categoryCombo);
			
			JLabel income = new JLabel("Income: ");
			income.setFont(new Font("Raleway", Font.BOLD, 20));
			income.setBounds(100, 260, 200, 30);
			income.setForeground(Color.WHITE);
			add(income);
			
			String valIncome[] = {"Null", "Less than 1 Lakh", "1 Lakh - 3 Lakh", "3 Lakh - 5 Lakh", "5 Lakh - 10 Lakh", "More then 10 Lakh"};
			incomeCombo = new JComboBox(valIncome);
			incomeCombo.setBounds(300, 260, 250, 30);
			add(incomeCombo);
			
			JLabel educational = new JLabel("Educational");
			educational.setFont(new Font("Raleway", Font.BOLD, 20));
			educational.setBounds(100, 310, 200, 30);
			educational.setForeground(Color.WHITE);
			add(educational);
			
			JLabel qualification = new JLabel("Qualification: ");
			qualification.setFont(new Font("Raleway", Font.BOLD, 20));
			qualification.setBounds(100, 335, 200, 30);
			qualification.setForeground(Color.WHITE);
			add(qualification);
			
			String valEdu[] = {"Primary School", "High School", "Undergraduate", "Graduate", "Dictorate"};
			eduCombo = new JComboBox(valEdu);
			eduCombo.setBounds(300, 335, 250, 30);
			add(eduCombo);
			
			JLabel occupation = new JLabel("Occupation: ");
			occupation.setFont(new Font("Raleway", Font.BOLD, 20));
			occupation.setBounds(100, 410, 200, 30);
			occupation.setForeground(Color.WHITE);
			add(occupation);
			
			String valOcu[] = {"Salaried", "Business", "Self-employed", "Student", "Others"};
			ocuCombo = new JComboBox(valOcu);
			ocuCombo.setBounds(300, 410, 200, 30);
			add(ocuCombo);
			
			JLabel pan = new JLabel("PAN No: ");
			pan.setFont(new Font("Raleway", Font.BOLD, 20));
			pan.setBounds(100, 460, 200, 30);
			pan.setForeground(Color.WHITE);
			add(pan);
			
			panTextField = new JTextField();
			panTextField.setFont(new Font("Raleway", Font.BOLD, 20));
			panTextField.setBounds(300, 460, 300, 30);
			add(panTextField);
			
			JLabel aadhar = new JLabel("Aadhar No: ");
			aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
			aadhar.setBounds(100, 510, 200, 30);
			aadhar.setForeground(Color.WHITE);
			add(aadhar);
			
			aadharTextField = new JTextField();
			aadharTextField.setFont(new Font("Raleway", Font.BOLD, 20));
			aadharTextField.setBounds(300, 510, 300, 30);
			add(aadharTextField);
			
			JLabel sCitizen = new JLabel("Senior Citizen: ");
			sCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
			sCitizen.setBounds(100, 560, 200, 30);
			sCitizen.setForeground(Color.WHITE);
			add(sCitizen);
			
			sYes = new JRadioButton("Yes");
			sYes.setBounds(300, 560, 100, 30);
			sYes.setFont(new Font("Raleway", Font.BOLD, 15));
			sYes.setForeground(Color.WHITE);
			add(sYes);
			
			sNo = new JRadioButton("No");
			sNo.setBounds(450, 560, 100, 30);
			sNo.setFont(new Font("Raleway", Font.BOLD, 15));
			sNo.setForeground(Color.WHITE);
			add(sNo);
			
			ButtonGroup seniorStatus = new ButtonGroup();
			seniorStatus.add(sNo);
			seniorStatus.add(sYes);
			
			JLabel exAcc = new JLabel("Existing Acc: ");
			exAcc.setFont(new Font("Raleway", Font.BOLD, 20));
			exAcc.setBounds(100, 610, 200, 30);
			exAcc.setForeground(Color.WHITE);
			add(exAcc);
			
			exYes = new JRadioButton("Yes");
			exYes.setBounds(300, 610, 100, 30);
			exYes.setFont(new Font("Raleway", Font.BOLD, 15));
			exYes.setForeground(Color.WHITE);
			add(exYes);
			
			exNo = new JRadioButton("No");
			exNo.setBounds(450, 610, 100, 30);
			exNo.setFont(new Font("Raleway", Font.BOLD, 15));
			exNo.setForeground(Color.WHITE);
			add(exNo);
			
			ButtonGroup exAccStatus = new ButtonGroup();
			exAccStatus.add(exNo);
			exAccStatus.add(exYes);
			
			next = new JButton("Next");
			next.setBounds(630, 660, 120, 50);
			next.setFont(new Font("Raleway", Font.BOLD, 20));
			next.addActionListener(this);
			add(next);
			
			getContentPane().setBackground(Color.BLACK);
			setSize(830, 760);
			setLocation(310, 30);
			setVisible(true);
		}

	public static void main(String[] args) {
		new SignUpTwo("");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String religion = (String) religionCombo.getSelectedItem();
		String category = (String) categoryCombo.getSelectedItem();
		String income = (String) incomeCombo.getSelectedItem();
		String education = (String) eduCombo.getSelectedItem();
		String occupation = (String) ocuCombo.getSelectedItem();
		String pan = panTextField.getText();
		String aadhar = aadharTextField.getText();
		
		String sStatus = null;
		if (sYes.isSelected()) {
			sStatus = "male";
		} else if (sNo.isSelected()) {
			sStatus = "female";
		}
		
		String accStatus = null;
		if (exYes.isSelected()) {
			accStatus = "Married";
		} else if (exNo.isSelected()) {
			accStatus = "Divorced";
		}
		
		try {
			if (pan.equals("")) {
				JOptionPane.showMessageDialog(null, "PAN No. is required"); // To show warning is text field is left blank
			} else if (aadhar.equals("")) {
				JOptionPane.showMessageDialog(null, "Aadhar No. is required");
			} else { // Adding values to table, here table name is signUp
				Conn c = new Conn();
				String query = "insert into signUpTwo values('"+formNo+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+pan+"', '"+aadhar+"', '"+sStatus+"', '"+accStatus+"')";
			    c.s.executeUpdate(query);
			    
			    setVisible(false);
			    new SignUpThree(formNo).setVisible(true);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
