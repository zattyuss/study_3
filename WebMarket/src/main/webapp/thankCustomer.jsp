<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<title>주문 완료</title>
</head>
<body>
<%
	String shipping_cartId = "";
	String shipping_name = "";
	String shipping_shippingDate = "";
	String shipping_country = "";
	String shipping_zipCode = "";
	String shipping_addressName = "";
	
	Cookie[] cookies = request.getCookies();
	
	if (cookies != null){
		for(int i = 0; i < cookies.length; i++){
			Cookie thisCookie = cookies[i];
			String n = thisCookie.getName();
			if(n.equals("Shipping_cartId"))
				shipping_cartId = URLDecoder.decode((thisCookie.getValue()), "utf-8");
			if(n.equals("Shipping_shippingDate"))
				shipping_shippingDate = URLDecoder.decode((thisCookie.getValue()), "utf-8");
		}
	}
%>

<%@ include file="/layout/menu.jspf" %>
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3">주문 완료</h1>
	</div>
</div>
<div class="container">
	<h2 class="alert alert-danger">주문해주셔서 감사합니다.</h2>
	<p>주문은 <%out.print(shipping_shippingDate); %>에 배송될 예정입니다!</p>
	<p>주문번호 : <%out.println(shipping_cartId); %></p>
</div>
<div class="container">
	<p><a href="./products.jsp" class="btn btn-secondary"> &laquo; 상품 목록</a></p>
</div>
</body>
</html>

<%
	session.invalidate();

	for(int i = 0; i < cookies.length; i++){
		Cookie thisCookie = cookies[i];
		String n = thisCookie.getName();
		if(n.equals("Shipping_cartId"))
			thisCookie.setMaxAge(0);
		if(n.equals("shipping_name"))
			thisCookie.setMaxAge(0);
		if(n.equals("shipping_shippingDate"))
			thisCookie.setMaxAge(0);
		if(n.equals("shipping_country"))
			thisCookie.setMaxAge(0);
		if(n.equals("shipping_zipCode"))
			thisCookie.setMaxAge(0);
		if(n.equals("shipping_addressName"))
			thisCookie.setMaxAge(0);
		
		
		response.addCookie(thisCookie);
	}

%>


