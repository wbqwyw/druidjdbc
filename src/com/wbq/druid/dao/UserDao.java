package com.wbq.druid.dao;

import com.wbq.druid.entity.User;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserDao {
    /**
     * 更新
     *
     * @param user
     * @return
     */
    public int update(User user);

    /**
     * 新增
     *
     * @param user
     * @return
     */
    public int intert(User user);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    public int delete(int id);

    /**
     * 查询单个用户
     *
     * @param id
     * @return
     */
    public User query(int id);

    /**
     * 查询全部用户
     *
     * @return
     */
    public List<User> queryAll();

}
