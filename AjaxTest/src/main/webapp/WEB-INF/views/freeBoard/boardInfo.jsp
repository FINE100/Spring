<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<td><input type="number" name="bno" value="${board.bno }" readonly></td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${board.title }</td>
		</tr>		
		<tr>
			<th>내용</th>
			<td><textarea rows="3" cols="2" style ="width:100px;" readonly>${board.contents }</textarea></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.writer }</td>
		</tr>
		<tr>
			<th>첨부파일</th>
		<!-- 이미지 경로 지정하는법 1 <td><img src="${pageContext.request.contextPath }/resources/${board.image}" alt="이미지"/></td> -->
			<td><img src="<c:url value='/resources/images/${board.image }'/>" alt="이미지" ></td>
		</tr>
		<tr>
			<th>작성일자</th>
			<td><fmt:formatDate value="${board.regdate }" pattern="yyyy/MM/dd"/></td> <!-- 소문자 mm은 분(minute) -->
		</tr>
	</table>
</body>
</html>