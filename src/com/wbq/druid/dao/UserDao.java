package com.wbq.druid.dao;

import com.wbq.druid.entity.User;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserDao {
    /**
     * ����
     *
     * @param user
     * @return
     */
    public int update(User user);

    /**
     * ����
     *
     * @param user
     * @return
     */
    public int intert(User user);

    /**
     * ɾ��
     *
     * @param id
     * @return
     */
    public int delete(int id);

    /**
     * ��ѯ�����û�
     *
     * @param id
     * @return
     */
    public User query(int id);

    /**
     * ��ѯȫ���û�
     *
     * @return
     */
    public List<User> queryAll();

}
