<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
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
<%
	String cartId = session.getId();
%>
<title>Insert title here</title>
</head>
<body>
<%@ include file="/layout/menu.jspf" %>
<div class="jumbotron">
	<div class="container">
		<h1 class="display">장바구니</h1>
	</div>
</div>

<div class="container">
	<div class="row">
		<table width="100%">
			<tr>
				<td align="left"><a href="./deleteCart.jsp?cartId=<%= cartId%>" 
				class="btn btn-danger">삭제하기</a></td>
				<td align="right"><a href="./shippingInfo.jsp?cartId=<%=cartId %>" class="btn btn-success">주문하기</a></td>
			</tr>
		</table>
</div>

<div style="padding-top: 50px">
	<table class="table table-hover">
		<tr>
			<th>상품</th>
			<th>가격</th>
			<th>수량</th>
			<th>소계</th>
			<th>비고</th>
		</tr>
		
		<%
			int sum = 0;
			ArrayList<Product> cartList = (ArrayList<Product>)session.getAttribute("cartlist");
			if(cartList == null)
				cartList = new ArrayList<Product>();
			
			for(int i = 0; i < cartList.size(); i++){ //상품 리스트 하나씩 출력하기
				Product product = cartList.get(i);
				int total = product.getUnitPrice() * product.getQuantity();
				sum = sum+total;
			
			
		%>
		
		<tr>
			<td><%=product.getProductId() %> - <%=product.getPname()%></td>
			<td><%=product.getUnitPrice() %></td>
			<td><%=product.getQuantity() %></td>
			<td><%=total %></td>
			<td><a href="./removeCart.jsp?id=<%= product.getProductId()%>" class="badge badge-danger">삭제</a></td>
		</tr>
		<%
		}
		%>
		<tr>
			<th></th>
			<th></th>
			<th>총액</th>
			<th><%=sum %></th>
			<th></th>
		</tr>
	</table>
	<a href="./products.jsp" class="btn btn-secondary">&laquo; 쇼핑 계속하기</a>
</div>
	<hr>
</div>
<%@ include file="/layout/footer.jspf" %>











</body>
</html>