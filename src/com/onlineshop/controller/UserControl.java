package com.onlineshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlineshop.pojo.User;
import com.onlineshop.service.ProductServiceimpl;
import com.onlineshop.service.UserServiceimpl;

@Controller
@RequestMapping("/user")
public class UserControl {
	@Autowired
	   UserServiceimpl userServiceimpl;
	   ProductServiceimpl productServiceimpl;
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(){
		return "user/add";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(User user){
		userServiceimpl.insert(user);
		return "user/reg_user";
	}
	@RequestMapping("/login")
	public String login(HttpServletRequest request,User user,HttpSession s){
		String username=user.getUsername();
		String pwd=user.getPwd();
		List<User> a=userServiceimpl.list();
		for(User u:a){
			if(username.equals(u.getUsername())&&pwd.equals(u.getPwd())){
				String sb="欢迎"+username+"回来";
				s.setAttribute("user", u);
				s.setAttribute("success", sb);
				return "redirect:/products";
			}
		}
		String sb="用户名和密码不正确";
		request.setAttribute("sb", sb);
		return "user/reg_user";
	}
}
