package DTo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;




public class Emp 
{
	
	public int empid;
	public String ename;
	public String address;
	public int gender;
	public int salary;
	public Date date;

	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<Emp> fetchAll() throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/netx", "root", "root");
		Statement s=c.createStatement();
		return (List<Emp>) s.executeQuery("select * from EMPTABLE *");
	}

}
