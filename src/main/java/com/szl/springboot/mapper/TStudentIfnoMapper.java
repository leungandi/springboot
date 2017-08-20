package com.szl.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.szl.springboot.entity.TStudentIfno;
@Mapper
public interface TStudentIfnoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TStudentIfno record);

    int insertSelective(TStudentIfno record);

    TStudentIfno selectByPrimaryKey(Long id);
    
    TStudentIfno queryStundenInfoByStundentId(Long id);

    int updateByPrimaryKeySelective(TStudentIfno record);

    int updateByPrimaryKey(TStudentIfno record);
}