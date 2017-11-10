<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- For accessing all jstl tags -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page isELIgnored="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
  
	<li class="active"><a href="home.jsp">Home</a></li>
	<li><a href="aboutUs.jsp">AboutUs</a></li>
	
	
	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">More<span class="caret"></span></a>
	<ul class="dropdown-menu">
	<li><a href="#">Delivery</a></li>
	<li><a href="#">Contact us</a></li>
	
	</li>
	</ul>
    </ul>
  </div>
</nav>

</body>
</html>