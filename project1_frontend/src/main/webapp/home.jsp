<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <%@include file="header.jsp" %> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.img_carousel{
height: 80% !important;
width: 100%;
}
.body{
height: 85% !important;

 
}
.header{
height:10%; 
}
.footer{
position:fixed;
bottom: 0;
width: 100%;
align-content: center;
height: 5%;
}
.div-carousel-inner{
height: 124%;
}
.div-container-fluid{
height: 80%;
}
</style>
</head>
<body>
<div class="header">
	<jsp:include page="header.jsp"/>
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
        <img src="resources/images/fm.jpg" class="img_carousel" alt="Flying Machine">
	<h1><center>The New Cool</center></h1>
	</div>

      <div class="item">
        <img src="resources/images/wrogn.jpg" class="img_carousel" alt="Wrogn" >
	<h1><center>Breakaway Youth Fashion</center></h1>
	</div>
    
      <div class="item">
        <img src="resources/images/lawman.jpg" class="img_carousel" alt="Lawman" >
	<h1><center>Be The Star</center></h1>
	</div>
	
	  <div class="item">
        <img src="resources/images/bh.jpg" class="img_carousel" alt="Being Human">
	<h1><center>Being Human</center></h1>
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
<div class="footer">
	<jsp:include page="footer.jsp"/>
</div>


</body>
<%-- <%@include file="footer.jsp" %> --%>
</html>