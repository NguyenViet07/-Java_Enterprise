import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usename = request.getParameter("usename");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if ("admin".equals(usename)&&"admin".equals(password)){
            writer.println("<h1>welcome to summoner's rift</h1>");
        } else {writer.println("welcom to cong bronze rank");}

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
