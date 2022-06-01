package com.xinxiang.controller;

import com.xinxiang.dao.UserDao;
import com.xinxiang.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "UpdateUserServlet", value = "/updateUser")
public class UpdateUserServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        super.init();
        con= (Connection) getServletContext().getAttribute("con");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/updateUser.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthDate = request.getParameter("birthDate");
        User user=new User();
        user.setId(Integer.parseInt(id));
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setGender(gender);
        user.setBirthday(birthDate);
        UserDao userDao=new UserDao();
        try {
            userDao.updateUser(con,user);
            userDao.findById(con, Integer.valueOf(id));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        HttpSession session=request.getSession();
        System.out.println("session id-->"+session.getId());
        session.setMaxInactiveInterval(10);
        session.setAttribute("user",user);

        //request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request,response);
        request.getRequestDispatcher("accountDetails").forward(request,response);


    }
}
