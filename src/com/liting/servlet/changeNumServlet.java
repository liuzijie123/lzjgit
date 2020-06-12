package com.liting.servlet;

import com.liting.domain.Products;
import com.liting.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//数据库修改操作
@WebServlet(name = "changeNumServlet")
public class changeNumServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        int num = Integer.parseInt(request.getParameter("num"));
        int totalNum = Integer.parseInt(request.getParameter("totalNum"));
        ProductService ps = new ProductService();
        Products p = (Products) request.getSession().getAttribute("p");
        Map<Products, String> map = (Map<Products, String>) session.getAttribute("byProduct");
        if (num == 0) {
            map.remove(p);
        }
        //判断key值是否包含对象
        if (map.containsKey(p)) {

            map.put(p, num + "");
        }
        //修改数据库的库存
        ps.updatepnum(id, num, totalNum);

        request.getRequestDispatcher("cart.jsp").forward(request, response);

    }
}
