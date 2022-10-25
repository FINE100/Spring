<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
<style type="text/css">
	.insert{
	width:100%;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
	<div id="insert">
	<form action="bookinsert" method="post" onsubmit="return formOption()"> 
	<!-- name과 value 중요함. vo와 name이 같아야 데이터 들어감 -->
	<!-- onsubmit : submint 하기 전에 함수 실행시키겠다-->
	
		<table>
		<tr>
			<th>도서번호</th>
			<td><input type="text" name="bookNo" value="${info.bookNo }" readonly></td>
		</tr>
		<tr>
			<th>도서명</th>
			<td><input type="text" name="bookName" value=""></td>
		</tr>
		<tr>
			<th>도서표지</th>
			<td><input type="text" name="bookCovering" value=""></td>
		</tr>
		<tr>
			<th>출판일자</th>
			<td><input type="date" name="bookDate" value=""></td>
		</tr>
		<tr>
			<th>금액</th>
			<td><input type="number" name="bookPrice" value=""></td>
		</tr>
		<tr>
			<th>출판사</th>
			<td><input type="text" name="bookPublisher" value=""></td>
		</tr>		
		<tr>
			<th>도서소개</th>
			<td><textarea rows="3" col="3" name="bookInfo"></textarea></td>
		</tr>				
		</table>
		<button type="submit">등록</button>
		<button type="button">조회</button>	
	</form>
	</div>
	<script type="text/javascript">
		function formOption(){
		//1) 도서명 입력 여부
		let tag = $('input[name="bookName"]');
		if(tag.val()==''){
			alert("도서명이 입력되지 않았습니다.")
			tag.focus(); // focus 이벤트 강제 발생 (메서드 붙이기)
			return false; // 입력되지 않도록 onsubmit 막기
		}			
			
		//2) 등록 알림창 띄우기
		alert('도서등록이 완료 되었습니다.');
		return true; // onsubmit 발생
	}
	</script>
</body>
</html>