package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sijieliu on 9/14/18.
 */
public class HelloWorld extends HttpServlet {

    public HelloWorld() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Hello World.</title>");
        writer.println("</head>");
        writer.println("<body bgcolor=white>");
        writer.println("Hey if this page shows up it means the servlet HelloWorld is called");
        writer.println("</body>");
        writer.println("</html>");
    }
}
