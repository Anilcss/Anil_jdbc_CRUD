package controller;



import DTo.Emp;

import java.sql.*;


public class Empdisplay // extends HttpServlet
{
//	@Override
//	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	public static void main(String[] args)
	{
		try {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/netx", "root", "root");
		Statement s=c.createStatement();
		ResultSet e=s.executeQuery("SELECT * FROM EMPTABLE");
		e.next();
		Emp f=new Emp();
		
		f.empid=e.getInt(1);
		f.ename=e.getString(2);
		f.address=e.getString(3);
		f.gender=e.getInt(4);
		f.salary=e.getInt(5);
		f.date=e.getDate(6);
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
class find
{

	int empid;
	String ename;
	String address;
	int gender;
	int salary;
	Date date;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
