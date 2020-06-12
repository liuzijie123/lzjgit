package com.liting.test;


import com.liting.util.C3p0;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.liting.domain.User;

import java.util.List;

public class c3p0test {


    @Test
    public void c3p0Test() throws Exception {

        QueryRunner qr = new QueryRunner(C3p0.getDataSource());
        List<User> list1 = qr.query("select * from user", new BeanListHandler<User>(User.class));
        System.out.println(list1);


    }


}