package com.liting.servlet;

import com.liting.domain.Orderitem;
import com.liting.domain.Orders;
import com.liting.domain.Products;
import com.liting.domain.User;
import com.liting.service.OrdersService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

@WebServlet(name = "CreateOrderServlet")
public class CreateOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Orders orders = new Orders();
        OrdersService ordersService = new OrdersService();
        try {
            BeanUtils.populate(orders, request.getParameterMap());
            orders.setId(UUID.randomUUID().toString());
            orders.setOrdertime(new Date());
            System.out.println(orders);
            HttpSession session = request.getSession();
            User userInfo = (User) session.getAttribute("userInfo");
            orders.setUser(userInfo);
            ordersService.createOrders(orders);
            List<Orderitem> orderitemList = new ArrayList<Orderitem>();
            Map<Products, String> byProduct = (Map<Products, String>) session.getAttribute("byProduct");
            for (Products p : byProduct.keySet()) {
                Orderitem orderitem  = new Orderitem(orders,p,Integer.valueOf(byProduct.get(p)));
                orderitemList.add(orderitem);
                orders.setOrderitems(orderitem);
                ordersService.checkOrders(orderitem);
            }
            session.setAttribute("orders", orders);
            request.getRequestDispatcher("pay.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("order.jsp");

        }
    }
}
