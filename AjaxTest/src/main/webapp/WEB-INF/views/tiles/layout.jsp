<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판</title>
<!-- boot strap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

<!-- footer -->
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/footers/">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- custom for this template -->
<link href="${pageContext.request.contextPath }/resources/css/footer">

</head>
<body>
	<header>
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</header>
	<main>
		<tiles:insertAttribute name="main"></tiles:insertAttribute>
	</main>
	

	<div class="b-example-divider"></div>


	<div class="container">
		<footer class="py-5">
			<div class="row">
				<div class="col-2">
					<h5>Section</h5>
					<ul class="nav flex-column">
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Home</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Features</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Pricing</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">FAQs</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">About</a></li>
					</ul>
				</div>

				<div class="col-2">
					<h5>Section</h5>
					<ul class="nav flex-column">
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Home</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Features</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Pricing</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">FAQs</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">About</a></li>
					</ul>
				</div>

				<div class="col-2">
					<h5>Section</h5>
					<ul class="nav flex-column">
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Home</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Features</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">Pricing</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">FAQs</a></li>
						<li class="nav-item mb-2"><a href="#"
							class="nav-link p-0 text-muted">About</a></li>
					</ul>
				</div>

				<div class="col-4 offset-1">
					<form>
						<h5>Subscribe to our newsletter</h5>
						<p>Monthly digest of whats new and exciting from us.</p>
						<div class="d-flex w-100 gap-2">
							<label for="newsletter1" class="visually-hidden">Email
								address</label> <input id="newsletter1" type="text" class="form-control"
								placeholder="Email address">
							<button class="btn btn-primary" type="button">Subscribe</button>
						</div>
					</form>
				</div>
			</div>

			<div class="d-flex justify-content-between py-4 my-4 border-top">
				<p>&copy; 2021 Company, Inc. All rights reserved.</p>
				<ul class="list-unstyled d-flex">
					<li class="ms-3"><a class="link-dark" href="#"><svg
								class="bi" width="24" height="24">
								<use xlink:href="#twitter" /></svg></a></li>
					<li class="ms-3"><a class="link-dark" href="#"><svg
								class="bi" width="24" height="24">
								<use xlink:href="#instagram" /></svg></a></li>
					<li class="ms-3"><a class="link-dark" href="#"><svg
								class="bi" width="24" height="24">
								<use xlink:href="#facebook" /></svg></a></li>
				</ul>
			</div>
		</footer>
	</div>
</html>
