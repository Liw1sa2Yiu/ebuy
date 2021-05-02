package com.onlineshop.dao;

import com.onlineshop.pojo.Business;

public interface BusinessMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Business record);

    int insertSelective(Business record);

    Business selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}