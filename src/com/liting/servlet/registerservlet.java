package com.liting.servlet;

import com.liting.domain.User;
import com.liting.service.UserService;
import com.liting.util.MailUtils;
import com.liting.util.UuidUtil;
import sun.awt.image.OffScreenImage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class registerservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码集
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //封装数据
        User user = new User();
        UserService userService = new UserService();
        user.setUsername(request.getParameter("username"));
        user.setPASSWORD(request.getParameter("password"));
        user.setGender(request.getParameter("gender"));
        user.setEmail(request.getParameter("email"));
        user.setTelephone(request.getParameter("telephone"));
        user.setIntroduce(request.getParameter("introduce"));
        user.setActiveCode(UuidUtil.getUuid());
        HttpSession session = request.getSession();
        try {
                User userInfos = userService.login(user.getUsername(), user.getPASSWORD());
                PrintWriter writer = response.getWriter();
                String password = request.getParameter("password");
                String repassword = request.getParameter("repassword");
                if (!password.equals(repassword) ) {
                    response.setContentType("text/html;charset=utf-8");
                    writer.print("<script type='text/javascript'>alert('两次密码不正确!');");
                    writer.print("location.href='/index.jsp';");
                    writer.print("</script>");
                    return;
                }
                try {
                    userService.register(user);
                    response.setContentType("text/html;charset=utf-8");
                    writer.print("<script type='text/javascript'>alert('注册成功!');");
                    writer.print("</script>");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    session.setAttribute("userInfo", user);
                } catch (Exception e) {
                    e.printStackTrace();
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    }
//   else {
//            //验证码不一致，错误提示信息存储到request当中，返回给主页面
//            session.setAttribute("error", "验证码错误");
//            PrintWriter writer = response.getWriter();
//            response.setContentType("text/html;charset=utf-8");
//            writer.print("<script type='text/javascript'>alert('验证码错误!');");
//            writer.print("location.href='/index.jsp';");
//            writer.print("</script>");
//        }
}