package com.ebuy.dao;

import com.ebuy.model.Srd;

public interface SrdMapper {
    int deleteByPrimaryKey(Integer srdId);

    int insert(Srd record);

    int insertSelective(Srd record);

    Srd selectByPrimaryKey(Integer srdId);

    int updateByPrimaryKeySelective(Srd record);

    int updateByPrimaryKey(Srd record);
}