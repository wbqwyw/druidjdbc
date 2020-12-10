package com.wbq.druid.utils;

import java.sql.Connection;

/**
 * @ClassName TestPool
 * @Description ¡¨Ω”≥ÿ≤‚ ‘
 * @Author Administrator
 * @Date 2020/12/10 16:00
 * @Version 1.0
 */
public class TestPool {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Connection connection = DbUtils.getConnection();
            System.out.println(connection);
        }
    }

}
