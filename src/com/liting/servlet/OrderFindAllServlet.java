package com.liting.servlet;

import com.liting.domain.Orders;
import com.liting.service.OrdersService;
import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "OrderFindAllServlet")
public class OrderFindAllServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");

        OrdersService ordersService=new OrdersService();
        List<Orders> orders = ordersService.AdminShowAllOrdersInfo(id);
        System.out.println(orders);
        HttpSession session=request.getSession();
        session.setAttribute("order",orders);

        request.getRequestDispatcher("admin/orders/view.jsp");
    }
}
