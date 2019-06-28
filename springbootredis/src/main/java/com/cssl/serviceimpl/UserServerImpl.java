package com.cssl.serviceimpl;

import com.cssl.dao.UserDao;
import com.cssl.pojo.User;
import com.cssl.service.UserServer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: czw
 * @Date: 2019/5/29 16:33
 * @Author: Mr.Deng
 * @Description:
 */
@Service
@Transactional
public class UserServerImpl implements UserServer {
   @Resource
   private UserDao ud;

   @Override
   public int regs(User user) {

      return ud.regs(user);
   }

   @Override
   public User login(User user) {

      return ud.login(user);
   }

   @Override
   public int ajaxName(String username) {
      return ud.ajaxName(username);
   }

   @Override
   public void aa(int id) {

   }

   @Override
   //@Cacheable(value = "prefix")
   public List<User> selectAll() {
      return ud.selectAll();
   }
}
