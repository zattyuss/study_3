<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value='<%= request.getParameter("language") %>'/>
<fmt:setBundle basename="bundle.message" var="resourceBundle" />

<%@ include file="/layout/menu.jspf"%>
<div class="jumbotron">
    <div class="container">
        <h1 class="display-3"><fmt:message key ="title" bundle="${resourceBundle}" /></h1>
    </div>
</div>
<div class="container">
	<div class="text-right">
		<a href="?language=ko">Korean</a>|<a href="?language=en">English</a>
		<a href="logout.jsp" class="btn btn-smm btn-success pull-right">logout</a>
	</div>
    <form name="newProduct" action="./processAddProduct.jsp" class="form-horizontal" method="post" enctype="multipart/form-data">
        <div class="form-group row">
            <label class="col-sm-2"><fmt:message key ="productId" bundle="${resourceBundle}"/></label>
            <div class="col-sm-3">
                <input type="text" id = "productId" name="productId" class="form-
                control"></input>
            </div>
        </div>
    <div class="form-group row">
        <label class="col-sm-2"><fmt:message key ="pname" bundle="${resourceBundle}"/></label>
        <div class="col-sm-3">
            <input type="text" id = "name" name="name" class="form-control">
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2"><fmt:message key ="unitPrice" bundle="${resourceBundle}"/></label>
        <div class="col-sm-3">
            <input type="text" id = "unitPrice" name="unitPrice" class="form-control">
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2"><fmt:message key ="description" bundle="${resourceBundle}"/></label>
         <div class="col-sm-5">
            <textarea name="description" cols="50" rows="2"
            class="form-control"></textarea>
         </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2"><fmt:message key ="manufacturer" bundle="${resourceBundle}"/></label>
         <div class="col-sm-3">
            <input type="text" name="manufacturer" class="form-control">
         </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2"><fmt:message key ="category" bundle="${resourceBundle}"/></label>
         <div class="col-sm-3">
            <input type="text" name="category" class="form-control">
         </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2"><fmt:message key ="unitsInStock" bundle="${resourceBundle}"/></label>
         <div class="col-sm-3">
            <input type="text" id = "unitsInStock" name="unitsInStock" class="form-
            control">
         </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2"><fmt:message key ="condition" bundle="${resourceBundle}"/></label>
         <div class="col-sm-5">
            <input type="radio" name="condition" value="New">
            <fmt:message key ="condition_New" bundle="${resourceBundle}"/>
            <input type="radio" name="condition" value="Old">
            <fmt:message key ="condition_Old" bundle="${resourceBundle}"/>
            <input type="radio" name="condition" value="Refurbished">
            <fmt:message key ="condition_Refurbished" bundle="${resourceBundle}"/>
         </div>
    </div>
    <div class="form-group row">
    	<label class="col-sm-2"><fmt:message key ="productImage" bundle="${resourceBundle}"/></label>
    	<div class="col-sm-5">
    		<input type="file" name="productImage" class="form-control">
    	</div>
    </div>
    <div class="form-group row">
        <div class="col-sm-offset-2 col-sm-10">
            <input type="button" class="btn btn-primary" value=<fmt:message key ="button" bundle="${resourceBundle}"/> 
            onclick="CheckAddProduct()">
        </div>
    </div>
    </form>
</div>
</body>
</html>