package servlets;

import java.io.IOException;
import business.User;
import business.Product;
import jakarta.servlet.ServletException;
import java.util.List;

@jakarta.servlet.annotation.WebServlet("/products")
public class productsServlet extends jakarta.servlet.http.HttpServlet {

  protected void doGet(jakarta.servlet.http.HttpServletRequest request,
      jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException {
    User user = new User();
    List<Product> allProducts = user.getAllProducts();

    // Set the allProducts list as an attribute in the request object
    request.setAttribute("allProducts", allProducts);

    // Forward the request to the JSP
    request.getRequestDispatcher("/Products.jsp").forward(request, response);

    String pathInfo = request.getPathInfo();
    if (pathInfo == null) {
      request.getRequestDispatcher("/Products.jsp").forward(request, response);

    }
    // add custom error handling maybe as well here...

    String slug = slugFromInfo(pathInfo);
    // using defaulted methods here might have to change this later?
    Product p = new Product(123, "Product 1", "Description for Product 1", "Concordia", slug, 29.99);
    if (p != null) {

      p.getSlug();
      request.getRequestDispatcher("/Product.jsp").forward(request, response);

    }

    // add custom error handliing later. will look it up

  }

  // may have to edit this.
  private String slugFromInfo(String pathInfo) {
    Product p = new Product(123, "Product 1", "Description for Product 1", "Concordia", "Product-123", 29.99);

    return p.getSlug();
  }

}