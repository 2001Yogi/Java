<%@page import="model.student"%>
<%@page import="dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
	
<title>Insert title here</title>
</head>
<body>
<%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
  %>
 <%
 student s1 = null;
if(session.getAttribute("data")!=null){
	s1 = (student)session.getAttribute("data");
}
else{
	response.sendRedirect("login.jsp");
}
%>
	<header
			class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
			<ul class="nav nav-pills">
				<li class="nav-item"><a href="index.jsp" class="nav-link"
					aria-current="page">Home</a></li>
				<li class="nav-item"><a href="logout.jsp" class="nav-link">LogOut &nbsp;&nbsp;(<%=s1.getFname()%>&nbsp;<%=s1.getLname()%>)</a></li>
				<li class="nav-item"><a href="change-password.jsp" class="nav-link">Change Password</a></li>
			</ul>
		</header>
</body>
</html>