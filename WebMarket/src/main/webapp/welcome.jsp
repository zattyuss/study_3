<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>종합 쇼핑물</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stlyesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</head>
<body>
<%
	String greeting = "IT 인터넷 쇼핑몰";
	String tagline = "IT 인터넷 쇼핑몰에 오신 걸 환영합니다";
%>
<%
	response.setIntHeader("Refresh", 10);
	Date day = new Date();
	String am_pm;
	int hour = day.getHours();
	int minute = day.getMinutes();
	int second = day.getSeconds();
	if(hour/12 == 0){
		am_pm = "AM";
	}else {
		am_pm = "PM";
		hour = hour -12;
	}
	String CT = hour + ":" + minute + ":" + second + " " + am_pm;
	
%>
<%@ include file="/layout/menu.jspf" %>
<div class="jumbotron">
	<div class="container">
		<h1 class="display"><%= greeting %></h1>
	</div>
</div>
<div class="container">
	<div class="text-center">
		<h3><%= tagline %></h3>
		<p>현재 접속 시간<%= CT %></p>
	</div>
</div>
<%@ include file="/layout/footer.jspf" %>


</body>
</html>