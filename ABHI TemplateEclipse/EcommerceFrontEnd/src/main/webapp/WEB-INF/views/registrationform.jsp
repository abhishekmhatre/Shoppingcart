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
	<%-- <jsp:include page="header.jsp"/> --%>
	<%@include file="header.jsp" %>
</div>
<c:url value='/all/registercustomer' var="url"></c:url>
<form:form action="${url }" modelAttribute="customer">
Enter Customer Details:

<div class="form-group">
<form:label path="firstname">Enter First Name:</form:label>
<form:input path="firstname" class="form-control" ></form:input>
<form:errors path="firstname" cssStyle="color:red"></form:errors>
</div>


<div class="form-group">
<form:label path="lastname">Enter Last Name:</form:label>
<form:input path="lastname" class="form-control" ></form:input>
<form:errors path="lastname" cssStyle="color:red"></form:errors>
</div>


<div class="form-group">
<form:label path="email">Enter Email:</form:label>
<form:input path="email" type="email" class="form-control" ></form:input>
<form:errors path="email" cssStyle="color:red"></form:errors>
<span style="color:red">${duplicateEmail }</span>
</div>


<div class="form-group">
<form:label path="phonenumber">Enter Phone number:</form:label>
<form:input path="phonenumber" class="form-control" ></form:input>
<form:errors path="phonenumber" cssStyle="color:red"></form:errors>
</div>


Enter Login Credentials:
<div class="form-group">
<form:label path="user.username">Enter Username:</form:label>
<form:input path="user.username" class="form-control" ></form:input>
<form:errors path="user.username" cssStyle="color:red"></form:errors>
<span style="color:red">${duplicateUsername }</span>
</div>

<div class="form-group">
<form:label path="user.password">Enter Password:</form:label>
<form:input path="user.password" type="password" class="form-control" ></form:input>
<form:errors path="user.password" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="billingaddress.apartmentnumber">Apartment number:</form:label>
<form:input path="billingaddress.apartmentnumber" class="form-control" ></form:input>
<form:errors path="billingaddress.apartmentnumber" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="billingaddress.streetname">Street name:</form:label>
<form:input path="billingaddress.streetname" class="form-control" ></form:input>
<form:errors path="billingaddress.streetname" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="billingaddress.city">Enter City:</form:label>
<form:input path="billingaddress.city" class="form-control" ></form:input>
<form:errors path="billingaddress.city" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="billingaddress.state">Enter State:</form:label>
<form:input path="billingaddress.state" class="form-control" ></form:input>
<form:errors path="billingaddress.state" cssStyle="color:red"></form:errors>
</div>


<div class="form-group">
<form:label path="billingaddress.zipcode">Enter zipcode:</form:label>
<form:input path="billingaddress.zipcode" class="form-control" ></form:input>
<form:errors path="billingaddress.zipcode" cssStyle="color:red"></form:errors>
</div>


Enter Shipping Address:
<div class="form-group">
<form:label path="shippingaddress.apartmentnumber">Apartment number:</form:label>
<form:input path="shippingaddress.apartmentnumber" class="form-control" ></form:input>
<form:errors path="shippingaddress.apartmentnumber" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="shippingaddress.streetname">Street name:</form:label>
<form:input path="shippingaddress.streetname" class="form-control" ></form:input>
<form:errors path="shippingaddress.streetname" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="shippingaddress.city">Enter City:</form:label>
<form:input path="shippingaddress.city" class="form-control" ></form:input>
<form:errors path="shippingaddress.city" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">
<form:label path="shippingaddress.state">Enter State:</form:label>
<form:input path="shippingaddress.state" class="form-control" ></form:input>
<form:errors path="shippingaddress.state" cssStyle="color:red"></form:errors>
</div>


<div class="form-group">
<form:label path="shippingaddress.zipcode">Enter zipcode:</form:label>
<form:input path="shippingaddress.zipcode" class="form-control" ></form:input>
<form:errors path="shippingaddress.zipcode" cssStyle="color:red"></form:errors>
</div>

<input type="submit" value="Register">
</form:form>
</body>
</html>