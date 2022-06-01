package com.xinxiang.week6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "SearchServlet", value = "/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txt=request.getParameter("txt");
        String search=request.getParameter("search");

        if (txt ==""){
            response.sendRedirect("index.jsp");
        }

        else{
            if(Objects.equals(search, "baidu")){
                response.sendRedirect("https://www.baidu.com/s?wd="+txt);
            }
            else if (Objects.equals(search, "bing")){
                response.sendRedirect("https://cn.bing.com/search?q="+txt);
            }
            else if(Objects.equals(search, "google")){
                response.sendRedirect("https://www.google.com/search?q="+txt);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
