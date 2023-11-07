<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
      <a class="navbar-brand" href="index.jsp">Epay</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="cart.jsp">Cart</a>
          </li>
         
          <%if(authorizedCustomer != null){ %>
            <li class="nav-item">
              <a class="nav-link" href="orders.jsp">Orders</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="customer-logout">Logout</a>
            </li>
          <%}else{ %>
            <li class="nav-item">
              <a class="nav-link" href="customerLogin.jsp">Login</a>
            </li>
          <% } %>
        </ul>
      </div>
    </div>
  </nav>