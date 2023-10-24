package servlets;

import java.io.IOException;

import business.Product;
import jakarta.servlet.ServletException;

public class changePrdServlet  extends jakarta.servlet.http.HttpServlet {
        // not sure if ishould createa a new file for this doPost
         protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException
    {
        String pathInfo = request.getPathInfo();
        if (pathInfo == null){
             request.getRequestDispatcher("/Products.jsp").forward(request, response);

        }
        //add custom error handling maybe as well here...

        String slug = slugFromInfo(pathInfo); 
        // using defaulted methods here might have to change this later?
        Product p= new Product(123,"Product 1","Description for Product 1","Concordia",slug,29.99);
        if(p != null){

            //not sure if this the proper way. might be a better one? might have to use request ?
            p.setPrice(1000.11);
            p.setDescription("weeeeee");
            p.setName("laptopxx");
            
            request.getRequestDispatcher("/Product.jsp").forward(request, response);

        }

        // add custom error handliing later. will look it up   

      }
            //may have to edit this.
            private String slugFromInfo(String pathInfo) {
                Product p= new Product(123,"Product 1","Description for Product 1","Concordia","Product-123",29.99);
                return  p.getSlug();
           }
      
}
