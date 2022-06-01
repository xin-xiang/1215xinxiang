package com.xinxiang.week2.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //when client request method is Get-here-inside doGet()
        //we want to send Hello to client
        //we need to write Hello in response
        //get writer-java.io
        PrintWriter writer = response.getWriter();
        writer.println("Name:Zhu Peng");
        writer.println("ID:2020211001001217");
        writer.println("Date and Time:Tuesday,March 8,2022 Beijing time 16:39");//that all
        //next we need to tell about this servlet to tomcat-how?-web.xml

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        //when client request method is Post-here-inside doPost()

    }
}
