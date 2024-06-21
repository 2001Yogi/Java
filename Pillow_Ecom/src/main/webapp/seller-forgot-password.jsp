<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<section class="breadcrumb_part">
	        <div class="container">
	            <div class="row">
	                <div class="col-lg-12">
	                    <div class="breadcrumb_iner">
	                        <h2>Seller Forgot Password</h2> 
	                    </div>
	                </div>
	            </div>
	        </div>
	</section>
	<!--================login_part Area =================-->
    <section class="login_part section_padding ">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-6 col-md-6">
                    <div class="login_part_text text-center">
                        <div class="login_part_text_iner">
                            <h2>New to our Shop?</h2>
                            <p>There are advances being made in science and technology
                                everyday, and a good example of this is the</p>
                            <a href="#" class="btn_3">Create an Account</a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="login_part_form">
                        <div class="login_part_form_iner">
                            <h3>Forgot Password</h3>
                                <%
								String msg = (String)request.getAttribute("msg");
								%>
								<%if(msg!=null){ %>
									<h2><%out.print(msg); %></h2>
								<%} %>
                            <form class="row contact_form" action="SellerController" method="post" novalidate="novalidate">
                                
                                <div class="col-md-12 form-group p_star">
                                    <input type="email" class="form-control" id="name" name="email" placeholder="Email" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Email'" >
                                </div>
                                <div class="col-md-12 form-group">
                                    <button type="submit" value="get-otp" name= "action" class="btn_3">
                                        Get OTP
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--================login_part end =================-->
	 <%@ include file="footer.jsp"%>
</body>
</html>