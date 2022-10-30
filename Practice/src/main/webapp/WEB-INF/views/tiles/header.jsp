  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
  <!-- Bootstrap core CSS -->
<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath }"/resources/css/headers.css" rel="stylesheet">
  </head>
  <body>
    
 
 <header>
    <div class="px-3 py-2 bg-dark text-white">
      <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
          <a href="/" class="d-flex align-items-center my-2 my-lg-0 me-lg-auto text-white text-decoration-none">
            <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"/></svg>
          </a>

          <ul class="nav col-12 col-lg-auto my-2 justify-content-center my-md-0 text-small">
            <li>
               <!--  절대 경로로 설정해줘야함 -->
              <a href="${pageContext.request.contextPath }" class="nav-link text-secondary">
                <svg class="bi d-block mx-auto mb-1" width="24" height="24"><use xlink:href="#home"/></svg>
                Home
              </a>
            </li>
            <li>
            <!--  절대 경로로 설정해줘야함 -->
              <a href="${pageContext.request.contextPath }/userslist" class="nav-link text-white">
                <svg class="bi d-block mx-auto mb-1" width="24" height="24">
                <use xlink:href="#speedometer2"/></svg>
                List
              </a>
            </li>
            <li>
              <a href="#" class="nav-link text-white">
                <svg class="bi d-block mx-auto mb-1" width="24" height="24"><use xlink:href="#table"/></svg>
                Orders
              </a>
            </li>     
          </ul>
        </div>
      </div>
    </div>    
  </header>
