package com.wbq.druid.dao.impl;

import com.wbq.druid.dao.UserDao;
import com.wbq.druid.entity.User;
import com.wbq.druid.utils.DateUtils;
import com.wbq.druid.utils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/12/10 16:41
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {

    private QueryRunner queryRunner = new QueryRunner(DbUtils.getDataSource());

    @Override
    public int update(User user) {
        try {
            Object[] objects = {user.getUsercode(), user.getUsername(), user.getAge(), DateUtils.utilDateToSqlDate(user.getBorndate()), user.getAddress(), user.getId()};
            return queryRunner.update(" update users set usercode=?,username=?,age=?,borndate=?,address=? where id = ?", objects);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public int intert(User user) {
        Object[] objects = {user.getId(), user.getUsercode(), user.getUsername(), user.getAge(), DateUtils.utilDateToSqlDate(user.getBorndate()), user.getAddress()};
        try {
            return queryRunner.update("insert into users (id,usercode,username,age,borndate,address)values (?,?,?,?,?,£¿)", objects);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(int id) {
        try {
            return queryRunner.update("delete from users where id =?", id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    @Override
    public User query(int id) {
        try {
            return queryRunner.query("select * from users where id ?", new BeanHandler<User>(User.class), id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> queryAll() {
        try {
            return queryRunner.query("select * from users ;", new BeanListHandler<User>(User.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
