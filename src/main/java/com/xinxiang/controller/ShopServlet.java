package com.xinxiang.controller;

import com.xinxiang.dao.ProductDao;
import com.xinxiang.model.Category;
import com.xinxiang.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ShopServlet", value = "/shop")
public class ShopServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        super.init();
        con=(Connection) getServletContext().getAttribute("con");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Category category=new Category();
        List<Category> categoryList= null;
        try {
            categoryList = category.findAllCategory(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("categoryList",categoryList);
        ProductDao productDao=new ProductDao();
        List<Product> productList=null;
        if (request.getParameter("categoryId")==null){
            try {
                productList=productDao.findAll(con);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            int categoryId=Integer.parseInt(request.getParameter("categoryId"));
            try {
                productList=productDao.findByCategoryId(categoryId,con);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        request.setAttribute("productList",productList);
        String path="/WEB-INF/views/shop.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
