package com.liting.servlet;

import com.liting.domain.User;
import com.liting.service.UserService;
import com.liting.util.MailUtils;
import com.liting.util.UuidUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet")
public class loginservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        HttpSession session = req.getSession();
        String userName = req.getParameter("username");
        String passWord = req.getParameter("password");
        try {
            UserService us = new UserService();
            User u = us.login(userName, passWord);
            session.setAttribute("userInfo", u);
            if (u == null) {
                PrintWriter writer = response.getWriter();
                response.setContentType("text/html;charset=utf-8");
                writer.print("<script type='text/javascript'>alert('账号或密码错误!');");
                writer.print("location.href='/login.jsp';");
                writer.print("</script>");
            }else {
                us.login(userName, passWord);
                req.getRequestDispatcher("index.jsp").forward(req, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
