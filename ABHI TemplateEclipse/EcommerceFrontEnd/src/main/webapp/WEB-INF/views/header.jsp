<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ page isELIgnored="false" %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="<c:url value='/resources/css/login.css'></c:url>">
  
  	<!-- Angular Js -->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
      
    <!-- JQuery -->
    <script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>

    <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">
  
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
  <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mycollapse" aria-expanded="false">
  <span class="sr-only">Toggle</span>
  <span class="icon-bar"></span>
  <span class="icon-bar"></span>
  <span class="icon-bar"></span>
  </button>
    <div class="navbar-header">
      <a class="navbar-brand" href="#">hyper-Jeans</a>
    </div>
    <div class="collapse navbar-collapse" id="#mycollapse">
    <ul class="nav navbar-nav">
  	
  	 <c:url value="/home" var="homeUrl"/> 
	<li class="active"><a href="${homeUrl }">Home</a></li>
	
	 <c:url value="/aboutUs" var="aboutUsUrl"/> 
	<li><a href="${aboutUsUrl }">AboutUs</a></li>
	
	<!-- <li><a href="home">Home</a></li> -->
	<!-- <li><a href="aboutus">Aboutus</a></li> -->
	<!--  <li><a href="/admin/getproductform">Add Product</a></li> -->



 
 	<%-- <c:url value="/admin/getproductform?id=0" var="productForm"/>
	<security:authorize access="hasRole('ROLE_ADMIN')"> --%>
	
	<c:url value="getproductform?id=0" var="productForm"/>
	<li><a href="${productForm }">Add Product</a></li>
	<%-- </security:authorize> --%>
	
	
	
	
	
	<c:url value="/all/getallproducts" var="productsUrl"/>
	<li><a href="${productsUrl }">Browse all products</a></li>

	<c:if test="${pageContext.request.userPrincipal.name==null }">
	<li><a href="<c:url value='/login'></c:url>">Sign In</a></li>
	<li><a href='<c:url value='/all/registrationform'></c:url>'>Sign Up</a></li>
	</c:if>
	<%-- <li><a href='<c:url value='/all/registrationform'></c:url>'>Sign Up</a></li> --%>
	
	 <security:authorize access="hasRole('ROLE_USER')">
	 <li><a href="<c:url value='/cart/getcart'></c:url>">cart</a></li>
     </security:authorize>
	        
	<c:if test="${pageContext.request.userPrincipal.name!=null }">
	<li><a href="">Welcome ${pageContext.request.userPrincipal.name}</a></li>
	<li><a href="<c:url value='/j_spring_security_logout'></c:url>">Logout</a></li>
	</c:if>
			
	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">More<span class="caret"></span></a>
	<ul class="dropdown-menu">
	<li><a href="#">Delivery</a></li>
	<li><a href="#">Contact us</a></li>
	</ul>
	</li>
    </ul>
  </div>
  </div>
</nav>

</body>
</html>