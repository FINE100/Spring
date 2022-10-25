<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<style>
 table,tr,th,td{
 border : 1px solid black;
 text-align: center;
}
table{
width:100%;
}
</style>
</head>
<body>
	<button type="button" onclick="location.href='login'">관리자 페이지</button>
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>가입일자</th>
				<th>연락처</th>
				<th>이메일</th>
				
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="u">
			<tr>
			<td>${u.userId }</td>
			<td>${u.userName }</td>
			<td><fmt:formatDate value="${u.userDate }" pattern="yyyy년MM월dd일"/></td>
			<td>${u.userPhone }</td>
			<td>${u.userEmail }</td>			
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>