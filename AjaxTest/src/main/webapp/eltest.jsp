<%@page import="java.util.ArrayList"%>
<%@page import="com.yedam.java.test.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>eltest.jsp</title>
</head>
<body>
<% //page < request < session < application, 여러개가 있을 때 왼쪽으로 갈수록 먼저 읽음. 
   // 예) session과 request가 있으면 request를 먼저 읽음. 
	session.setAttribute("userInfo", new UserVO("이순신"));
	request.setAttribute("userInfo", new UserVO("홍길동"));

	
%>



el 내장객체 : null 체크(빈 값 그대로 출력됨. 오류 안남!), 자동 형변환 
<hr>
jsp코드 : <%=request.getParameter("name") %> vs 
EL태그 : ${param.name } 
<!-- param 객체 안에 getParameter("name") 내용 다 들어가있음-->
<hr>
<%--=((UserVO)request.getAttribute("userInfo")).getUsername() --%> :
${requestScope.userInfo.getUsername()}
${sessionScope.userInfo.getUsername()} <!-- request, session 정확히 정해서 부르고 싶다면 scope 이용해서 부르기  -->
<hr>
<%=request.getContextPath() %>  : ${pageContext.request.contextPath };
<hr>
ip : ${pageContext.request.remoteAddr }
<hr>
<%= request.getHeader("User-Agent") %> : ${header['User-Agent']};
<hr>
${cookie.JSESSIONID.value };
<script>
	// 장바구니 기능 구현할 때 Session을 사용하면 편리하다. 기억하기
	// 사용자가 이 창을 열지 않기 체크했을 때도, 해당 정보를 session에 넣어두면 편리함.
	obj = {name : '',age : ''};	
	sessionStorage.setItem("OpenYn", "YES");
	localStorage.setItem("openYn", JSON.stringify(obj)); // JSON.stringify : 객체를 String으로 변환
</script>
</body>
</html>