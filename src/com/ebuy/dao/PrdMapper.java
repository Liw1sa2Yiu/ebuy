package com.ebuy.dao;

import com.ebuy.model.Prd;

public interface PrdMapper {
    int deleteByPrimaryKey(Integer prdId);

    int insert(Prd record);

    int insertSelective(Prd record);

    Prd selectByPrimaryKey(Integer prdId);

    int updateByPrimaryKeySelective(Prd record);

    int updateByPrimaryKey(Prd record);
}