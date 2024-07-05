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
					<h5 class="mt-4 mb-3">New password</h5>
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
				<form  name="myform"
					action="StudentController" method="post">
				<%String email = (String)request.getAttribute("email"); %>
				<input type="hidden" name="email" value="<%=email%>">
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">New Password:- </label>
							</div>
							<div class="col-7">
								<input type="text" class="form-control" id="em" name="np"
									 placeholder="Enter New Password"
									style="margin-top: -6px" required>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">Confirm New Password:- </label>
							</div>
							<div class="col-7">
								<input type="text" class="form-control" id="em" name="cnp"
									 placeholder="Enter Confirm New Password"
									style="margin-top: 6px" required>
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-2"></div>
							<div class="col-7">
								<button type="submit" value="new pass" name= "action" class=" btn btn-primary btn_3">
                                        Submit
                                </button>
							</div>
						</div>
					</div>

					
				</form>
			</div>
		</div>
	</div>
</body>
</html>