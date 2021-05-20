package com.ebuy.dao;

import com.ebuy.model.Shcar;

public interface ShcarMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Shcar record);

    int insertSelective(Shcar record);

    Shcar selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Shcar record);

    int updateByPrimaryKey(Shcar record);
}