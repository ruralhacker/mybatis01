package com.dao;

import com.domain.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<user> findAll();
   user findById(int id);
   int save (user  user);
   int update(user user);
   int deleteById(int id);
   List<user> findByName(String name);
    //适合两条以下多参查询
   user findByIdAndName(@Param("uid")int id,@Param("username")String  username);
   //适合两条以上多参查询
    user findByUser(user user);



}
