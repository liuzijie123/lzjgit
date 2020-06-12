package com.liting.servlet;

import com.liting.domain.User;
import com.liting.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet(name = "ModifyUserServlet")
public class ModifyUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        HttpSession session=request.getSession();
        //封装数据
        User user=new User();
        UserService us=new UserService();
        try {
            BeanUtils.populate(user,request.getParameterMap());
        } catch (IllegalAccessException  | InvocationTargetException  e) {
            e.printStackTrace();
        }
        us.updateUserInfo(user);

        //销毁session
        request.getSession().invalidate();

        response.sendRedirect("modifyUserInfoSuccess.jsp");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
