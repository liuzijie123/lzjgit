package com.liting.servlet;

import com.liting.domain.Products;
import com.liting.service.OrdersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "findaAllproductsServlet")
public class findaAllproductsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        OrdersService ordersService=new OrdersService();
        List<Products> productById = ordersService.findProductById();

        session.setAttribute("pid",productById);




        request.getRequestDispatcher("/admin/products/list.jsp").forward(request,response);
    }
}
