package com.szl.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szl.springboot.entity.TStudent;
import com.szl.springboot.mapper.TStudentMapper;
import com.szl.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private TStudentMapper tStudentMapper;

	@Override
	public List<TStudent> queryStudent() {
		return tStudentMapper.queryStudent();
	}

	@Override
	public List<TStudent> queryStudent2() {
		return tStudentMapper.queryStudent2();
	}

}
