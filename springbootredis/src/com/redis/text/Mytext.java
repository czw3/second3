package com.redis.text;

import com.cssl.pojo.User;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: czw
 * @Date: 2019/6/20 14:50
 * @Author: Mr.Deng
 * @Description:
 */
public class Mytext {

   private static Jedis jd;
   private User user1;
   private User user2;

   @BeforeClass//在类之前
   public static void setUpBeforeClass() throws Exception {
     //连接到服务器，创建客户端实例
     jd = new Jedis("192.168.220.133",6379);
     jd.auth("1");
     System.out.println("连接成功");
     jd.select(0);

  }

  @Before//在text之前
 public void setUp() throws Exception {
    user1 = new User();
    user1.setUid(100);
    user1.setUsername("黄忠");
    user1.setPassword("123");

    user2 = new User();
    user2.setUid(101);
    user2.setUsername("黄忠2");
    user2.setPassword("123");
 }

 @Test//保存对象
 public void testSaveObject(){
   System.out.println("二进制user1"+"user1".getBytes());
   jd.set("user1".getBytes(),SerializeUtil.serialize(user1));
   jd.expire("user1".getBytes(),300);
   byte[] b = jd.get("user1".getBytes());
   Object obj = SerializeUtil.unserialize(b);
   if(obj !=null && obj instanceof User){
       User user = (User)obj;
    System.out.println(user.getUid()+"\t"+user.getUsername()+"\t"+user.getPassword());
   }
   }

   @Test
  public void testList(){
    //搞个list
    List<User> list = new ArrayList<User>();
    list.add(user1);
    list.add(user2);
    //以字符串的形式存进去
    jd.set("myList".getBytes(),SerializeUtil.serialize(list));
    jd.expire("myList".getBytes(),300);
    byte []  b = jd.get("myList".getBytes());
    Object obj = SerializeUtil.unserialize(b);
    if(obj != null && obj instanceof List<?>){
      List<User> list2 = (List<User>)obj;
      for(User user : list2){
       System.out.println(user.getUid()+""+user.getUsername()+""+user.getPassword());
      }
    }
   }

   //把这个实例销毁
   @AfterClass
   public static void ass() throws Exception{
    jd.close();
   }

}
