package com.liting.servlet;

import com.liting.service.OrdersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "DelBookServlet")
public class DelBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        OrdersService ordersService=new OrdersService();
        ordersService.delete(id);
        HttpSession session=request.getSession();
        session.setAttribute("id",id);
        response.sendRedirect("/admin/products/list.jsp");
    }
}
