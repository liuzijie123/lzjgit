package com.liting.servlet;

import com.liting.domain.Orderitem;
import com.liting.service.OrdersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updatepaystateServlet")
public class updatepaystateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("utf-8");

        int paystate=1;
        String id=request.getParameter("id");

        String orderid = request.getParameter("orderid");

        Double money = Double.valueOf(request.getParameter("money"));

        OrdersService ordersService = new OrdersService();

        ordersService.updatepaystate(id,paystate);

        request.getRequestDispatcher("paysuccess.jsp").forward(request,response);
//        System.out.println("修改成功");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
