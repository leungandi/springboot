package com.szl.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.szl.springboot.entity.TTimetable;
@Mapper
public interface TTimetableMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TTimetable record);

    int insertSelective(TTimetable record);

    TTimetable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TTimetable record);

    int updateByPrimaryKey(TTimetable record);
}