package com.infy.apache;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class HelloServlet extends HttpServlet {

    public final String SOME_STRING_CONSTANT = "LA-LA-LA!";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello Servlet!");
        resp.getWriter().println("<html><h1>" + LocalDateTime.now() + "</h1></html>");
        //super.doGet(req, resp);
    }
}
