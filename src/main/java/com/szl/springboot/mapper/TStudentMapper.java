package com.szl.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.szl.springboot.entity.TStudent;
@Mapper
public interface TStudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TStudent record);

    int insertSelective(TStudent record);

    TStudent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TStudent record);

    int updateByPrimaryKey(TStudent record);

	List<TStudent> queryStudent();

	List<TStudent> queryStudent2();
}