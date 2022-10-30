<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style >
	table,tr,td,th{
	border : 1px solid black;
	text-align: center
	}
	table{
	width : 100%;
	}
</style>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>표지</th>
				<th>출판일</th>
				<th>가격</th>
				<th>작가</th>
				<th>내용</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="bookInfo">
				<tr>
					<td>${bookInfo.bookNo }</td>
					<td>${bookInfo.bookName }</td>
					<%-- img 삽입 방법은 두가지임! 둘다 알아놓기 --%>
					<%-- <td><img src="${pageContext.request.contextPath} /resources/images/${bookInfo.bookCovering }"></td>--%>
					<td><img src="<c:url value='resources/images/${bookInfo.bookCovering }'/>" style="width: 100px;"></td>
					<td><fmt:formatDate value="${bookInfo.bookDate }" pattern="yyyy년MM월dd일"/></td>
					<td><fmt:formatNumber value="${bookInfo.bookPrice }"/></td>
					<td>${bookInfo.bookPublisher }</td>
					<td>${bookInfo.bookInfo }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>