<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <!DOCTYPE html>
<html lang="en">
<head>
<title>CSS Template</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #666;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
  float: left;
  width: 30%;
  height: 300px; /* only for demonstration, should be removed */
  background: #ccc;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section::after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
footer {
  background-color: #777;
  padding: 10px;
  text-align: center;
  color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
</style>
</head>
<body>



<%@include file="/WEB-INF/views/layouts/user/header.jsp" %>

<decorator:body/>

<%@include file="/WEB-INF/views/layouts/user/footer.jsp" %>

</body>
</html>
 --%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title><decorator:title default="Layout Master"></decorator:title></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap styles -->
<link href='<c:url value="/assets/user/css/bootstrap.css"/>'
	rel="stylesheet" />
<!-- Customize styles -->
<link href="<c:url value="/assets/user/style.css"/>" rel="stylesheet" />
<!-- font awesome styles -->
<link
	href="<c:url value="/assets/user/font-awesome/css/font-awesome.css"/>"
	rel="stylesheet">


<!-- Favicons -->
<link rel="shortcut icon"
	href="<c:url value="/assets/user/ico/favicon.ico"/>">
</head>
<body>
	<!-- 
	Upper Header Section 
-->
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="topNav">
			<div class="container">
				<div class="alignR">
					<div class="pull-left socialNw">
						<a href="#"><span class="icon-twitter"></span></a> <a href="#"><span
							class="icon-facebook"></span></a> <a href="#"><span
							class="icon-youtube"></span></a> <a href="#"><span
							class="icon-tumblr"></span></a>
					</div>
					<a class="active" href="index.html"> <span class="icon-home"></span>
						Home
					</a> <a href="#"><span class="icon-user"></span> My Account</a> <a
						href="register.html"><span class="icon-edit"></span> Free
						Register </a> <a href="contact.html"><span class="icon-envelope"></span>
						Contact us</a> <a href="cart.html"><span
						class="icon-shopping-cart"></span> 2 Item(s) - <span
						class="badge badge-warning"> $448.42</span></a>
				</div>
			</div>
		</div>
	</div>

	<!--
Lower Header Section 
-->
	<div class="container">
		<div id="gototop"></div>

		<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>

		<!-- ///////////////////////////////////////////////////////////////////// -->
		<decorator:body />

		<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>
		<!-- /container -->

		<div class="copyright">
			<div class="container">
				<p class="pull-right">
					<a href="#"><img src="assets/img/maestro.png" alt="payment"></a>
					<a href="#"><img src="assets/img/mc.png" alt="payment"></a> <a
						href="#"><img src="assets/img/pp.png" alt="payment"></a> <a
						href="#"><img src="assets/img/visa.png" alt="payment"></a> <a
						href="#"><img src="assets/img/disc.png" alt="payment"></a>
				</p>
				<span>Copyright &copy; 2013<br> bootstrap ecommerce
					shopping template
				</span>
			</div>
		</div>
		<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="<c:url value="/assets/user/js/jquery.js"/>"></script>
		<script src="<c:url value="/assets/user/js/bootstrap.min.js"/>"></script>
		<script
			src="<c:url value="/assets/user/js/jquery.easing-1.3.min.js"/>"></script>
		<script
			src="<c:url value="/assets/user/js/jquery.scrollTo-1.4.3.1-min.js"/>"></script>
		<script src="<c:url value="/assets/user/js/shop.js"/>assets/"></script>
</body>
</html>
