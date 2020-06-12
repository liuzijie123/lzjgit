package com.liting.dao;

import com.liting.domain.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    public void regist(User user) throws Exception;

    /**
     * 用户的登陆
     *
     * @param password
     * @return
     */
    public User checkLogin(String username, String password) throws Exception;

    /**
     * 根据状态码判断对象是否激活,查找用户中的激活码
     * @param code
     * @return
     */

    User findBystates(Integer state) throws SQLException;

    /**
     * 修改状态码为激活状态
     * @param
     * @throws SQLException
     */
    void updateState(Integer state , Integer id) throws SQLException;

    /**
     * 修改
     * @param user
     * @throws Exception
     */
    void updateUserInfo(User user) throws Exception;
}

