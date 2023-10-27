<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="java.util.List" %>
<%@ page import="business.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>prdpage</title>
<link href="Products.css" rel="stylesheet" type="text/css"/>
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
          <a href="CustomerLogin.jsp">Customer Login</a>
        </li>
      </ul>
    </nav>
  </div>
  <div>

    <form action = "products" method="get">
  <% List<Product> allProducts = (List<Product>) request.getAttribute("allProducts"); %>
    <% if (allProducts != null) { %>
        <ul>
            <% for (int i = 0; i < allProducts.size(); i++) { %>
                <li>
                    <h4><%= allProducts.get(i).getName() %></h4>
                    <p><%= allProducts.get(i).getDescription() %></p>
                    <p><%= allProducts.get(i).getPrice() %></p>
                    <button type="submit" class="button-remove">Add to cart</button>
                </li>
            <% } %>
        </ul>
    <% } else { %>
        <p>No products available.</p>
    <% } %>


    <button class = "button">Click here for the list of products</button>
  </form>
  </div>

<footer>   
      <div class="footer">
        <p>epay</p>
      </div>
</footer>   

</body>
</html>
  