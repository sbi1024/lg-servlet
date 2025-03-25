package demo.apache;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "paramServlet", value = "/param")
public class ParamServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Get Request");
        response.getWriter().append("<html><body><h1>Get Request</h1></body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Post Request");
        request.getParameter("username");
        response.getWriter().append("<html><body><h1>Post Request</h1></body></html>");
    }

}