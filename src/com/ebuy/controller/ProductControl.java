package com.ebuy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/product")
public class ProductControl {
    //进入产品列表,并传入值
	@RequestMapping("/list")
	public String list(){
	return "page/product-list";
		
	}
	//进入产品视图并传入值
	@RequestMapping("/view")
	public String view(){
		return "page/product-view";
	}
	//进入新闻视图
	@RequestMapping("/newsview")
	public String newsview(){
		return "page/news-view";
	}


}
