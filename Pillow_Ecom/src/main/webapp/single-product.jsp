<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="seller-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<%int pid = Integer.parseInt(request.getParameter("pid")); %>
<%Product p = ProductDao.getProductByPid(pid); %>

	<section class="breadcrumb_part">
	        <div class="container">
	            <div class="row">
	                <div class="col-lg-12">
	                    <div class="breadcrumb_iner">
	                        <h2>Seller Update Product</h2> 
	                    </div>
	                </div>
	            </div>
	        </div>
	</section>
	<section class="login_part section_padding ">
        <div class="container">
            <div class="row align-items-center">
                
                <div class="col-lg-12 col-md-12">
                    <div class="login_part_form">
                        <div class="login_part_form_iner">
                            <form class="row contact_form" action="ProductController" method="post" novalidate="novalidate" enctype="multipart/form-data">
                                <input type ="hidden" name="pid" value="<%=p.getPid() %>">
                                <div class="col-md-12 form-group p_star">
                                    <img src="image/<%=p.getImage()%>" height="100" width="100">
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="pname" value = "<%=p.getPname() %>"  >
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="pprice" value = "<%=p.getPprice() %>">
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="pcategory" value = "<%=p.getPcategory() %>">
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="pdesc" value = "<%=p.getPdescription() %>">
                                </div>
                                <div class="col-md-12 form-group">
                                    <button type="submit" value="update" name= "action" class="btn_3">
                                        Update
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
     <%@ include file="footer.jsp"%>
</body>
</html>