package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTo.Emp;

/**
 * Servlet implementation class Empdetails
 */

public class Empdetails extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int empid = Integer.parseInt(req.getParameter("empid"));
		String ename = req.getParameter("name");
		String address = req.getParameter("address");
		int gender = Integer.parseInt(req.getParameter("gender"));
		int salary = Integer.parseInt(req.getParameter("salary"));
		Date date = Date.valueOf(req.getParameter("date"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/netx", "root", "root");
			PreparedStatement ps = c.prepareStatement("INSERT INTO EMPTABLE VALUES(?,?,?,?,?,?)");

			ps.setInt(1, empid);
			ps.setString(2, ename);
			ps.setString(3, address);
			ps.setInt(4, gender);
			ps.setInt(5, salary);
			ps.setDate(6, date);
			ps.executeUpdate();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Data Inserted");
		res.sendRedirect("/netxproject/menu.jsp");

	}

}
