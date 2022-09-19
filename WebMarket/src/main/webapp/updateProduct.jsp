<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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

<title>상품 수정</title>
</head>
<body>
<%@ include file="/layout/menu.jspf" %>
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3">상품수정</h1>
	</div>
</div>
<%@ include file ="dbconn.jsp" %>
		<%
			String productId = request.getParameter("id");
		
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "select * from product where p_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productId);
			rs = pstmt.executeQuery();
			if(rs.next()){
		%>
<div class="container">
	<div class="row">
		<div class="col-md-5">
			<img src='${pageContext.request.contextPath}/upload/<%=rs.getString("p_fileName")%>' style="width: 100%" >
		</div>
		<div class="col-md-7">
		<form name="newProduct" action="./processUpdateProduct.jsp" 
			class="form-hrizontal" method="post" enctype="multipart/form-data">
			<div class="form-group row">
				<label class="col-sm-2">상품코드</label>
				<div class="col-sm-3">
					<input type="text" id="productId"  class="form-control" value="<%= rs.getString("p_id")%>" disabled="disabled"/>
					<input type="hidden" name="productId" value="<%=rs.getString("p_id")%>"> 
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상품명</label>
				<div class="col-sm-10">
					<input type="text" id="name" name="name" class="form-control" value="<%= rs.getString("p_name")%>"/>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">가격</label>
				<div class="col-sm-10">
					<input type="text" id="unitPrice" name="unitPrice" class="form-control" value="<%= rs.getInt("p_unitPrice")%>"/>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상세 설명</label>
				<div class="col-sm-10">
					<textarea name="description" cols="70" rows="10"  class="form-control"><%= rs.getString("p_description")%></textarea>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">제조사</label>
				<div class="col-sm-10">
					<input type="text" name="manufacturer" class="form-control" value="<%= rs.getString("p_manufacturer")%>"/>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">분류</label>
				<div class="col-sm-10">
					<input type="text" name="category" class="form-control" value="<%= rs.getString("p_category")%>"/>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">재고 수</label>
				<div class="col-sm-10">
					<input type="text" id="unitsInStock" name="unitsInStock" class="form-control" value="<%= rs.getString("p_unitsInStock")%>"/>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상태</label>
				<div class="col-sm-10">
					<input type="radio"  name="condition" value="New" />
					신규 제품
					<input type="radio"  name="condition" value="Old"/>
					중고 제품
					<input type="radio"  name="condition" value="Refurbished"/>
					재생 제품
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">이미지</label>
				<div class="col-sm-10">
					<input type="file" name="productImage" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 clo-sm-10">
					<input type="submit" class="btn btn-primary" value="등록">
				</div>
			</div>
			</form>
		</div>
	</div>
</div>
<% 
			}
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
%>
</body>
</html>