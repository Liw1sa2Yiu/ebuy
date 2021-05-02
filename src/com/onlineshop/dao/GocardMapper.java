package com.onlineshop.dao;

import com.onlineshop.pojo.Gocard;

public interface GocardMapper {
    int deleteByPrimaryKey(Integer cardId);

    int insert(Gocard record);

    int insertSelective(Gocard record);

    Gocard selectByPrimaryKey(Integer cardId);

    int updateByPrimaryKeySelective(Gocard record);

    int updateByPrimaryKey(Gocard record);
}