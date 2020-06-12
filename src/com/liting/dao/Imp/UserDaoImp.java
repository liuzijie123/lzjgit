package com.liting.dao.Imp;

import com.liting.dao.UserDao;
import com.liting.domain.User;
import com.liting.util.C3p0;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImp implements UserDao {
     private QueryRunner qr=new QueryRunner(C3p0.getDataSource());
    @Override
    public void regist(User user) throws Exception {
        //向数据库里插入数据(预编译写法)
        String sql="insert into user values(default,?,?,?,?,?,?,?,0,default,default)";

//        String sql = "insert into user(username,PASSWORD,PASSWORD,gender,email,telephone,introduce,activeCode) values(?,?,?,?,?,?,?,?)";
        qr.update(sql,
                user.getUsername(),
                user.getPASSWORD(),
                user.getGender(),
                user.getEmail(),
                user.getTelephone(),
                user.getIntroduce(),
                user.getActiveCode()
        );
    }

    @Override
    public User checkLogin(String username, String password) throws Exception {
        String sql="select *from user where username=? and password=?";
        return qr.query(sql, new BeanHandler<User>(User.class),username,password);

    }

    @Override
    public User findBystates(Integer state) throws SQLException {
        String sql = "select * from tab_user where state = ?";
        return qr.query(sql, new BeanHandler<User>(User.class),state);
    }

    /**
     * 通过注册进去的id，激活后修改相应的状态码
     * @param state 状态
     * @param id 用户ID
     * @throws SQLException
     */
    @Override
    public void updateState(Integer state , Integer id) throws SQLException {
        String sql="update user set state=? where id=?";
        qr.update(sql,state,id);
    }



    @Override
    public void updateUserInfo(User user) throws  Exception {
        String sql="update user set password=?,gender=?,telephone=? where id=?";
        qr.update(sql,user.getPASSWORD(),user.getGender(),user.getTelephone(),user.getId());
    }
}