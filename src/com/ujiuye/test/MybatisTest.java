package com.ujiuye.test;

import com.dao.OrdersMapper;
import com.dao.UserMapper;
import com.domain.Orders;
import com.domain.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    SqlSessionFactory sqlSessionFactory=null;
    @Before
    public  void init(){
        try {
            //1.定义配置文件
            String resource="mybatis-config.xml";
            //2.加载配置文件
            InputStream inputStream= Resources.getResourceAsStream(resource);
            //3.创建sqlSessionFactory
             sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public  void  test(){
            //4.开启sqlsession
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //5.执行sql -->核心配置文件 -->映射文件 -->找到statment(findAll)
            List<user> users= sqlSession.selectList("findAll");
            //6.处理结果
            System.out.println(users);
            System.out.println(users.size());
    }
    /*查询所有*/
    @Test
    public void test2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<user> users = mapper.findAll();
        System.out.println(users);
    }
    /*
    通过id查询用户
     */
    @Test
    public void  test3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        user user = mapper.findById(102);
        System.out.println(user);
    }
    @Test
    public void test4(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        user user=new user(){{
           setUid(120);
           setUsername("宇智波带土");
           setPassword("123456");
           setHobby("琳");
        }};
        int ret = mapper.save(user);
        sqlSession.commit();
        System.out.println(ret);
    }
    @Test
    public void test5(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        user user=new user(){{
           setUid(109);
           setUsername("太上老君");
        }};
        int ret=mapper.update(user);
        sqlSession.commit();
        if(ret==1){
            System.out.println("success");
        }
    }
    @Test
    public void test6(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int ret = mapper.deleteById(101);
        sqlSession.commit();
        if(ret==1){
            System.out.println("success");
        }
    }
    @Test
    public  void test7(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<user> users = mapper.findByName("白");  //ctrl+alt+shift+j:批量修改
        System.out.println(users);
    }
    @Test//适合两条以下多参查询
    public  void test8(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        user user = mapper.findByIdAndName(109, "太上老君");
        System.out.println(user);

    }
    @Test //适合两条以上多条语句查询
    public void  test9(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        user user=new user(){{
            setUid(109);
            setUsername("太上老君");
            setPassword("9999");
        }};
        user ret=mapper.findByUser(user);
        System.out.println(ret);
    }
    @Test
    public void test10(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<Orders> orders = mapper.findAll();
        System.out.println(orders.size());
    }


}








