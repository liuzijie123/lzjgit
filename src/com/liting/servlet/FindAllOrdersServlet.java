package com.liting.servlet;

import com.liting.domain.Orders;
import com.liting.domain.User;
import com.liting.service.OrdersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindAllOrdersServlet")
public class FindAllOrdersServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session=request.getSession();

        User userInfo = (User) session.getAttribute("userInfo");
        String id = String.valueOf(userInfo.getId());

        OrdersService os=new OrdersService();

        List<Orders> list = os.ShowAllOrders(id);
        System.out.println(list);
        session.setAttribute("list",list);



        request.getRequestDispatcher("orderlist.jsp").forward(request,response);

    }
}
