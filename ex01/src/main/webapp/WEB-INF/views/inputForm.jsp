<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
	<p> 일반적인 방법 </p>
	<form action="users" method="post">
		<input type="text" name="name">
		<input type="number" name="age">
		<button type="submit">전송</button>
	</form>
	<p> 리스트로 처리 </p>
	<form action="userList">
		<input type="text" name="list[0].name">
		<input type="number" name="list[0].age">
		<input type="text" name="list[1].name">
		<input type="number" name="list[1].age">
		<button type="submit">전송</button>
	</form>
	<br>
	<button onclick="javascript:ajaxUserList();">ajax</button>
	<script type="text/javascript">
		function ajaxUserList(){
			let data = [
				{"name" : "백제니", "age" : 20 },
				{"name" : "노지수", "age" : 22 },
				{"name" : "김리사", "age" : 20 }
				
			]
			
			$.ajax({
				url : 'userList',
				type : 'post',
				contentType : 'application/json',
				data : JSON.stringify(data),
				success : function(data){
					console.log(data);
				},
				error : function(reject){
					console.log(reject)
				}
			})
		}
	</script>
</body>
</html>