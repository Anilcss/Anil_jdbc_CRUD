package signup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/netx","root","root");
		Statement s=c.createStatement();
		s.execute("create table EMPTABLE(EMPID INTEGER PRIMARY KEY NOT NULL,NAME VARCHAR(100) NOT NULL,ADDRESS VARCHAR(200) NOT NULL,GENDER INTEGER ,SALARY INTEGER NOT NULL,BIRTHDATE DATE NOT NULL)");
		c.close();
		System.out.println("Employee Table Created");
	}
}
