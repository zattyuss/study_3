<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn = null;
	
	try{
		String url = "jdbc:mysql://localhost:3306/WebMarket_db";
		String user = "root";
		String password = "1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
	} catch(SQLException ex){
		out.print("데이터베이스 연결이 실패했습니다.<br>");
		out.print("SQLException : " + ex.getMessage());
	}
%>