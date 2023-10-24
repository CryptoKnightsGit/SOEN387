package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;



@jakarta.servlet.annotation.WebServlet("/login")
public class loginServlet extends jakarta.servlet.http.HttpServlet {


     protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException
    {
        String u = request.getParameter("username");
		String p = request.getParameter("password");

        

        // Ill have to change  the if statements to match the the actual stored username we will use for staffs and passwords as well
        //default for now.
        if(u.equalsIgnoreCase("staff") && p.equalsIgnoreCase("secret"))
		{

            RequestDispatcher req = request.getRequestDispatcher("/HomeStaff.jsp");
			req.forward(request, response);
		}
		else{
           	RequestDispatcher req = request.getRequestDispatcher("/index.jsp");
			req.include(request, response);
        }       
    }



}
