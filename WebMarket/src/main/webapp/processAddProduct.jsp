<%@page import="java.sql.*"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="dto.Product"%>
<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbconn.jsp" %>
<%


	request.setCharacterEncoding("UTF-8");
	String filename ="";
	String realFolder = "C:\\upload"; //웹 애플리케이션상의 절대 경로
	int maxSize = 5*1024*1024; //최대 업로드될 파일의 크기 5MB
	String encType = "utf-8"; //인코딩 유형
	
	MultipartRequest mulit = new MultipartRequest(
	request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());

	String productId = mulit.getParameter("productId");
	String name = mulit.getParameter("name");
	String unitPrice = mulit.getParameter("unitPrice");
	String description = mulit.getParameter("description");
	String manufacturer = mulit.getParameter("manufacturer");
	String category = mulit.getParameter("category");
	String unitsInStock = mulit.getParameter("unitsInStock");
	String condition = mulit.getParameter("condition");
	
	Integer price;
	
	if (unitPrice.isEmpty())
		price = 0;
	else
		price = Integer.valueOf(unitPrice);
	
	long stock;
	
	if(unitsInStock.isEmpty())
		stock = 0;
	else
		stock = Long.valueOf(unitsInStock);
	
	Enumeration files = mulit.getFileNames();
	String fname = (String) files.nextElement();
	String fileName = mulit.getFilesystemName(fname);
	
	PreparedStatement pstmt = null;
	
	String sql = "insert into product values(?,?,?,?,?,?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, productId);
	pstmt.setString(2, name);
	pstmt.setInt(3, price);
	pstmt.setString(4, description);
	pstmt.setString(5, category);
	pstmt.setString(6, manufacturer);
	pstmt.setLong(7, stock);
	pstmt.setString(8, condition);
	pstmt.setString(9, fileName);
	pstmt.executeUpdate();
	
	if(pstmt != null) pstmt.close();
	if(conn != null)conn.close();
	
	response.sendRedirect("products.jsp");
%>
</body>
</html>