<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Customer log</title>
<link href="Footer.css" rel="stylesheet" type="text/css"/>
<link href="Navbar.css" rel="stylesheet" type="text/css"/>
<link href="CustomerLogin.css" rel="stylesheet" type="text/css"/>

<script type = "text/javascript">  
    function pop() {  
       alert ("Press ok confirm to login.");  
    }  
</script>       
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
            <a href="index.jsp">Return to main login</a>
        </li>
      </ul>
    </nav>
  </div>

      <div class="container">
        <div class="screen">
            <div class="screen__content">
                <form class="login"  action = "customerlogin" method = post>
                    <div class="login__field">
                        <i class="login__icon fas fa-user"></i>
                        <input type="text" class="login__input" name = "username" >
                    </div>
                    <div class="login__field">
                        <i class="login__icon fas fa-lock"></i>
                        <input type="password" class="login__input" name = "password" >
                    </div>
                    <button class="button login__submit">
                        <span class="button__text">Log In Here</span>
                        <i class="button__icon fas fa-chevron-right"></i>
                    </button>				
                </form>
            </div>
            <div class="screen__background">
                <span class="screen__background__shape screen__background__shape4"></span>
                <span class="screen__background__shape screen__background__shape3"></span>		
                <span class="screen__background__shape screen__background__shape2"></span>
                <span class="screen__background__shape screen__background__shape1"></span>
            </div>		
        </div>
    </div>



<footer>   
      <div class="footer">
        <p>epay</p>
      </div>
</footer>   

</body>
</html>
  