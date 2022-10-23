<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, tr, th, td{
		border : 1px solid black;
		margin : 0px;
		padding : 0px;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
	<!-- 방법1 ) jstl 이용하여 테이블 형태로 출력-->
	<div id="dataList">
		<button type="button" onclick="location.href='insertForm'">사원등록</button>
		<table>
			<thead>
				<tr>
					<th>사번</th>
					<th>이름</th>
					<th>성</th>
					<th>직업</th>
					<th>급여</th>				
					<th>부서번호</th>
					<th>삭제</th>
				</tr>
			</thead>
		
			<tbody>
				<!--items : 배열, list.. var: 하나의 값을 담을 변수 -->
					 
				<!-- 1) onclick = "location.href" 이용하는 방법, get 방식으로만 가능 / 2)name 속성 부가, 어떤 방식이든 다 가능 -->
				<c:forEach items="${empInfoList }" var="empInfo" > 
					<tr name="${empInfo.employeeId }">
					<!-- <tr onclick = "location.href='info?employeeId=${empInfo.employeeId }'"> -->
						<!--controller에서 get방식으로 받고 있기 때문에 onclick으로 이동 시키면 ${empInfo.employeeId } 값을 가지고 감-->
						<td>${empInfo.employeeId }</td>
						<td>${empInfo.lastName}</td>
						<td>${empInfo.firstName}</td>
						<td>${empInfo.jobId}</td>	
						<td>${empInfo.salary}</td>
						<td>${empInfo.departmentId}</td>
						<td><button value="${empInfo.employeeId }">삭제</button></td> <!-- 여기에 ajax 걸기 -->
					</tr>
				</c:forEach>				
			</tbody>
		</table>
		<!-- name 이용해서 페이지 전환할때 form 만들어서 이용 -->
		<form id="input">
			<input type="hidden" name="employeeId">
		</form>
	</div>
	<script>
		let message = '${msg}';
		if(message != null && message != ''){
			alert(message);
		}
		

		
		
		$('#dataList td').click(function(){
			let empId = $(this).parent().attr('name'); // closest() : 가장 가까운 태그를 '위로' 찾음
			$('#input > input').val(empId);
			$('#input').prop('action', 'info')
					   .prop('method', 'get')
					   .submit();
		});
		
		
		$('#dataList td > button').click(function(){
			let empId = $(this).closest('tr').attr('name');	
			$.ajax({
				url : 'delete/'+empId,
				//경로 : delete?employeeId=207 => data 필드 쓰면 자동으로 이방식이 나옴.  
				success : function(data){
					alert(typeof data); // String 반환
				},
				error: function(reject){
					alert(reject)
				}
			});
			
			return false // click(evnet)에 걸린 return false는 페이지 이동을 막아줌(***) 
			//event.stopPropagation -> 이벤트 다시 걸기로 처리도 가능   
			
		});
		
	</script>

	<script type="text/javascript">
	// 방법2 ) jquery 이용해서 테이블 형태 출력. 참고로 forEach 안에는 자바스크립트 못씀 
	
		/*let empList = [];
		let emp = {};
		<c:forEach items="${empInfoList}" var="empInfo">
			emp = {
					employeeId : '${empInfo.employeeId}',
					firstName : '${empInfo.firstName}',
					lastName : '${empInfo.lastName}',
					departmentId : '${empInfo.departmentId}',
					jobId : '${empInfo.jobId}',
					salary : '${empInfo.salary}'
				}			
			empList.push(emp);			
		</c:forEach>
		
		$('tbody').empty();
		
		$(empList).foreach(function(idx, obj){
			let tr = $('<tr/>');
			$(tr).append($('<td/>').text(obj.employeeId));
			$(tr).append($('<td/>').text(obj.firstName));
			$(tr).append($('<td/>').text(obj.lastName));
			$(tr).append($('<td/>').text(obj.jobId));
			$(tr).append($('<td/>').text(obj.salary));
			$(tr).append($('<td/>').text(obj.departmentId));
			$('#dataList tbody').append(tr);
			
		});*/
		

	

		
	</script>

</body>
</html>