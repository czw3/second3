package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @program: czw
 * @Date: 2019/5/29 16:17
 * @Author: Mr.Deng
 * @Description:
 */
@Getter
@Setter
public class User implements Serializable{

 private int uid;

 private String username;

 private String password;

 private int isAdmin;
}
