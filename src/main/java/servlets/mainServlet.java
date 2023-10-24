package servlets;


import java.io.IOException;

import business.Product;

import jakarta.servlet.ServletException;

@jakarta.servlet.annotation.WebServlet("/prd")
public class mainServlet {

  //will continue later
      protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException
      {
        String pathInfo = request.getPathInfo();
        String slug = slugFromInfo(pathInfo);

      }

    private String slugFromInfo(String pathInfo) {
         Product p= new Product(0, pathInfo, pathInfo, pathInfo, pathInfo, 0);
         return  p.getSlug();
    }
}
