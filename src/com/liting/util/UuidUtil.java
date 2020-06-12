package com.liting.util;

import org.junit.Test;

import java.util.UUID;

public class UuidUtil {
    //生成的随机激活码
    public static String getUuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
    /**
     * test
     */
    @Test
    public void  test() {
        System.out.println(UuidUtil.getUuid());
        System.out.println(UuidUtil.getUuid());
        System.out.println(UuidUtil.getUuid());
        System.out.println(UuidUtil.getUuid());
    }
}
