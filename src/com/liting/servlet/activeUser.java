package com.liting.servlet;

import com.liting.dao.Imp.UserDaoImp;
import com.liting.domain.User;
import com.liting.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "activeUser")
public class activeUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        UserService userService = new UserService();
        HttpSession session = request.getSession();
        String activecode = request.getParameter("activecode");
        UserDaoImp userDaoImp = new UserDaoImp();
        //得到注册页面传过来的值存入User当中
        User user = (User) session.getAttribute("userInfo");
        if (user.getActiveCode().equals(activecode)) {
            try {
                //查询数据库的id拿到一个查询方法，login方法返回的是User对象然后只拿它的id
                User userInfos = userService.login(user.getUsername(), user.getPASSWORD());
                userDaoImp.updateState(1, userInfos.getId());
                request.getRequestDispatcher(request.getContextPath() + "/activesuccess.jsp").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
