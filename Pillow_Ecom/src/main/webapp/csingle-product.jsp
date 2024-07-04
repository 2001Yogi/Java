<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="customer-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	%>
	<%
	Product p = ProductDao.getProductByPid(pid);
	%>
	<section class="breadcrumb_part">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb_iner">
						<h2>Product Detail Page</h2>
					</div>
				</div>
			</div>
		</div>
	</section>

	<div class="product_image_area">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-12">
					<div class="product_img_slide owl-carousel">
						<div class="single_product_img">
							<img src="image/<%=p.getImage()%>" alt="#" class="img-fluid">
						</div>
						<div class="single_product_img">
							<img src="image/<%=p.getImage()%>" alt="#" class="img-fluid">
						</div>
						<div class="single_product_img">
							<img src="image/<%=p.getImage()%>" alt="#" class="img-fluid">
						</div>
					</div>
				</div>
				<div class="col-lg-8">
					<div class="single_product_text text-center">
						<img src="image/<%=p.getImage()%>" alt="#" class="img-fluid mb-4">
						<h4><%=p.getPname()%></h4>
						<p><%=p.getPprice()%>Rs.
						</p>
						<p><%=p.getPdescription()%></p>
						<li><span>Category</span> : <%=p.getPcategory()%></li>
						<li><span>Availibility</span> : In Stock</li>
						<h4 class="mt-3">
							<a class="primary-btn"
								href="CartController?action=addtocart&cusid=<%=c.getId()%>&pid=<%=p.getPid()%>">Add
								to Cart</a>
						</h4>
						<!-- <div class="add_to_cart">
                  <a href="#" class="btn_3">add to cart</a>
              </div> -->
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>


	<%-- <div class="product_image_area">
		<div class="container">
			<div class="row s_product_inner">
				<div class="col-lg-6">
					<div class="s_Product_carousel">
						<div class="single-prd-item">
							<img class="img-fluid" src="image/<%=p.getImage() %>" alt>
						</div>
						<div class="single-prd-item">
							<img class="img-fluid" src="image/<%=p.getImage() %>" alt>
						</div>
						<div class="single-prd-item">
							<img class="img-fluid" src="image/<%=p.getImage() %>" alt>
						</div>
					</div>
				</div>
				<div class="col-lg-5 offset-lg-1">
					<div class="s_product_text">
						<h3><%=p.getPname() %></h3>
						<h2><%=p.getPprice() %></h2>
						<ul class="list">
							<li><a class="active" href="#"><span>Category</span> :
									<%=p.getPcategory() %></a></li>
							<li><a href="#"><span>Availibility</span> : In Stock</a></li>
						</ul>
						<p><%=p.getPdescription() %></p>
					
						<div class="card_area d-flex align-items-center">
							<a class="primary-btn" href="CartController?action=addtocart&cusid=<%=c.getId()%>&pid=<%=p.getPid()%>">Add to Cart</a> <a
								class="icon_btn" href="#"><i class="lnr lnr lnr-diamond"></i></a>
							<a class="icon_btn" href="#"><i class="lnr lnr lnr-heart"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div> --%>

</body>
</html>