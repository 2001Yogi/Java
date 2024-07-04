<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@include file="customer-header.jsp"%>
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
                        <h2>cart list</h2>
                    </div>
                </div>
            </div>
        </div>
    </section>
    
    <section class="cart_area section_padding">
    <div class="container">
      <div class="cart_inner">
        <div class="table-responsive">
          <table class="table">
            <thead>
              <tr>
                <th scope="col">Product</th>
                <th scope="col">Price</th>
                <th scope="col">Quantity</th>
                <th scope="col">Total</th>
                <th scope="col">Remove</th>
              </tr>
            </thead>
            <tbody>
            <%
			int net_price = 0;
			%>
			<%
			List<Cart> cLIst = CartDao.getCartListByCusId(c.getId());
			%>
			<%
			for (Cart cart : cLIst) {
			%>
			<%
			Product p = ProductDao.getProductByPid(cart.getPid());
			%>
			<%
			net_price = net_price + cart.getTotal_price();
			%>
              <tr>
                <td>
                  <div class="media">
                    <div class="d-flex">
                      <img src="image/<%=p.getImage()%>" height="100" width="100" alt="" />
                    </div>
                    <div class="media-body">
                      <p><%=p.getPname()%></p>
                    </div>
                  </div>
                </td>
                <td>
                  <h5><%=p.getPprice()%></h5>
                </td>
                <td>
                  <div class="product_count">
                    <form action="CartController" method="post">
						<input type="hidden" name="cart_id" value="<%=cart.getCart_id()%>"> 
						<input type="hidden" name="pid" value="<%=cart.getPid()%>"> 
						<input type="hidden" name="pprice" value="<%=cart.getPprice()%>">
						<input type="number" name="qty" value="<%=cart.getQty()%>"
							onchange="this.form.submit();">
					</form>
                  </div>
                </td>
                <td>
                  <h5><%=cart.getTotal_price()%></h5>
                </td>
              </tr>
              <%
				}
				%>
              <tr>
                <td></td>
                <td></td>
                <td>
                  <h5>Subtotal</h5>
                </td>
                <td>
                  <h5>Rs.<%=net_price%></h5>
                </td>
              </tr>
              <tr class="shipping_area">
                <td></td>
                <td></td>
                <td>
                  <h5>Shipping</h5>
                </td>
                <td>
                  <div class="shipping_box">
                    <ul class="list">
                      <li>
                        Flat Rate: $5.00
                        <input type="radio" aria-label="Radio button for following text input">
                      </li>
                      <li>
                        Free Shipping
                        <input type="radio" aria-label="Radio button for following text input">
                      </li>
                      <li>
                        Flat Rate: $10.00
                        <input type="radio" aria-label="Radio button for following text input">
                      </li>
                      <li class="active">
                        Local Delivery: $2.00
                        <input type="radio" aria-label="Radio button for following text input">
                      </li>
                    </ul>
                    <h6>
                      Calculate Shipping
                      <i class="fa fa-caret-down" aria-hidden="true"></i>
                    </h6>
                    <select class="shipping_select">
                      <option value="1">Bangladesh</option>
                      <option value="2">India</option>
                      <option value="4">Pakistan</option>
                    </select>
                    <select class="shipping_select section_bg">
                      <option value="1">Select a State</option>
                      <option value="2">Select a State</option>
                      <option value="4">Select a State</option>
                    </select>
                    <input class="post_code" type="text" placeholder="Postcode/Zipcode" />
                    <a class="btn_1" href="#">Update Details</a>
                  </div>
                </td>
              </tr>
              <tr class="out_button_area">
				<td></td>
				<td></td>
				<td></td>
				<td>
					<div class="checkout_btn_inner float-right">
            			<a class="btn_1" href="#">Continue Shopping</a>
            			<a class="btn_1 checkout_btn_1" href="#">Proceed to checkout</a>
          			</div>
				</td>
			</tr>
            </tbody>
          </table>
          <%
			Cart c1 = CartDao.getCartByCusId(c.getId());
			%>
			<%
			out.print(c1);
			%>
			
			<form method="post" action="payment.jsp?amount=<%=net_price%>&cid=<%=c1.getCart_id()%>">
				<table border="1">
					<tbody>
						<tr>
							<th>S.No</th>
							<th>Label</th>
							<th>Value</th>
						</tr>

						<tr>
							<td>1</td>
							<td><label>txnAmount*</label></td>
							<td><input title="TXN_AMOUNT" tabindex="10" type="text"
								name="TXN_AMOUNT" value="<%=net_price%>"></td>
							</tr>
						<tr>
							<td></td>
							<td></td>
							<td><input value="CheckOut" type="submit" onclick=""></td>
						</tr>
					</tbody>
				</table>
				* - Mandatory Fields
			</form>
        </div>
      </div>
      </div>
  </section>
</body>
</html>