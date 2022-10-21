<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 등록폼</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
	<!-- action : 가야하는 경로 (mapping이름) -->
	<form id="insertForm" action="insert" method="post"
		onsubmit="return formOption()">
		<div>
			<h3>게시글 등록</h3>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<td><input type="number" name="bno"  value="${no}" readonly></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="contents"></textarea></td>
			</tr>
			<tr>
				<th>첨부이미지</th>
				<td><input type="text" name="image"></td>
			</tr>
		</table>
		<button type="submit">등록</button>
		<button type="button">목록</button>
	</form>
	<script type="text/javascript">
		$(document).read(function(){			
			$('button:contains("목록")').click(function(){
				location.href = 'list'
			})
		});
		
		function formOption(){
			let title = $('input[name="title"]');
			let writer = $('input[name="writer"]');
			let contents = $('textarea[name="contents"]');
			
			if(title.val() == ""){
				alert("제목이 입력 되지 않았습니다.");
				title.focus(); // 제목으로 이동
				return false; // onsubmit=return false
			}
			
			if(writer.val() == ""){
				alert("작성자가 입력 되지 않았습니다.");
				writer.focus(); // 제목으로 이동
				return false;  // onsubmit=return false
			}
			
			if(contents.val() == ""){
				alert("내용이 입력 되지 않았습니다.");
				contents.focus(); // 제목으로 이동
				return false;  // onsubmit=return false
			}
			
			return true;  // onsubmit=return true
		}
			
			
		
	</script>
</body>
</html>