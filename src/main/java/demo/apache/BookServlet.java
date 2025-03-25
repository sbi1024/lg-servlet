package demo.apache;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bookServlet", value = "/book")
public class BookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 여러 요청을 처리
    // sub url
//  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      System.out.println(request.getRequestURI());
//      System.out.println(request.getContextPath());
//
//      String job = request.getRequestURI().substring(request.getContextPath().length());
//      switch(job) {
//          case "/book/list" : list(); break;
//          case "/book/detail" : detail(); break;
//          case "/book/insert" : insert(); break;
//      }
//
//  }
    // job parameter
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String job = request.getParameter("job"); // client 에서 무조건 job 가 전달된다.
        switch (job) {
            case "list":
                list();
                break;
            case "detail":
                detail();
                break;
            case "insert":
                insert();
                break;
        }

    }

    private void list() {
        System.out.println("list()");
    }

    private void detail() {
        System.out.println("detail()");
    }

    private void insert() {
        System.out.println("insert()");
    }
}