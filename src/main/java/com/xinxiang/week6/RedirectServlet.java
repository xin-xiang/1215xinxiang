package com.xinxiang.week6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RedirectServlet", value = "/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //redirect - same server - Relative URL
        //1.start without /
        System.out.println("before redirect");
        //response.sendRedirect("index.jsp");
        //http://localhost:8080/2020211001001217ZhuPeng_war/redirect
        //http://localhost:8080/2020211001001217ZhuPeng_war/index.jsp
        System.out.println("after redirect");

        //2.start with /
        //response.sendRedirect("/2020211001001217ZhuPeng_war/index.jsp");
        //http://localhost:8080/2020211001001217ZhuPeng_war/redirect
        //http://localhost:8080/index.jsp
        //add /2020211001001217ZhuPeng_war/

        //redirect - another server - Absolute URl
        response.sendRedirect("https://www.baidu.com/");
        //https://www.baidu.com/

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }
}
