<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	 
<h4>Product Details</h4><br>
<form action="<c:url value='/cart/addtocart/${product.id }'></c:url>">
<img src='<c:url value='/resources/images/${product.id }.png'></c:url>' height="70" width="70" alt="Image Not Available">
	 		
<pre>
<b>Product Name:</b> ${product.productname}<br>
<b>Product Description:</b> ${product.productDescription}<br>
<b>Price:</b> ${product.price}<br>
<b>Quantity:</b> ${product.quantity}<br>
<b>Category:</b> ${product.category.categoryname}<br>

<security:authorize access="hasRole('ROLE_USER')">
<a href="<c:url value='/cart/addtocart/${product.id }'></c:url>>" class="btn btn-info btn-lg">Shopping Cart
<span class="glyphicon glyphicon-shopping-cart"></span></a>
</security:authorize>
</pre>
</form>

</body>
</html>