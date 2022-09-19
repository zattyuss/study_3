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

<title>배송 정보</title>
</head>
<body>
<%@ include file="/layout/menu.jspf" %>
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3">배송 정보</h1>
	</div>
</div>
<div>
	<form action="./processShippingInfo.jsp" class="form-horizontal" method="post">
		<input type="hidden" name="cartId" value="<%=request.getParameter("cartId") %>"/>
		<div class="form-group row">
			 <label class="col-sm-2">성명</label>
			 <div class="col-sm-3">
			 	<input name="name" type="text" class="form-control"/>
			 </div>		
		</div>
		<div class="form-group row">
			 <label class="col-sm-2">배송일</label>
			 <div class="col-sm-3">
			 	<input name="shippingDate" type="text" class="form-control"/>(yyyy년/mm월/dd일)
			 </div>		
		</div>
		<div class="form-group row">
			 <label class="col-sm-2">국가명</label>
			 <div class="col-sm-3">
			 	<input name="country" type="text" class="form-control"/>
			 </div>		
		</div>
		<div class="form-group row">
			 <label class="col-sm-2">우편번호</label>
			 <div class="col-sm-3">
			 	<input name="zipCode" type="text" class="form-control"/>
			 </div>		
		</div>
		<div class="form-group row">
			 <label class="col-sm-2">주소</label>
			 <div class="col-sm-5">
			 	<input name="addressName" type="text" class="form-control"/>
			 </div>		
		</div>
		<div class="form-group row">
		 	<div class="col-sm-offset-2 col-sm-10">
		 		<a href="./cart.jsp?cartId=<%=request.getParameter("cartId") %>"
		 		class="btn btn-secondary" role="button">이전</a>
				<input type="submit" class="btn btn-primary" value="등록"/>
				<a href="./checkOutCancellde.jsp" class="btn btn-secondary" role="button">취소</a>
			</div>	 	
		</div>
	</form>
</div>
</body>
</html>