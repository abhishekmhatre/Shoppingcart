<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <%@include file="header.jsp" %> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">

.img_carousel{

width: 100%;
max-height:506px;
}
.body{
height: 85% !important;

 
}
.header{
height:10%; 
}
.footer{
position:fixed;
bottom: -10;
width: 100%;
align-content: center;
height: 5%;
}
.div-carousel-inner{
height: 80%;
}
.div-container-fluid{
height: 80%;
}
</style>
</head>
<body>
<div class="header">
<%-- 	<jsp:include page="header.jsp"/>
 --%>
 <%@include file="header.jsp" %>
 </div>
<div class="body">
 <div class="container-fluid div-container-fluid">
 
  <div id="newcarousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#newcarousel" data-slide-to="0" class="active"></li>
      <li data-target="#newcarousel" data-slide-to="1"></li>
      <li data-target="#newcarousel" data-slide-to="2"></li>
    </ol>
    
    
    
   <div class="carousel-inner div-carousel-inner">
      <div class="item active">
      <img src="resources/images/fm.jpg" alt="Flying Machine" class="img_carousel"/>
        <!-- <img src="/WEB-INF/resources/images/fm.jpg" width="500" height="500" class="img_carousel" alt="Flying Machine"> -->
	<center><h1>The New Cool</h1></center>
	</div>


      <div class="item">
        <img src="resources/images/wrogn.jpg" class="img_carousel" alt="Wrogn" >
	<center><h1>Breakaway Youth Fashion</h1></center>
	</div>
    
      <div class="item">
        <img src="resources/images/lawman.jpg" class="img_carousel" alt="Lawman" >
	<center><h1>Be The Star</h1></center>
	</div>
	
	  <div class="item">
        <img src="resources/images/jj.jpg" class="img_carousel" alt="Jack and Jones">
	<center><h1>Be Different</h1></center>
	</div>
	
	
    
</div>

  
    <a class="left carousel-control" href="#newcarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#newcarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div> 
  </div>
</div>

</div>
<div class="footer">
 <%@include file="footer.jsp" %>
</div>


</body>
<%-- <%@include file="footer.jsp" %> --%>
</html>