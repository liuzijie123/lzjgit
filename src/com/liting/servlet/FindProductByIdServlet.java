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

@WebServlet(name = "FindProductByIdServlet")
public class FindProductByIdServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        ProductService productService=new ProductService();
        int id= Integer.parseInt(request.getParameter("id"));

        Products product = productService.findProductById(id);

        session.setAttribute("p",product);

        request.getRequestDispatcher("product_info.jsp").forward(request,response);


    }
}
