package com.szl.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szl.springboot.entity.User;
import com.szl.springboot.mapper.JdbcTemplateDao;
import com.szl.springboot.service.JdbcTemplateService;

/**
 * 使用JdbcTemplate进行数据库操作
 * @author SongZhangLiang
 * @date 2017年8月18日 下午1:54:58
 */
@Service
public class JdbcTemplateServiceImpl implements JdbcTemplateService {
	
	@Autowired
	private JdbcTemplateDao jdbcTemplateDao;

	@Override
	public List<User> queryUser() {
		return jdbcTemplateDao.queryUser();
	}

	@Override
	public int insertUser(User user) {
		return jdbcTemplateDao.insertUser(user);
	}

	@Override
	public int delUser(int id) {
		return jdbcTemplateDao.delUser(id);
	}

	
	
	
}
