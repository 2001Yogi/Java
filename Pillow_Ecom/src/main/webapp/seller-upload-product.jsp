<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="seller-header.jsp"%>
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
	                        <h2>Seller Upload Product</h2> 
	                    </div>
	                </div>
	            </div>
	        </div>
	</section>
	<!--================login_part Area =================-->
    <section class="login_part section_padding ">
        <div class="container">
            <div class="row align-items-center">
                
                <div class="col-lg-12 col-md-12">
                    <div class="login_part_form">
                        <div class="login_part_form_iner">
                            <form class="row contact_form" action="ProductController" method="post" novalidate="novalidate" enctype="multipart/form-data">
                                <input type ="hidden" name="sid" value="<%=s1.getId()%>">
                                <div class="col-md-12 form-group p_star">
                                    <input type="file" class="form-control" id="name" name="image" placeholder="Image" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Image'" >
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="pname" placeholder="Product Name" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Product Name'" >
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="pprice" placeholder="Product Price" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Product Price'">
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="pcategory" placeholder="Product Category" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Product Category'">
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="pdesc" placeholder="Product Description" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Product Description'">
                                </div>
                                <div class="col-md-12 form-group">
                                    <button type="submit" value="upload" name= "action" class="btn_3">
                                        Upload
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