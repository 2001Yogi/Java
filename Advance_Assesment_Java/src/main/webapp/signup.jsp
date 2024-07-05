<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-3"></div>
			<div class="col-7 mt-2 pb-0 pt-2 pe-5 ps-5 " style="border:1px solid black;border-radius:10px">
			<center><h5>User Sign Up</h5></center>
                                <%
								String msg = (String)request.getAttribute("msg");
								%>
								<%if(msg!=null){ %>
									<h2><%out.print(msg); %></h2>
								<%} %>
				<form onsubmit="return validateForm()" name="myform" action="StudentController" method="post">
					<div class="form-group mt-2">
						<div class="row">
							<div class="col-2">
								<label for="name">First Name:- </label> 
							</div>
							<div class="col-6">
								<input type="text" class="form-control" id="name1" name="fname"
								placeholder="Enter First Name" style="margin-top:-6px" required>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">Last Name:- </label> 
							</div>
							<div class="col-6">
								<input type="text" class="form-control" id="name2" name="lname"
								placeholder="Enter Last Name" style="margin-top:-6px" required>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">Email Address:- </label> 
							</div>
							<div class="col-6">
								<input type="email" class="form-control" id="em" name="email"
								aria-describedby="emailHelp" placeholder="Enter Email" style="margin-top:6px" required>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">Mobile:- </label> 
							</div>
							<div class="col-6">
								<input type="text" class="form-control" id="mob" name="mobile"
								 placeholder="Enter Mobile Number" style="margin-top:-6px" required>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">Address:- </label> 
							</div>
							<div class="col-6">
								<textarea name="address" id="add" style="width:330px;height:100px;" required></textarea>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label >Gender:- </label> 
							</div>
							<div class="col-6 d-flex">
								<input type="radio"  id="gen" name="gender" value="Male"
								 style="margin-top:-6px" class="me-2" >
								 <label for="name">Male </label> 
								 <input type="radio" id="gen" name="gender" value ="Female"
								 style="margin-left:20px;margin-top:-6px;" class="me-2">
								 <label for="name">Female </label> 
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">Password:- </label> 
							</div>
							<div class="col-6">
								<input type="password" class="form-control" id="pass" name="psw"
								 placeholder="Enter Password" style="margin-top:-6px" required>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">Confirm Password:- </label> 
							</div>
							<div class="col-6">
								<input type="password" class="form-control" id="c_pass" name="conf_psw"
								 placeholder="Enter Confirm Password" style="margin-top:6px" required>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
						<div class="col-8"></div>
							<div class="col-2">
								<button type="submit" class="btn btn-primary" name="action" value="register">Submit</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>