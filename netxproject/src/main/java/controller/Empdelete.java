package controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("delete")
public class Empdelete extends HttpServlet
{
				@Override
				protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/netx","root","root");
			//Statement statement=connection.createStatement();
			PreparedStatement ps=connection.prepareStatement("Delete from EMPTABLE where empid=?");
			ps.setLong(1,1);
			ps.executeUpdate();
			connection.close();
			System.out.println("Data Deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
