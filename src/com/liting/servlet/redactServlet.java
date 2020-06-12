package com.liting.servlet;

import com.liting.domain.Products;
import com.liting.service.OrdersService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet(name = "redactServlet")
public class redactServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("utf-8");

        try {
            String id = request.getParameter("id");
            Products p=new Products();
            BeanUtils.populate(p,request.getParameterMap());
            p.setId(id);
            OrdersService ordersService=new OrdersService();
            ordersService.redactServlet(p);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("/admin/products/list.jsp").forward(request,response);
    }
}
