<%-- <%@page import="controller.Empdetails"%>
<%@page import="controller.Empdisplay"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="DTo.Emp" %>
    <%@page import="java.util.*"%>
 
<%@page import="java.sql.*"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border=\"2\">


	<tr>
	<th>EmpID</th>
	<th>Ename</th>
	<th>Address</th>
	<th>Gender</th>
	<th>Salary</th>
	<th>BirthDate</th>
	
	</tr>
	<%-- <%
	try {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/netx", "root", "root");
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM EMPTABLE");
		r.next();
		Emp f=new Emp();
		
		f.empid=r.getInt(1);
		f.ename=r.getString(2);
		f.address=r.getString(3);
		f.gender=r.getInt(4);
		f.salary=r.getInt(5);
		f.date=r.getDate(6);
		
			
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	
	%>
	 --%>
</table>


</body>
</html>