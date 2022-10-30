<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="gray-body">
	<div class="wrap-login">
		<section class="login-section">
			<h2 class="hidden">로그인 폼</h2>
			<h5 class="webucks-logo big-logo">관리자 권한 확인</h5>
			
			<!--form Start-->
			<form id = "admin" action="admin" method="get">
				<div class="input-box">
					<input id="userId" name="userId" type="text" class="userId" placeholder="아이디" />
				</div>
				<div class="input-box">
					<input id="userPw" name="userPw" type="password" class="userId" placeholder="비밀번호" />
				</div>
				<button type='submit' id="loginBtn" class="loginBtn" >로그인</button>
			</form>
			<!--form End-->
			
		</section>
	</div>
</body>
<script type="text/javascript">
/
</script>
</html>