package com.cssl.pojo;

import java.io.Serializable;

/**
 * @program: czw
 * @Date: 2019/6/20 15:10
 * @Author: Mr.Deng
 * @Description:
 */

public class User implements Serializable{
   private int uid;
   private String username;
   private String password;

 public int getUid() {
  return uid;
 }

 public void setUid(int uid) {
  this.uid = uid;
 }

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }
}
