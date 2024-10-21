package works.buddy.samples;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WorksWithHerokuServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setStatus(404);
        try (PrintWriter writer = response.getWriter()) {
            writer.print("Buddy Works with Heroku");
        } catch (IOException e) {
            throw new ServletException("Error while getting the writer", e);
        }
    }
}