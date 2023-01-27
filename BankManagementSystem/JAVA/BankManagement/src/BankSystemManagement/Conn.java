package BankSystemManagement;

import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s;
	public Conn() {
		try {
			c = DriverManager.getConnection("jdbc:mysql:///bankManagemnetSystem", "root", "gingeryeugene");
			s = c.createStatement();
		} catch (Exception e ) {
			System.out.println(e);
		}
	}

}
