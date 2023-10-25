package servlets;

import java.io.IOException;

import business.Staff;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

@jakarta.servlet.annotation.WebServlet("/download")
public class downloadServlet  extends jakarta.servlet.http.HttpServlet {

         protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException
    {


    //not sure i believe ill have to use response to send back info instead the below....


    Staff cata = new Staff(3, "staff", "staff@gmail.com", "password");
    cata.createProduct(321, "staffCreatedProduct", "This was created in the testDriver.java", "amazon", "product-321", 99.56);
    cata.downloadProductCatalog();

    response.setContentType("application/pdf");
    response.setHeader(null, null);


    }    
}
