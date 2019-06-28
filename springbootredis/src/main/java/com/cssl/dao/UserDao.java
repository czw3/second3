package com.cssl.dao;

import com.cssl.pojo.User;

import java.util.List;

/**
 * @program: czw
 * @Date: 2019/5/29 16:25
 * @Author: Mr.Deng
 * @Description:
 */
public interface UserDao {

  int regs(User user);

  int ajaxName(String username);

  User login(User user);

  List<User> selectAll();

}
