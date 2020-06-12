package com.liting.servlet;

import com.liting.service.ProductService;
import com.liting.util.PageBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


//搜索商品
@WebServlet(name = "FindProduvtBySearchServlet")
public class FindProduvtBySearchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProductService productService=new ProductService();
        PageBean pageBean=new PageBean();
        //获取请求时携带的图书名称
        String name = request.getParameter("name");
        int currPage=Integer.parseInt(request.getParameter("currPage"));
        int pagsize = 3;

        productService.findcategory(name,pagsize,currPage);

        pageBean.setTotalPage((pageBean.getTotalCount() / pageBean.getPageSize()) + 1);
        HttpSession session=request.getSession();

//        session.setAttribute("pd", pageBean);
        request.getRequestDispatcher("product_list.jsp").forward(request, response);


    }
}
