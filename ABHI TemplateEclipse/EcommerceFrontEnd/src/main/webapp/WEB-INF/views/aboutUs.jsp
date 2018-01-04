<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- <%@include file="header.jsp"> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{ background-image: url("resources/images/bg.jpg");}
 				
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

</style>
</head>
<body>
<div class="header">
	<%-- <jsp:include page="header.jsp"/> --%>
	<%@include file="header.jsp" %>
</div>

<div class="body">



<h5 style="color:FloralbBlack;"><p>- Shopping Site for Fashion and Lifestyle.</p></h5>
<h5 style="color:FloralBlack;"><p>- It's all about the clothing i.e Jeans.We have top brands jeans collections.</p></h5>
<h5 style="color:FloralBlack;"><p>- It does have all the latest trends of top brand jeans under one roof.</p></h5>
<h5 style="color:FloralBlack;"><p><b>- Happy Shopping.</b></p></h5>


</div>
<div class="footer" align="center">
	<%-- <jsp:include page="footer.jsp"/> --%>
	<%@include file="footer.jsp" %>
</div>
</body>

<!-- <@include file="footer.jsp" %>-->
</html>