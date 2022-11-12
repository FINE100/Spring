
<%@page import="com.yedam.java.test.UserVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstltest.jsp</title>
</head>
<body>

<% 
// for문 돌리기 
ArrayList<UserVO> list  = new ArrayList<UserVO>();
list.add(new UserVO("이순신"));
list.add(new UserVO("홍길동"));	
list.add(new UserVO("김기자"));
list.add(new UserVO("박대기"));
request.setAttribute("userList", list);
request.setAttribute("content", "<u>test</u>");
%>

${content }
<c:out value="${content }"/>
<c:out value="${content }" escapeXml="false"/> <br>

처음 사람은 이씨 입니까? ${fn:startsWith(userList[0].username, '이')} <br>

총 인원 ${fn:length(userList) }명입니다. <br>
<c:forEach var="list" items="${userList }" varStatus="st">
	${st.count } ${list.username }<br>
</c:forEach>
</body>
</html>