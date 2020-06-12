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
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@WebServlet(name = "findProductByManyConditionServlet")
public class findProductByManyConditionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Products products = new Products();

//            BeanUtils.populate(products,request.getParameterMap());
        HttpSession session = request.getSession();

        String id = request.getParameter("id");

        String category = request.getParameter("category");

        String name = request.getParameter("name");

        OrdersService ordersService = new OrdersService();

        List<Products> liketerm = ordersService.Liketerm(id, category, name);

        session.setAttribute("like",liketerm);

        request.getRequestDispatcher("admin/products/list.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
