package com.liting.servlet;

import com.liting.domain.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "AddCartServlet")
public class AddCartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        HttpSession session = request.getSession();
        //通过session拿到对象的商品
        Products p = (Products) session.getAttribute("p");
        //创建map集合，页面上的数量和商品相对应
        Map<Products, String> map = (Map<Products, String>) session.getAttribute("byProduct");
        int num = 1;
        //判断map集合是否为空，是空的证明是第一次加入购物车
        if (map == null) {
            map = new HashMap<Products, String>();
        }
        //判断map对象是否包含商品，containsKey包含了证明不是第一次加入购物车，get到对象进行操作
        if (map.containsKey(p)) {
            //通过键找值遍历
            num = Integer.parseInt(map.get(p)) + 1;
        }
        map.put(p, num + "");

        session.setAttribute("byProduct", map);

        request.getRequestDispatcher("cart.jsp").forward(request, response);


    }
}
