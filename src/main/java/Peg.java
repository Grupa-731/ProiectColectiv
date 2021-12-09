import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Peg extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String loggedUser = new Login().email;
        log("Welcome user"+loggedUser);
        

    }
}
