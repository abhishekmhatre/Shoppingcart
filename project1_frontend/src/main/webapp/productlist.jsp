<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">
	<jsp:include page="header.jsp"/>
</div>

<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ProductName</th>
				<th>Price</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${productsAttr}" var="p">
				<tr>
					<td>${p.productname}</td>
					<td>${p.price}</td>
					<td><a href="/all/viewproduct/${p.id}"><span class="glyphicon glyphicon-ingo-sign"></span></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>		
</div>
</body>
</html>