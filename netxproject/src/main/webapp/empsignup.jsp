<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
    <form action="empage">
        <table border="4px">
            <tr>
                <td>EmployeeID</td>
                <td><input type="number" name="empid"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text"  name="name"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><textarea name="address" id="address1" width="120px" rows="7"></textarea></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>Male:<input type="radio" name="gender" value="1">
                Female:<input type="radio" name="gender" value="2"></td>
            </tr>
            <tr>
                <td>Salary</td>
                <td><input type="number" name="salary"></td>
            </tr>
            <tr>
                <td>Birthdate</td>
                <td><input type="date" name="date"></td>
            </tr>

            <tr>
                <td><button type="submit">Submit</button></td>
                <td><button type="reset">Cancel</button></td>
            </tr>
        </table>
    </form>
</body>
</html>