package com.liting.servlet;

import com.liting.service.OrdersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "delorderIDServlet")
public class delorderIDServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("utf-8");

        String id = request.getParameter("id");

        OrdersService ordersService=new OrdersService();

        ordersService.DeleteID(id);

        HttpSession session=request.getSession();

        session.setAttribute("id",id);

        request.getRequestDispatcher("delOrderSuccess.jsp").forward(request,response);


    }
}
