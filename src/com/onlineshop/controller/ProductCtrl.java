package com.onlineshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlineshop.pojo.Product;
import com.onlineshop.service.ProductServiceimpl;

@Controller
public class ProductCtrl {
	@Autowired
   ProductServiceimpl productServiceimpl;
	@RequestMapping("/index")
	public String products(){
	
	return "page/index";
		
	}


}
