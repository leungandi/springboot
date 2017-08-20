package com.szl.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.szl.springboot.entity.TStudentScore;
@Mapper
public interface TStudentScoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TStudentScore record);

    int insertSelective(TStudentScore record);

    TStudentScore selectByPrimaryKey(Long id);
    
    List<TStudentScore> queryStudentScoreByStudentId(Long id);

    int updateByPrimaryKeySelective(TStudentScore record);

    int updateByPrimaryKey(TStudentScore record);
}