package servlets;

import java.io.IOException;
import business.User;
import business.Product;
import jakarta.servlet.ServletException;

import java.util.ArrayList;
import java.util.List;

@jakarta.servlet.annotation.WebServlet("/products")
public class productsServlet extends jakarta.servlet.http.HttpServlet {

  protected void doGet(jakarta.servlet.http.HttpServletRequest request,
      jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException {
    User user = new User();
    List<Product> allProducts = new ArrayList<>();
    // allProducts = user.getAllProducts();
    Product myProduct = new Product(111, "mySku", "myName", "desc", "vend", 11.99);
    Product myProduct2 = new Product(222, "mySku2", "myName2", "desc2", "vend2", 12.99);
    Product myProduct3 = new Product(333, "mySku3", "myName3", "desc3", "vend3", 122.99);
    Product myProduct4 = new Product(444, "mySku4", "myName4", "desc4", "vend4", 123.99);
    Product myProduct5 = new Product(555, "mySku5", "myName5", "desc5", "vend5", 124.99);
    Product myProduct6 = new Product(747, "mySku6", "myName6", "desc6", "vend6", 125.99);
    Product myProduct7 = new Product(888, "mySku7", "myName7", "desc7", "vend7", 126.99);
    Product myProduct8 = new Product(787, "mySku8", "myName8", "desc8", "vend8", 127.99);
    allProducts.add(0, myProduct);
    allProducts.add(1, myProduct2);
    allProducts.add(2, myProduct3);
    allProducts.add(3, myProduct4);
    allProducts.add(4, myProduct5);
    allProducts.add(5, myProduct6);
    allProducts.add(6, myProduct7);
    allProducts.add(7, myProduct8);
    System.out.println("allProducts: " + allProducts);

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