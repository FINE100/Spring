<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

</head>
<body>
<form id="modifyForm" action="/freeBoard/modify"method="post">
	<table>
		<tr>
			<th>번호</th>
			<td><input type="number" name="bno" value="${board.bno }" readonly></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="title" value="${board.title }"></td>
		</tr>		
		<tr>
			<th>내용</th>
			<td><textarea rows="3" cols="2" style ="width:100px;">${board.contents }</textarea></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input value = "${board.writer }"></td>
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
	<div id="button_wrap">
	<a class="btn" id="list_btn">목록</a>
	<a class="btn" id="modify_btn">수정</a>
	<a class="btn" id="cancel_btn">취소</a>
	</div>
	</form>
	<form id="infoForm" action="/freeBoard/modify" method="get">
		<input type="hidden" id="bno" name="bno" value='<c:out value="${board.bno }"/>'>
	</form>
	<script type="text/javascript">
	let form = $('#infoForm');
	let mform = $('#modifyForm');
	
	/*목록 페이지 이동*/
	$('list_btn').on('click', function(e){
		form.find("#bno").remove();
		form.attr("action", '/freeBoard/list');
		form.submit();
	});
	
	/*수정하기 버튼 */
	$('modify_btn').on('click', function(e){
		form.submit();
	});
	
	/*취소 버튼*/
	$('cancel_btn').on('click', function(e){
		form.attr("action", '/freeBoard/info')
		form.submit();
	});
	
	</script>
</body>
</html>