package com.szl.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.szl.springboot.entity.TStudent;
import com.szl.springboot.service.StudentService;
import com.szl.springboot.util.JsonUtil;

/**
 * 学生控制层
 * 
 * 主要为了演示Mybatis的级联查询
 * 
 * @author Andrew Song
 * @date 2017年8月20日下午1:20:30
 */
@RestController
@RequestMapping(value="student",produces="application/json; charset=UTF-8")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * 
	 * 查询学生信息
	 * 学生表一对一映射学生详情来查询学生详情
	 * 学生表一对多映射成绩表来查询学生成绩
	 * 学生成绩表一对一映射课程表来查询课程名称 
	 * @author Andrew Song
	 * @date 2017年8月20日下午1:24:06
	 * @return
	 */
	@RequestMapping(value="queryStudent")
	public String queryStudent(){
		List<TStudent> studentList = studentService.queryStudent();
		return JsonUtil.toJson(studentList);
	}
	
	/**
	 * 另外一种方式的映射,用sql关联直接查询,定义自己的resultMap,具体请查看TStudentMapper.xml
	 * @author Andrew Song
	 * @date 2017年8月20日下午2:40:30
	 * @return
	 */
	@RequestMapping(value="queryStudent2")
	public String queryStudent2(){
		List<TStudent> studentList = studentService.queryStudent2();
		return JsonUtil.toJson(studentList);
	}
	
	
	
	

}
