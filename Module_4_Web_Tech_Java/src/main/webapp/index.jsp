<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Information Form</h2>
    <form action="Login" method="post">
        First Name: <input type="text" name="fname" required><br>
        Last Name: <input type="text" name="lname" required><br>
        Email: <input type="email" name="email" required><br>
        Mobile: <input type="text" name="mobile" required><br>
        Gender: 
        <input type="radio" name="gender" value="Male" required> Male
        <input type="radio" name="gender" value="Female" required> Female<br>
        Password: <input type="password" name="password" required><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>