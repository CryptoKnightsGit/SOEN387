<%@ page import="java.util.List" %>
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

out.print("<p>Hey!</p>");    
out.print("<p>How are you?</p>");

%>

      <section class="shop-section">
        <div class="shop-images">
          <div class="shop-link">
            <h3>Laptop</h3>
            <img src="shop1.png" alt="card">
            <a href="Product.jsp">Shop now</a>
          </div>
          <div class="shop-link">
            <h3>Smartwatch</h3>
            <img src="shop2.png" alt="card">
            <a href="Product.jsp">Shop now</a>
          </div>
          <div class="shop-link">
            <h3>PC</h3>
            <img src="shop3.png" alt="card">
            <a href="Product.jsp">Shop now</a>
          </div>
          <div class="shop-link">
            <h3>headphones</h3>
            <img src="shop4.png" alt="card">
            <a href="Product.jsp">Shop now</a>
          </div>
          <div class="shop-link">
            <h3>Laptop</h3>
            <img src="shop1.png" alt="card">
            <a href="Product.jsp">Shop now</a>
          </div>
          <div class="shop-link">
            <h3>Smartwatch2.0</h3>
            <img src="shop2.png" alt="card">
            <a href="Product.jsp">Shop now</a>
          </div>
          <div class="shop-link">
            <h3>PC</h3>
            <img src="shop3.png" alt="card">
            <a href="Product.jsp">Shop now</a>
          </div>
          <div class="shop-link">
            <h3>headphones</h3>
            <img src="shop4.png" alt="card">
            <a href="Product.jsp">Shop now</a>
          </div>
        </div>
      </section>




<footer>   
      <div class="footer">
        <p>Footer</p>
      </div>
</footer>   

</body>
</html>
  