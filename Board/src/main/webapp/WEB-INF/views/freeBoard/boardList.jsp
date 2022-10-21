<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<style>
	
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody><!-- items : 서버에서 보내온 값 -->
			<c:forEach items="${boardList }" var="board">
				<tr>
					<td>${board.bno }</td>
					<td>${board.title }</td>
					<td>${board.writer }</td>
					<td><fmt:formatDate value="${board.regdate }" pattern="yyyy년MM월dd일"/></td>
				</tr>
			</c:forEach> 
		</tbody>
	</table>
	<script type="text/javascript">
	//등록 성공 여부에 따른 메세지 보내기
	let resultMsg = '${msg}';
	if(resultMsg != null && resultMsg =""){
		alert(resultMsg);
	}
	
	</script>
</body>
</html>