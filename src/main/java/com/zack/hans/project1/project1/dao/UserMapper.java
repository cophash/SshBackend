package com.zack.hans.project1.project1.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.zack.hans.project1.project1.vo.UserVo;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    UserVo findByName(@Param("name") String name);

    @Select("SELECT * FROM USER WHERE ID = #{id}")
    UserVo getUserById(Long id);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
