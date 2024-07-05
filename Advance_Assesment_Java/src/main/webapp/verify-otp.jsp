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
					<h5 class="mt-4 mb-3">Forgot password</h5>
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
				<%int otp  = (Integer)request.getAttribute("otp"); %>
				<input type="hidden" name="email" value="<%=email%>">
                <input type="hidden" name="otp1" value="<%=otp%>">
					<div class="form-group">
						<div class="row">
							<div class="col-2">
								<label for="name">OTP:- </label>
							</div>
							<div class="col-7">
								<input type="text" class="form-control" id="em" name="otp2"
									aria-describedby="emailHelp" placeholder="Enter OTP"
									style="margin-top: -6px" required>
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-2"></div>
							<div class="col-7">
								<button type="submit" value="verify" name= "action" class="btn btn-primary btn_3">
                                        Verify
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