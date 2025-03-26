package demo.apache;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/mvc")
public class MVCServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // 검색어
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // job parameter 값 확인
        String job = request.getParameter("job");
        System.out.println("job = " + job);

        // switch
        switch (job) {
            case "list":
                List<String> strList = getList();
                request.setAttribute("strList", strList);
                request.getRequestDispatcher("/mvc.jsp").forward(request, response);
                break;
            case "info":
                response.sendRedirect("/info.html");
                break;
        }
    }

    private List<String> getList() {
        List<String> strList = List.of("java", "servlet", "jsp");
        return strList;
    }

}