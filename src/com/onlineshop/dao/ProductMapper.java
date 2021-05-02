package com.onlineshop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.onlineshop.pojo.Product;
/*@Repository*/
public interface ProductMapper {
	//��ѯ���в�Ʒ��Ϣ
	List<Product> getProducts();
    int deleteByPrimaryKey(Integer pId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    String getPrice(String pName);
}