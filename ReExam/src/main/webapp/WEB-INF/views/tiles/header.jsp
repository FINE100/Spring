<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="sb-sidenav accordion sb-sidenav-light" id="sidenavAccordion">
	<div class="sb-sidenav-menu">
		<div class="nav">
			<div class="sb-sidenav-menu-heading">쇼핑몰관리</div>
			<a class="nav-link" href="${pageContext.request.contextPath}/insert">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 상품등록
			</a> <a class="nav-link"
				href="${pageContext.request.contextPath}/list">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 상품목록조회/수정
			</a> <a class="nav-link"
				href="${pageContext.request.contextPath}">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 매출현황조회
			</a> <a class="nav-link"
				href="${pageContext.request.contextPath}">
				<div class="sb-nav-link-icon">
					<i class="fas fa-tachometer-alt"></i>
				</div> 홈으로
			</a>
		</div>
	</div>
</nav>