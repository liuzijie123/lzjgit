package com.liting.servlet;

import com.liting.util.LoginUtils;
import com.liting.util.PageBean;
import com.liting.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ShowProductByPageServlet")
public class ShowProductByPageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");//解决中文乱码
        HttpSession session = request.getSession();
        ProductService productService = new ProductService();

//        导入LoginUtils判是否登陆，传入了两个请求与响应参数
        LoginUtils loginUtils=new LoginUtils();
        if (loginUtils.login(request,response)) {
            String category = request.getParameter("category");
            if (category != null) {
                category = new String(category.getBytes("iso-8859-1"), "utf-8");
            }

            int currPage = Integer.parseInt(request.getParameter("currPage"));
            int pagsize = 3;

            PageBean pageBean = productService.findcategory(category, pagsize, currPage);

            pageBean.setTotalPage((pageBean.getTotalCount() / pageBean.getPageSize()) + 1);

            session.setAttribute("pd", pageBean);
            request.getRequestDispatcher("product_list.jsp").forward(request, response);

        }
        else {
            PrintWriter writer = response.getWriter();
            response.setContentType("text/html;charset=utf-8");
            writer.print("<script type='text/javascript'>alert('请先登陆在查看');");
            writer.print("location.href='/index.jsp';");
            writer.print("</script>");

        }
    }
}
