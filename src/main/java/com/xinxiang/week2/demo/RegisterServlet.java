package com.xinxiang.week2.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(urlPatterns = {"/register"},loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        super.init();
/*        ServletContext context=getServletContext();
        String driver= context.getInitParameter("driver");
        String url= context.getInitParameter("url");
        String username= context.getInitParameter("username");
        String password= context.getInitParameter("password");
        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection in RegisterServlet-->"+con);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }*/
        con= (Connection) getServletContext().getAttribute("con");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/register.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthDate = request.getParameter("birthDate");

/*        PrintWriter writer = response.getWriter();
        writer.println("<br>id :"+id);
        writer.println("<br>username :" + username);
        writer.println("<br>password :" + password);
        writer.println("<br>email :" + email);
        writer.println("<br>gender :" + gender);
        writer.println("<br>birthDate :" + birthDate);
        writer.close();*/
        String sql = "insert into usertable values(?,?,?,?,?,?)";
        PreparedStatement r = null;
        try {
            r = con.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            r.setString(1, id);
            r.setString(2, username);
            r.setString(3, password);
            r.setString(4, email);
            r.setString(5, gender);
            r.setString(6, birthDate);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            r.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //String sql2 = "select * from usertable";
        //PreparedStatement r2 = null;
/*        try {
            r2 = con.prepareStatement(sql2);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
/*        try {
            r2.setString(1,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        //ResultSet rs = null;
/*        try {
            rs = r2.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        //PrintWriter writer=response.getWriter();
        //here is html code--move these html code in a jsp page-userlist.jsp
        //start--
/*        writer.println("<html><head><title></title></head><body><table border=1><tr>");
        writer.println("<td>id</td><td>username</td><td>password</td><td>email</td><td>gender</td><td>birthday</td></tr>");
        while (true) {
            try {
                if (!rs.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            writer.println("<tr>");
            try {
                writer.println("<td>"+rs.getString("id")+"</td>");
                writer.println("<td>"+rs.getString("username")+"</td>");
                writer.println("<td>"+rs.getString("password")+"</td>");
                writer.println("<td>"+rs.getString("email")+"</td>");
                writer.println("<td>"+rs.getString("gender")+"</td>");
                writer.println("<td>"+rs.getString("birthday")+"</td>");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            writer.println("</tr>");

        }
        writer.println("</table></body></html>");*/
        //--end
        //request.setAttribute("rsname",rs);
        //request.getRequestDispatcher("userList.jsp").forward(request,response);
        response.sendRedirect("login");
/*        while (true) {
            try {
                if (!rs.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String id1 = null;
            String username1 = null;
            String password1 = null;
            String email1 = null;
            String gender1 = null;
            String birthDate1 = null;
            try {
                id1 = rs.getString("id");
                username1 = rs.getString("username");
                password1 = rs.getString("password");
                email1 = rs.getString("email");
                gender1 = rs.getString("gender");
                birthDate1 = rs.getString("birthday");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            PrintWriter writer = response.getWriter();
            writer.println(id1 +" "+ username1 +" "+ password1 +" " + email1 +" "+ gender1 +" "+ birthDate1);


        }*/

    }
}
