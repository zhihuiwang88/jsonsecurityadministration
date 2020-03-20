package com.json.web.dao;

import com.json.web.entity.RecipeDaqo;
import com.json.web.entity.RecipeDaqoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecipeDaqoMapper {
    /**
     * countByExample
     */
    int countByExample(RecipeDaqoExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(RecipeDaqoExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer greensId);

    /**
     * insert
     */
    int insert(RecipeDaqo record);

    /**
     * insertSelective
     */
    int insertSelective(RecipeDaqo record);

    /**
     * selectByExample
     */
    List<RecipeDaqo> selectByExample(RecipeDaqoExample example);

    /**
     * selectByPrimaryKey
     */
    RecipeDaqo selectByPrimaryKey(Integer greensId);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") RecipeDaqo record, @Param("example") RecipeDaqoExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") RecipeDaqo record, @Param("example") RecipeDaqoExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(RecipeDaqo record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(RecipeDaqo record);
}