package servlets;

import java.io.IOException;
import java.io.PrintWriter;

@jakarta.servlet.annotation.WebServlet("/testing")
public class testServlet extends jakarta.servlet.http.HttpServlet {
    public void service(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws IOException
    {
        int i = Integer.parseInt(request.getParameter("n1"));
        int x = Integer.parseInt(request.getParameter("n2"));

        int k = i +x;

        PrintWriter out = response.getWriter();

        out.println(k);

        //works for now .

    }
}
