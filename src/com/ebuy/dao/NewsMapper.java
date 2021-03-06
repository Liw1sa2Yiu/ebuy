package com.ebuy.dao;

import com.ebuy.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}