<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서 검색 결과</title>
	</head>
	<body>
			<table border="1" width="600">
				<tr>
					<th>도서 번호</th>
					<th>도서명</th>
					<th>저자</th>
					<th>가격</th>
					<th>출판일</th>
					<th>재고</th>
				</tr>
			<c:choose>
			<c:when test= "${empty bookList }" var="book">
				<tr align="center"><td colspan="6">찾는 상품이 없습니다. </td></tr> 
			</c:when>
			
			<c:otherwise>
			   <c:forEach items="${bookList }" var="book">
			   	<tr><td><a href="<c:url value='/book/bookDetailView/${book.bookNo}'/>">${book.bookNo }</a></td>
			   			<td>${book.bookName }</td>
			   			<td>${book.bookAuthor }</td>
			   			<td>${book.bookPrice}</td>
			   			<td>${book.bookDate }</td>
			   			<td>${book.qtyNo }</td>
			   	</tr>
			   </c:forEach>
			   </c:otherwise>
			</c:choose>
			</table>
	</body>
</html>