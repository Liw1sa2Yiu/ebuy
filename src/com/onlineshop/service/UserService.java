package com.onlineshop.service;

import java.util.List;

import com.onlineshop.pojo.User;

public interface UserService {
	    int deleteByPrimaryKey(Integer id);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);
	    
	    List<User> list();
}
