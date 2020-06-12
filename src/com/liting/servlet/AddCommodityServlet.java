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
import java.util.UUID;

@WebServlet(name = "AddCommodityServlet")
public class AddCommodityServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //使用BeanUtils前台页面的值必须与你的domain层的属性值相同
        Products products = new Products();
        OrdersService ordersService = new OrdersService();
        try {
            BeanUtils.populate(products, request.getParameterMap());
            products.setId(String.valueOf(UUID.randomUUID()));

            ordersService.AddBook(products);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("admin/products/list.jsp").forward(request, response);
    }
}
