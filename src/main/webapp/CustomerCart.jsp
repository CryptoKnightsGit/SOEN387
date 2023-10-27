<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="java.util.List" %>
<%@ page import="business.Product, business.User,business.ShoppingCart,business.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>homep</title>
<link href="CustomerCart.css" rel="stylesheet" type="text/css"/>
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
          <a href="CustomerCart.jsp">Cart</a>
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
  Product tempProduct = new Product(13, "pname", "pdescription", "pvendor", "pslug", 12.9);
  c.addToCart(tempProduct); 
  ShoppingCart customerCart = c.getCart();
%>
<% if (customerCart != null) { %>
  <% List<Product> cartItems = customerCart.getItems(); %>
  <ul>
      <% for (int i = 0; i < cartItems.size(); i++) { %>
          <li>
              <h4><%= cartItems.get(i).getName() %></h4>
              <p><%= cartItems.get(i).getDescription() %></p>
              <p><%= cartItems.get(i).getPrice() %></p>
              <button type="submit">Remove from Cart</button>
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
  