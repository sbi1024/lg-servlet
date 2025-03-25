package demo.apache;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "paramServlet", value = "/param")
public class ParamServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;

    // 검색어
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Get Request");

        String searchWord = request.getParameter("searchWord");
        response.getWriter().append("<html><body><h1>" + "searchWord : " +searchWord+"</h1></body></html>");
    }

    // 로그인
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        response.getWriter().append("<html><body><h1>Your username : " + username + "</h1></body></html>");

        String password = request.getParameter("password");
        System.out.println("Password : " + password);
    }

}