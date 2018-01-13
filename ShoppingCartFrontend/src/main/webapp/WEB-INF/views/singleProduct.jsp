<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">

<!-- Breadcrumb -->

   <div class="row">
   
     <div class="col-md-12">
       
       <ol class="breadcrumb">
          <li><a href="${contextRoot}/home">Home</a></li>
           <li><a href="${contextRoot}/show/all/products">Products</a></li>
           <li class="active">${product.prodname}</li>
       
       </ol>
     
     </div>
   
   
   </div>

        <!-- Display Product -->

   <div class="row">
       
       <!-- Display the Product Image -->
       <div class="col-xs-12 col-md-4">
          <div class="thumbnail">
              <img src="${images}/${product.code}.jpg" class="img-responsive border"/>
          
          </div>
          
       
       </div>
       
       <!-- Product Description -->
       
       <div class="col-md-6">
          
          <h2 style="font-size:20px;">${product.prodname}</h2>
          <hr/>
          <p>${product.proddesc}</p>
          <hr/>
          
          <h6 style="font-size:20px;">Price: <strong> &#8377; ${product.price} /-</strong></h6>
          <hr/>
           
          
           <c:choose>
                   <c:when test="${product.quantity <1}">
                 <h6 style="font-size:20px;">Quantity Available: <span style="color:red">Out Of Stock!</span></h6>
                        
                   </c:when>
                   <c:otherwise>
                          <h6 style="font-size:20px;">Quantity Available: ${product.quantity}</h6>
                   </c:otherwise>
           </c:choose>
            
            
            <security:authorize access="hasAuthority('USER')">
            <c:choose>
                   <c:when test="${product.quantity <1}">
                 
                           <a class="btn btn-success disabled" href="javascript:void(0)"><strike>
            				<i class="material-icons">add_shopping_cart</i>Add To Cart</strike></a>
                           
                   </c:when>
                   <c:otherwise>
                         
                        <form action="${contextRoot}/cart/add/${product.prodid}/product">
                        <h6 style="font-size:20px;">Enter Units:<input type="text" name="units"></h6><br>
                        <button type="submit" class="btn btn-success">
                        <i class="material-icons">add_shopping_cart</i></button>
                         </form>
                         
                   </c:otherwise>
           </c:choose>
         </security:authorize>
            
             <security:authorize access="hasAuthority('ADMIN')">
            
                         <a class="btn btn-warning" href="${contextRoot}/manage/${product.prodid}/product">
                       <i class="material-icons">mode_edit</i>Edit</a>               
         </security:authorize>
          
                      
           
           <a class="btn btn-primary" href="${contextRoot}/show/all/products">
           Back</a>
 
       </div>
  
   </div>

</div>