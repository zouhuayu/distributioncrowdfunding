package com.atguigu.crowd.mapper;

import com.atguigu.crowd.entity.TagPO;
import com.atguigu.crowd.entity.TagPOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagPOMapper {
    int countByExample(TagPOExample example);

    int deleteByExample(TagPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagPO record);

    int insertSelective(TagPO record);

    List<TagPO> selectByExample(TagPOExample example);

    TagPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagPO record, @Param("example") TagPOExample example);

    int updateByExample(@Param("record") TagPO record, @Param("example") TagPOExample example);

    int updateByPrimaryKeySelective(TagPO record);

    int updateByPrimaryKey(TagPO record);

    void insertRelationshipBatch(@Param("projectId") Integer projectId, @Param("tagIdList") List<Integer> tagIdList);
}