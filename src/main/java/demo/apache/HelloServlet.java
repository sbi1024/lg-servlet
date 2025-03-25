package demo.apache;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Get Request");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Post Request");
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Put Request");
    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Delete Request");
    }

}