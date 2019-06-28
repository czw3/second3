package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @program: czw
 * @Date: 2019/6/19 19:59
 * @Author: Mr.Deng
 * @Description:
 */
@MapperScan("com.cssl.dao")
@SpringBootApplication
@EnableCaching
public class App {

 public static void main(String[] args) {
  SpringApplication.run(App.class,args);
 }
}
