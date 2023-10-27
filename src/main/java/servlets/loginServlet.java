package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

@jakarta.servlet.annotation.WebServlet("/loginstaff")
public class loginServlet extends jakarta.servlet.http.HttpServlet {

    protected void doPost(jakarta.servlet.http.HttpServletRequest request,
            jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException {
        String u = request.getParameter("username");
        String p = request.getParameter("password");

        // hardcoded for staff only.
        if (u.equalsIgnoreCase("staff") && p.equalsIgnoreCase("secret")) {

            RequestDispatcher req = request.getRequestDispatcher("/HomeStaff.jsp");
            req.forward(request, response);
        } else {
            // Invalid username/password, display a pop-up
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<script type='text/javascript'>");
            out.println(
                    "alert('Invalid username/password!\\nThe username is \\'staff\\'\\nThe password is \\'secret\\'');");
            out.println("window.location.href = '/theprj/Stafflogin.jsp';");
            out.println("</script>");
        }
    }

}
