package com.wbq.druid.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @ClassName DbUtils
 * @Description TODO
 * @Author Administrator
 * @Date 2020/12/10 15:52
 * @Version 1.0
 */
public class DbUtils {
    public static final Properties PROPERTIES = new Properties();
    /***
     * 声明连接池
     */
    private static DruidDataSource ds;

    static {
        InputStream resourceAsStream = DbUtils.class.getResourceAsStream("/db.properties");
        try {
            PROPERTIES.load(resourceAsStream);
            //创建连接池
            ds = (DruidDataSource) DruidDataSourceFactory.createDataSource(PROPERTIES);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static DataSource getDataSource() {
        return ds;
    }

    private void closeAll(ResultSet rs, Statement st, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
