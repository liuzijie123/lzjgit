package com.liting.servlet;

import com.liting.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "MysAccountServlet")
public class MysAccountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setCharacterEncoding("utf-8");
            request.setCharacterEncoding("utf-8");
            HttpSession session=request.getSession();
            //从session中获取user
            User user = (User) session.getAttribute("userInfo");
            //判断user
            if (user==null){
                response.sendRedirect(request.getContextPath()+"/login.jsp");
                return;
            }else {
                String role = user.getRole();
                //判断角色
                if ("admin".equals(role)){
                    response.sendRedirect(request.getContextPath()
                    +"/admin/login/home.jsp");
                    return;
                }
                response.sendRedirect(request.getContextPath()+"myAccount.jsp");
                return;
            }

    }
}
