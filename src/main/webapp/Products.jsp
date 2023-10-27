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
          <a href="CreateProduct.jsp">Createprd</a>
        </li>
      </ul>
    </nav>
  </div>
  <% List<Product> allProducts = (List<Product>) request.getAttribute("allProducts"); %>
    <% if (allProducts != null) { %>
        <ul>
            <% for (int i = 0; i < allProducts.size(); i++) { %>
                <li>
                    <h4><%= allProducts.get(i).getName() %></h4>
                    <p><%= allProducts.get(i).getDescription() %></p>
                    <p><%= allProducts.get(i).getPrice() %></p>
                </li>
            <% } %>
        </ul>
    <% } else { %>
        <p>No products available.</p>
    <% } %>


<footer>   
      <div class="footer">
        <p>epay</p>
      </div>
</footer>   

</body>
</html>
  