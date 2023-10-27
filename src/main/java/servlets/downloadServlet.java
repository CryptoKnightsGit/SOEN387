package servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import business.Staff;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

@jakarta.servlet.annotation.WebServlet("/download")
public class downloadServlet extends jakarta.servlet.http.HttpServlet {

    protected void doGet(jakarta.servlet.http.HttpServletRequest request,
            jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException {

        // Define the path to your "products.json" file
        String filePath = "/products.json";

        // Set the response headers
        response.setContentType("application/json");
        response.setHeader("Content-Disposition", "attachment; filename=products.json");

        try (InputStream inputStream = getServletContext().getResourceAsStream(filePath);
                OutputStream outputStream = response.getOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            // Handle any exceptions here
            e.printStackTrace();
        }
    }
}
