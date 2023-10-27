package servlets;

import java.io.IOException;
import java.util.List;

import business.Customer;
import business.Product;
import business.ShoppingCart;
import jakarta.servlet.ServletException;

public class cartServlet extends jakarta.servlet.http.HttpServlet {

     protected void doPost(jakarta.servlet.http.HttpServletRequest request,
               jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException {
          String pathInfo = request.getPathInfo();
          if (pathInfo == null) {
               request.getRequestDispatcher("/CustomerCart.jsp").forward(request, response);

          } else {
               request.getRequestDispatcher("/CustomerCart.jsp").forward(request, response);

          }

          String slug = slugFromInfo(pathInfo);
          // using defaulted methods here might have to change this later?
          Product p = new Product(123, "Product 1", "Description for Product 1", "Concordia", slug, 29.99);

     }

     protected void doDelete(jakarta.servlet.http.HttpServletRequest request,
               jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException {

          Product p = new Product(123, "Product 1", "Description for Product 1", "Concordia", "test", 29.99);
          Customer customer = new Customer();

          if (p != null) {

               ShoppingCart cart = customer.removeFromCart(p);
               request.setAttribute("cart", cart);
               request.getRequestDispatcher("/CustomerCart.jsp").forward(request, response);
          }

     }

     private String slugFromInfo(String pathInfo) {
          Product p = new Product(123, "Product 1", "Description for Product 1", "Concordia", "Product-123", 29.99);

          return p.getSlug();
     }

}
