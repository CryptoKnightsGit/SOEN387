package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;



@jakarta.servlet.annotation.WebServlet("/customerlogin")
public class customerLoginServlet extends jakarta.servlet.http.HttpServlet{
    



    protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException
    {
        String u = request.getParameter("username");
		String p = request.getParameter("password");



        //hardcoded for customer only.
        //need to add handling at a later time....
        if(u.equalsIgnoreCase("  ") && p.equalsIgnoreCase("  "))
		{

           

            	RequestDispatcher req = request.getRequestDispatcher("/index.jsp");
			req.include(request, response);
		}
		else{
           	 RequestDispatcher req = request.getRequestDispatcher("/CustomerHome.jsp");
			req.forward(request, response);
        }       
    }
}
