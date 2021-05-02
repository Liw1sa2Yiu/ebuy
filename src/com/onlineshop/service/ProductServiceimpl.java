package com.onlineshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.dao.ProductMapper;
import com.onlineshop.pojo.Product;
@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
	ProductMapper productMapper;
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productMapper.getProducts();
	}

}
