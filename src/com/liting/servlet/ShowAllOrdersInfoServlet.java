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

@WebServlet(name = "ShowAllOrdersInfoServlet")
public class ShowAllOrdersInfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session=request.getSession();

        String id= request.getParameter("id");

        OrdersService ordersService=new OrdersService();

        List<Orders> os = ordersService.ShowAllOrdersInfo(id);

        System.out.println(os);

        session.setAttribute("os",os);

        session.setAttribute("id",id);

        request.getRequestDispatcher("orderInfo.jsp").forward(request,response);

    }
}
