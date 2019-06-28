package com.cssl.service;

import com.cssl.pojo.User;

import java.util.List;

/**
 * @program: czw
 * @Date: 2019/5/29 16:32
 * @Author: Mr.Deng
 * @Description:
 */
public interface UserServer {

     int regs(User user);

     int ajaxName(String username);

     User login(User user);

     void aa(int id);

     List<User> selectAll();
}
