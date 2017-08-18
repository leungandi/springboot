package com.szl.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.szl.springboot.entity.User;
/**
 * 第一种方式：
 * Mybatis注解的方式好简单，只要定义一个dao接口，然后sql语句通过注解写在接口方法上。
 * 最后给这个接口添加@Mapper注解或者在启动类上添加@MapperScan(“com.szl.springboot.mapper”)注解都行。
 * 
 * 第二种方式：
 * 如果需要使用XML方式，则需要在properties配置文件中配置以下：
 * 1.指定bean所在包
 * mybatis.type-aliases-package=com.szl.springboot.entity
 * 2.指定映射文件
 * mybatis.mapperLocations=classpath:mapper/*.xml 
 * @author SongZhangLiang
 * @date 2017年8月18日 下午2:51:03
 */

@Mapper
public interface UserMapper {
	
	
	/************使用第一种方式,纯注解来使用*****************/
//	@Select("select * from t_users where id = #{id}")
//	public User queryUserById(@Param("id")int id);
//	
//	@Select("select * from t_users")
//	public List<User> queryUser();
//	
//	@Delete("DELETE FROM t_users where id=#{id}")
//	public int delUser(int id);
//	
//	@Insert("insert into `t_users`(`name`,`email`) values (#{name},#{email})")
//	public int insertUser(User user);
	
	
	/************使用第二种方式,结合XML来使用*****************/
	public User queryUserById(@Param("id")int id);
	
	public List<User> queryUser();
	
	public int delUser(int id);
	
	public int insertUser(User user);

}
