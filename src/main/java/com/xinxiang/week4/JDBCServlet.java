package com.xinxiang.week4;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
//more easy another way
@WebServlet(name = "JDBCServlet",urlPatterns = {"/jdbc"},
        initParams = {
        @WebInitParam(name = "driver",value = "com.microsoft.sqlserver.jdbc.SQLServerDriver"),
                @WebInitParam(name = "url",value = "jdbc:sqlserver://localhost:1433;database=userdb;encrypt=false"),
                @WebInitParam(name = "username",value = "sa"),
                @WebInitParam(name = "password",value = "666666")
        },
        loadOnStartup = 1

)//use @WebServlet no web.xml code
*/
@WebServlet(urlPatterns = {"/jdbc"},loadOnStartup = 1)
public class JDBCServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        super.init();
        //way 2 create connection with init()
        //String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //String url="jdbc:sqlserver://localhost:1433;database=userdb;encrypt=false";
        //String username="sa";
        //String password="666666";
//        ServletConfig config=getServletConfig();
//        String driver= config.getInitParameter("driver");
//        String url= config.getInitParameter("url");
//        String username= config.getInitParameter("username");
//        String password= config.getInitParameter("password");
        ServletContext context=getServletContext();
        String driver= context.getInitParameter("driver");
        String url= context.getInitParameter("url");
        String username= context.getInitParameter("username");
        String password= context.getInitParameter("password");


        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection in JDBCServlet-->"+con);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //way 1 create connection within doget
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
