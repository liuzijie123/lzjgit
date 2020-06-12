package com.liting.service;

import com.liting.dao.Imp.UserDaoImp;
import com.liting.domain.User;

import java.sql.SQLException;

public class UserService {
    private UserDaoImp userDaoImp = new UserDaoImp();

    /**
     * 登陆用户
     *
     * @param username 用户名
     * @param passwrod 密码
     * @return 用户信息
     */
    public User login(String username, String passwrod) {

        User user = null;
        try {
            user = userDaoImp.checkLogin(username, passwrod);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    /**
     * 用户注册
     *
     * @param user 用户信息
     */

    public void register(User user) throws Exception {
        userDaoImp.regist(user);
    }

    /**
     * 激活用户，先找到用户的状态码，然后判断状态码是否为激活状态
     *
     * @param statusNum 状态码
     * @return 用户信息
     */
    public User states(Integer statusNum) throws SQLException {
        User user = userDaoImp.findBystates(statusNum);
        if (user == null) {
            return null;
        }
        user.setState(1);
        return user;
    }

    /**
     * 更新用户信息
     * @param user 需要修改的用户信息
     */
    public void updateUserInfo(User user) {
        try {
            userDaoImp.updateUserInfo(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
