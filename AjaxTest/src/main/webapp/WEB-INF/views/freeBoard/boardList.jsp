<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<style>
</style>
</head>
<div id="boardList">
	<body>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<!-- items : 서버에서 보내온 값 -->
				<c:forEach items="${boardList }" var="board">
					<tr name="${board.bno }">
						<td>${board.bno }</td>
						<td>${board.title }</td>
						<td>${board.writer }</td>
						<td><fmt:formatDate value="${board.regdate }"
								pattern="yyyy년MM월dd일" /></td>
						<td><button value="${board.bno }">삭제</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>
<script type="text/javascript">


//등록 성공 여부에 따른 메세지 보내기
 	let resultMsg = '${msg}';
	if(resultMsg != null && resultMsg !=""){
		alert(resultMsg);
	} 
	
		
	
	$('#boardList td > button').click(function(){
		console.log('check');
		let bno = $(this).closest('tr').attr('name');
		$.ajax({
			url : 'delete',
			type : 'post',
			dataType : 'text',
			contentType : 'application/x-www-form-urlencoded; charset=UTF-8	',
			data : {'bno' : bno } , // 정보를 담아서 보내는 곳
			success : function(data){
				alert(data);
			},
			error : function(reject){
				alert(reject);
			}
		});
		
		return false;
		
	})
	
	</script>
</body>
</html>