<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록 페이지</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<style>
div{
  text-align: center;
    padding: 5px;
}
  table {
    width: 70%;
    border: 2px solid #444444;
    border-collapse: collapse;
    text-align: center;
    margin : auto;
  }
  th, td {
    border: 1px solid #444444;
    padding: 10px;
  }
  
  th{
  background-color: yellow;
  }
  input, textarea{
  width: 100%;
  }
</style>
</head>
<body>
	<form id = "insert" action="insert" method="post"
		onsubmit="return formOption()">
	<div>
			<h3>상품 등록</h3>
		</div>
		<table>
			<tr>
				<th>상품ID</th>
				<td><input type="number" name="productId" value="productId"
					></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="productName"></td>
			</tr>
			<tr>
				<th>단가</th>
				<td><input type="number" name="productPrice"></td>
			</tr>
			<tr>
				<th>상품정보</th>
				<td><textarea name="productInfo" rows="3" col="3"></textarea></td>
			</tr>
			<tr>
				<th>등록일자</th>
				<td><input type="date" name="productDate"></td>
			</tr>
			<tr>
				<th>공급업체</th>
				<td><input type="text" name="company"></td>
			</tr>
			<tr>
				<th>담당자</th>
				<td><input type="text" name="managerId"></td>
			</tr>
		</table>
		<br>
		<button type="submit">등록</button>
		<button type="button">조회</button>
	</form>
	<script>
	$(document).read(function(){			
		$('button:contains("조회")').click(function(){
			location.href = 'list'
		})
	});
	
	function formOption(){
		//1) 도서명 입력 여부
		let productName = $('input[name="productName"]');
		if(productName.val()==''){
			alert("상품명이 입력되지 않았습니다.")
			productName.focus(); // focus 이벤트 강제 발생 (메서드 붙이기)
			return false; // 입력되지 않도록 onsubmit 막기
		}			
			
		//2) 등록 알림창 띄우기
		alert('상품등록이 완료 되었습니다.');
		return true; // onsubmit 발생
	}
	
	</script>
</body>
</html>