package com.szl.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.szl.springboot.entity.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from t_users where id = #{id}")
	public User queryUserById(@Param("id")int id);

}
