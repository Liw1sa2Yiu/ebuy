package com.ebuy.dao;

import com.ebuy.model.Notice;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer ntId);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer ntId);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}