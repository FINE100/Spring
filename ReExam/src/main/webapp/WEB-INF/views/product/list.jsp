<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조회/수정 페이지</title>
<style>
div{
  text-align: center;
    padding: 5px;
}
  table {
    width: 100%;
    border: 2px solid #444444;
    border-collapse: collapse;
    text-align: center;
  }
  th, td {
    border: 1px solid #444444;
    padding: 10px;
  }
  
  th{
  background-color: yellow;
  }
  
</style>
</head>
<body>
	<div>
			<h3>상품 조회/수정</h3>
		</div>
		<table>
			<thead>
				<tr>
					<th>상품ID</th>
					<th>이름</th>
					<th>단가</th>
					<th>담당자</th>
					<th>등록일자</th>
					<th>공급업체</th>
				</tr>
			</thead>
			<tbody>
		<c:forEach items="${list }" var="product">
				<tr>
					<td>${product.productId }</td>
					<td>${product.productName}</td>
					<td>${product.productPrice}</td>
					<td>${product.managerName }</td>
					<td><fmt:formatDate value="${product.productDate }" pattern="yyyy/MM/dd"/> </td>
					<td>${product.company }</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>

</body>
</html>