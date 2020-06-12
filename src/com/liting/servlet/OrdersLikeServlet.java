package com.liting.servlet;

import com.liting.domain.Orders;
import com.liting.service.OrdersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "OrdersLikeServlet")
public class OrdersLikeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        OrdersService ordersService=new OrdersService();
        String id = request.getParameter("id");

        String receiverName = request.getParameter("receiverName");

        List<Orders> orders = ordersService.OrdersLike(id, receiverName);
        HttpSession session=request.getSession();
        session.setAttribute("op",orders);

        session.setAttribute("ids",id);

        request.getRequestDispatcher("admin/orders/list.jsp").forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
