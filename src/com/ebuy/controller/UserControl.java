package com.ebuy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/user")
public class UserControl {
    //一.--------------进入主页面------------------
	@RequestMapping("/index")
	public String index(){
		return "page/index";
	}
	//二.--------------注册页面--------------------------
	@RequestMapping(value="/reg",method=RequestMethod.GET)
	public String reg(){
		return "page/register";
	}
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	public String reg(Model model){
	
		return "page/reg-result";
	}
	//三.--------------登录页面------------------------------
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
      return "page/login";
}   
	//与数据库做比较，调数据库，做判断，成功后返回result
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Model model){
      return "page/login-result";
}
	//四.--------------留言板块-------------------------------
	@RequestMapping("/guest")
	public String guest(){
		return "page/guestbook";
	}

	//六.-------------购物页面----------------------
	//传入商品信息,
	@RequestMapping(value="/shop",method=RequestMethod.GET)
	public String shop(){
		return "page/shoping";
	}
	//点击购买
	@RequestMapping(value="/shop",method=RequestMethod.POST)
	public String shop(Model model){
		return "page/shopping-result";
				
	}

}