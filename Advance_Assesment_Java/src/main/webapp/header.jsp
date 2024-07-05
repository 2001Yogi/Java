<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	
	
	<script>
	function validateForm()() {
		var a = document.forms["myForm"]["fname"].value;
		  if (a == "") {
		    alert("First Name must be Required");
		    return false;
		  }
		var b = document.forms["myForm"]["lname"].value;
		  if (b == "") {
		    alert("Last Name must be Required");
		    return false;
		  }
		  var c = document.forms["myForm"]["em"].value;
		  if (c == "") {
		    alert("Email must be Required");
		    return false;
		  }
		  var d = document.forms["myForm"]["mob"].value;
		  if (d == "") {
		    alert("Mobile must be Required");
		    return false;
		  }
		  var e = document.forms["myForm"]["address"].value;
		  if (e == "") {
		    alert("Address must be Required");
		    return false;
		  }
		  var f = document.forms["myForm"]["gender"].value;
		  if (f == "") {
		    alert("Gender must be Required");
		    return false;
		  }
		  var g = document.forms["myForm"]["psw"].value;
		  if (g == "") {
		    alert("Password must be Required");
		    return false;
		  }
		  var h = document.forms["myForm"]["conf_psw"].value;
		  if (h == "") {
		    alert("Confirm Password must be Required");
		    return false;
		  }
	}
	</script>
	
	<style>
	*{
		box-sizing: border-box;
	}
	</style>
</head>

<body>
	
		<header
			class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
			<ul class="nav nav-pills">
				<li class="nav-item"><a href="index.jsp" class="nav-link"
					aria-current="page">Home</a></li>
				<li class="nav-item"><a href="signup.jsp" class="nav-link">SignUP</a></li>
				<li class="nav-item"><a href="login.jsp" class="nav-link">Login</a></li>
			</ul>
		</header>
	
</body>
</html>