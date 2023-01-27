package BankSystemManagement;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.*;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener {
	
	long appNo;
	JTextField nameTextField, fNameTextField, emailTextField, addressTextField, stateTextField, cityTextField, pinTextField;
	JButton next;
	JRadioButton male, female, others, married, divorced, widowed, single;
	JDateChooser date;

	SignUpOne() { // We design the entire layout in this constructor
		
		setLayout(null);
		setTitle("Sign Up Form");
		
		Random ran = new Random();
		appNo = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formNo = new JLabel("APPLICATION FORM NO. " + appNo);
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));
		formNo.setBounds(140, 20, 600, 40); //setBounds only work when setLayout is null
		formNo.setForeground(Color.WHITE);
		add(formNo);
		
		JLabel personalDetail = new JLabel("Page1 : Personal Details");
		personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
		personalDetail.setBounds(280, 80, 500, 40);
		personalDetail.setForeground(Color.WHITE);
		add(personalDetail);
		
		JLabel name = new JLabel("Name: ");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 160, 100, 30);
		name.setForeground(Color.WHITE);
		add(name);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 20));
		nameTextField.setBounds(300, 160, 450, 30);
		add(nameTextField);
		
		JLabel fName = new JLabel("Father's Name: ");
		fName.setFont(new Font("Raleway", Font.BOLD, 20));
		fName.setBounds(100, 210, 200, 30);
		fName.setForeground(Color.WHITE);
		add(fName);
		
		fNameTextField = new JTextField();
		fNameTextField.setFont(new Font("Raleway", Font.BOLD, 20));
		fNameTextField.setBounds(300, 210, 450, 30);
		add(fNameTextField);
		
		JLabel dob = new JLabel("Date of Birth: ");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100, 260, 200, 30);
		dob.setForeground(Color.WHITE);
		add(dob);
		
		date = new JDateChooser();
		date.setBounds(300,260,200,30);
		add(date);
		
		JLabel gender = new JLabel("Gender: ");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 310, 200, 30);
		gender.setForeground(Color.WHITE);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(300, 310, 90, 30);
		male.setFont(new Font("Raleway", Font.PLAIN, 18));
		male.setForeground(Color.WHITE);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(410, 310, 120, 30);
		female.setFont(new Font("Raleway", Font.PLAIN, 18));
		female.setForeground(Color.WHITE);
		add(female);
		
		others = new JRadioButton("Others");
		others.setBounds(530, 310, 100, 30);
		others.setFont(new Font("Raleway", Font.PLAIN, 18));
		others.setForeground(Color.WHITE);
		add(others);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		genderGroup.add(others);
		
		JLabel email = new JLabel("Email: ");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 360, 200, 30);
		email.setForeground(Color.WHITE);
		add(email);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway", Font.BOLD, 20));
		emailTextField.setBounds(300, 360, 450, 30);
		add(emailTextField);
		
		JLabel mStatus = new JLabel("Marital Status: ");
		mStatus.setFont(new Font("Raleway", Font.BOLD, 20));
		mStatus.setBounds(100, 410, 200, 30);
		mStatus.setForeground(Color.WHITE);
		add(mStatus);
		
		married = new JRadioButton("Married");
		married.setBounds(300, 410, 100, 30);
		married.setFont(new Font("Raleway", Font.PLAIN, 18));
		married.setForeground(Color.WHITE);
		add(married);
		
		divorced = new JRadioButton("Divorced");
		divorced.setBounds(410, 410, 120, 30);
		divorced.setFont(new Font("Raleway", Font.PLAIN, 18));
		divorced.setForeground(Color.WHITE);
		add(divorced);
		
		widowed = new JRadioButton("Widowed");
		widowed.setBounds(530, 410, 120, 30);
		widowed.setFont(new Font("Raleway", Font.PLAIN, 18));
		widowed.setForeground(Color.WHITE);
		add(widowed);
		
		single = new JRadioButton("Single");
		single.setBounds(650, 410, 120, 30);
		single.setFont(new Font("Raleway", Font.PLAIN, 18));
		single.setForeground(Color.WHITE);
		add(single);
		
		ButtonGroup mStatusGroup = new ButtonGroup();
		mStatusGroup.add(married);
		mStatusGroup.add(divorced);
		mStatusGroup.add(widowed);
		mStatusGroup.add(single);
		
		JLabel address = new JLabel("Address: ");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 460, 200, 30);
		address.setForeground(Color.WHITE);
		add(address);
		
		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Raleway", Font.BOLD, 20));
		addressTextField.setBounds(300, 460, 450, 30);
		add(addressTextField);
		
		JLabel state = new JLabel("State: ");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 510, 200, 30);
		state.setForeground(Color.WHITE);
		add(state);
		
		stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway", Font.BOLD, 20));
		stateTextField.setBounds(300, 510, 350, 30);
		add(stateTextField);
		
		JLabel city = new JLabel("City: ");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 560, 200, 30);
		city.setForeground(Color.WHITE);
		add(city);
		
		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway", Font.BOLD, 20));
		cityTextField.setBounds(300, 560, 250, 30);
		add(cityTextField);
		
		JLabel pincode = new JLabel("Pincode: ");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 610, 200, 30);
		pincode.setForeground(Color.WHITE);
		add(pincode);
		
		pinTextField = new JTextField();
		pinTextField.setFont(new Font("Raleway", Font.BOLD, 20));
		pinTextField.setBounds(300, 610, 250, 30);
		add(pinTextField);
		
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
		new SignUpOne();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String formNo = "" + appNo; // As appNo is long so to convert it to string "" is added in front
		String name = nameTextField.getText();
		String fName = fNameTextField.getText();
		String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
		
		String gender = null;
		if (male.isSelected()) {
			gender = "male";
		} else if (female.isSelected()) {
			gender = "female";
		}
		
		String email = emailTextField.getText();
		
		String mStatus = null;
		if (married.isSelected()) {
			mStatus = "Married";
		} else if (divorced.isSelected()) {
			mStatus = "Divorced";
		} else if (widowed.isSelected()) {
			mStatus = "Widowed";
		} else if (single.isSelected()) {
			mStatus = "Single";
		}
		
		String address = addressTextField.getText();
		String state = stateTextField.getText();
		String city = cityTextField.getText();
		String pin = pinTextField.getText();
		
		try {
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required"); // To show warning is text field is left blank
			} else if (fName.equals("")) {
				JOptionPane.showMessageDialog(null, "Father's Name is required");
			} else if (dob.equals("")) {
				JOptionPane.showMessageDialog(null, "Date of Birth is required");
			} else if (email.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is required");
			}  else if (address.equals("")) {
				JOptionPane.showMessageDialog(null, "Address is required");
			} else if (state.equals("")) {
				JOptionPane.showMessageDialog(null, "State is required");
			} else if (city.equals("")) {
				JOptionPane.showMessageDialog(null, "City is required");
			} else if (pin.equals("")) {
				JOptionPane.showMessageDialog(null, "Pincode is required");
			} else { // Adding values to table, here table name is signUp
				Conn c = new Conn();
				String query = "insert into signUp values('"+formNo+"', '"+name+"', '"+fName+"', '"+dob+"', '"+gender+"', '"+email+"', '"+mStatus+"', '"+address+"', '"+state+"', '"+city+"', '"+pin+"')";
			    c.s.executeUpdate(query);
			    
			    setVisible(false);
			    new SignUpTwo(formNo).setVisible(true);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
