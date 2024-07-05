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
			<div class="col-5 mt-5 pb-0 pt-2 pe-5 ps-5 "
				style="border: 1px solid black; border-radius: 10px">
				<center>
					<h5 class="mt-4 mb-3">Login Page</h5>
				</center>
				<%
				String msg = (String) request.getAttribute("msg");
				%>
				<%
				if (msg != null) {
				%>
				<h2>
					<%
					out.print(msg);
					%>
				</h2>
				<%
				}
				%>
				<form onsubmit="return validateForm()" name="myform"
					action="StudentController" method="post">

					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">Email:- </label>
							</div>
							<div class="col-7">
								<input type="email" class="form-control" id="em" name="email"
									aria-describedby="emailHelp" placeholder="Enter Email"
									style="margin-top: -6px" >
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">Password:- </label>
							</div>
							<div class="col-7">
								<input type="password" class="form-control" id="pass" name="psw"
									placeholder="Enter Password" style="margin-top: -6px" >
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-2"></div>
							<div class="col-2 mt-2 mb-2">
								<button type="submit" class="btn btn-primary" name="action"
									value="login">Login</button>
							</div>
							<div class="col-2 mt-2 mb-2">
								<a href="forgot-password.jsp" style="text-decoration: none;" class="btn btn-primary">Forgot Password</a>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>