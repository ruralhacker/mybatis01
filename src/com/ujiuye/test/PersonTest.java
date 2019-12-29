package com.ujiuye.test;

import com.dao.PersonMapper;
import com.domain.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PersonTest {

    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void init() throws IOException {
        //定义配置文件
        String resource = "mybatis-config.xml";
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建sqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void test(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        List<Person> people = mapper.findAll();
        System.out.println(people);


    }
}
