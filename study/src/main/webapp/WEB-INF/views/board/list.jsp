<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jspf"%> 
<div class="container">
	<h2>여행지 추천 게시판</h2>
	<table class="table">
		<tr>
			<th>번호</th> 
			<th>제목</th> 
			<th>작성자</th> 
			<th>등록일</th> 
			<th>수정일</th> 
		</tr>
		<c:forEach items="${list}" var="b">
		<tr>
			<td>${b.bno}</td>
			<td>
				<a href="${contextPath}/board/get?bno=${b.bno}">${b.title}</a>
			</td>
			<td>${b.writer}</td>
			<td>
				<fmt:parseDate var="regDate" value="${b.regDate}" pattern="yyyy-MM-dd'T'HH:mm:ss"/>
				<fmt:formatDate value="${regDate}" pattern="yyyy년MM월dd일 HH시mm분"/>
			</td>
			<td>
			<fmt:parseDate var="updateDate" value="${b.updateDate}" pattern="yyyy-MM-dd'T'HH:mm:ss"/>
			<fmt:formatDate value="${updateDate}" pattern="yyyy년MM월dd일 HH시mm분"/>
			</td>
		</tr>
		</c:forEach>
	</table>
	
</div>
<%@include file="../layout/footer.jspf"%>