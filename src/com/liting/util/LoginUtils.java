package com.liting.util;

import com.liting.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginUtils {
    public boolean login(HttpServletRequest request, HttpServletResponse response)  {
        HttpSession session=request.getSession();
        User userInfo = (User) session.getAttribute("userInfo");
        if (userInfo!=null){
            return true;
        }
        return  false;
    }

}
