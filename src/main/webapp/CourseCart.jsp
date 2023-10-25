<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="java.util.List" %>
<%@ page import="business.Product, business.User,business.ShoppingCart,business.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>homep</title>
<link href="CourseCart.css" rel="stylesheet" type="text/css"/>
<link href="Footer.css" rel="stylesheet" type="text/css"/>
<link href="Navbar.css" rel="stylesheet" type="text/css"/>
</head>




<body>

  <div class="wrapper">
    <nav>
      <a href="index.jsp" class="logo">Logo</a>
      <ul>
        <li>
          <a href="Products.jsp">ViewAllProducts</a>
        </li>
        <li>
          <a href="CourseCart.jsp">CourseCart</a>
        </li>
        <li>
          <a href="Stafflogin.jsp">StaffLog</a>
        </li>
        <li>
          <a href="CreateProduct.jsp">Createprd</a>
        </li>
      </ul>
    </nav>
  </div>

  <% 
  Customer c = new Customer(); 
  List<Product> cart = c.removeFromCart(null); 
  Product cart = new Product(13, "pname", "pdescription", "pvendor", "pslug", 12.9);
%>
<% if (cart != null) { %>
  <ul>
      <% for (int i = 0; i < cart.size(); i++) { %>
          <li>
              <p>${fn:escapeXml(cart.get(i).getName())}</p>
              <h4><%= cart.get(i).getName() %></h4>
              <p><%= cart.get(i).getDescription() %></p>
              <p><%= cart.get(i).getPrice() %></p>
          </li>
      <% } %>
  </ul>
<% } else { %>
  <p>Nothing in cart available.</p>
<% } %>




<footer>   
      <div class="footer">
        <p>Footer</p>
      </div>
</footer>   

</body>
</html>
  