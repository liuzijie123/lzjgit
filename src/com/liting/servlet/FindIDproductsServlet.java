package com.liting.servlet;

import com.liting.domain.Products;
import com.liting.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "FindIDproductsServlet")
public class FindIDproductsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        String id = request.getParameter("id");
        //用session数据库更新了session是不会更新的
        ProductService productService=new ProductService();

        Products pds = productService.findProductByIds(id);

        session.setAttribute("pds",pds);
        request.getRequestDispatcher("admin/products/edit.jsp").forward(request,response);
    }
}
