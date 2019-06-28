package com.cssl.control;

import com.cssl.pojo.User;
import com.cssl.service.UserServer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: czw
 * @Date: 2019/5/29 16:35
 * @Author: Mr.Deng
 * @Description:
 */
@Controller
public class UserControl {

 //取出当前的application
/* private ServletContext application;
 @Override
 public void setServletContext(ServletContext servletContext) {
    this.application = servletContext;
 }*/

 @Resource
 private UserServer us;


 @RequestMapping("/regs")
 public String regs(User user){

      if(us.regs(user)>0){
        return "login";
      }

    return "error";

 }





  @RequestMapping("/aaaa")
  public String aa(){
    return "add";
  }


  @RequestMapping("/kankan")
  @Cacheable(value = "w")
  public ModelAndView kankan(ModelAndView mav){
   System.out.println("aa");
      List<User> list = us.selectAll();
      mav.addObject("list",list);
      mav.setViewName("test");
     return mav;
  }
}
