<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ include file="customer-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<section class="breadcrumb_part">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb_iner">
                        <h2>Product list</h2>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- breadcrumb part end-->
    
    <!-- product list part start-->
    <section class="product_list section_padding">
        <div class="container">
            <div class="row">
            <div class="col-md-1"></div>
                <div class="col-md-8">
                    <div class="product_list">
                        <div class="row">
                        <%List<Product> list = ProductDao.getAllProducts(); %>
						<%String msg = (String)request.getAttribute("msg"); %>
									<%if(msg!=null){%>
										<h5><%out.print(msg); %></h5>
									<%} %>
						<%for(Product p : list){ %>
                            <div class="col-lg-6 col-sm-6">
                                <div class="single_product_item ">
                                    <img src="image/<%=p.getImage() %>" alt="#" class="img-fluid">
                                    <h3> <a href="csingle-product.jsp?pid=<%=p.getPid()%>"><%=p.getPname() %></a> </h3>
                                    <p>Rs. <%=p.getPprice() %></p>
                                </div>
                                	<a style="margin-top: -30px !important" href="CartController?action=addtocart&cusid=<%=c.getId()%>&pid=<%=p.getPid()%>"> 
										<p style="margin-top: -30px !important">Add to Cart</p>
									</a> 
									<a class="mb-2" href="WishListController?action=add&cusid=<%=c.getId()%>&pid=<%=p.getPid()%>"> 
										<p class="mb-5">Add to Wishlist</p>
									</a> 
                            </div>
                           
                        </div>
                        <%} %>
                       
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- product list part end-->
    
</body>
</html>