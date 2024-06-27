<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file ="customer-header.jsp" %>
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
                        <h2>product list</h2>
                    </div>
                </div>
            </div>
        </div>
    </section>
    
    <section class="product_list section_padding">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product_list">
                        <div class="row">
                        <%List<WishList> list = WishListDao.getWishListByCusId(c.getId()); %>
						<%for(WishList w : list){ %>
						<%Product p = ProductDao.getProductByPid(w.getPid()); %>
                            <div class="col-lg-6 col-sm-6">
                                <div class="single_product_item">
                                    <img src="image/<%=p.getImage() %>" alt="#" class="img-fluid">
                                    <h3> <%=p.getPname() %> </h3>
                                    <p>Rs. <%=p.getPprice() %></p>
                                    <a href="WishListController?action=remove&wid=<%=w.getWid()%>">
										<p>Remove</p>
									</a> 
                                </div>
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