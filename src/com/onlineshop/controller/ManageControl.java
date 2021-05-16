package com.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 输入manage/index进入用户管理主页
 * 此控制器控制manage文件夹的所有页面
 * @author Lucario
 *
 */
@Controller
@RequestMapping("/manage")
public class ManageControl {
	//一.-------------进入管理主页-----------------
	@RequestMapping("/index")
	public String index(){
		return "manage/index";
	}
	//二.-------------进入用户页面------------------
	@RequestMapping("/user")
	public String user(){
		return "manage/user";
	}
	//进入修改页面，带值进来
	@RequestMapping(value="/usermdf",method=RequestMethod.GET)
	public String usermdf(){
		return "manage/user-modify";
	}
	//写修改方法
	@RequestMapping(value="/usermdf",method=RequestMethod.POST)
	public String usermdf(Model model){
		return "manage/manage-result";
	}
	//进入用户增加页面不带值
	@RequestMapping(value="/useradd",method=RequestMethod.GET)
	public String useradd(){
		return "manage/user-add";
	}
	//添加用户信息入库
	@RequestMapping(value="/useradd",method=RequestMethod.POST)
	public String useradd(Model model){
		return "manage/manage-result";
	}
	//三.-----------产品进入商品页面并传值---------------
	@RequestMapping("/product")
	public String product(){
		return "manage/product";
	}
	//进入产品修改页面并传值
	@RequestMapping(value="/productmdf",method=RequestMethod.GET)
	public String productmdf(){
		return "manage/product-modify";
	}
	//修改完后的，入数据库
	@RequestMapping(value="/productmdf",method=RequestMethod.POST)
	public String productmdf(Model model){
		return "manage/manage-result";
	}
	@RequestMapping(value="/productadd",method=RequestMethod.GET)
	public String productadd(){
		return "manage/product-add";
	}
	//修改完后的，入数据库
	@RequestMapping(value="/productadd",method=RequestMethod.POST)
	public String productadd(Model model){
		return "manage/manage-result";
	}
	//四.-------------订单：进入订单页面并传值--------------
	@RequestMapping("/order")
	public String order(){
		return "manage/order";
	}
	//进入修改页面，并传入当前订单的属性
	@RequestMapping(value="/ordermdf",method=RequestMethod.GET)
	public String ordermdf(){
		return "manage/order-modify";
	}
	//修改方法，并入库
	@RequestMapping(value="/ordermdf",method=RequestMethod.POST)
	public String ordermdf(Model model){
		return "manage/manage-result";
	}
	//五.------------留言进入留言页面,并带留言信息------------
	@RequestMapping("/guest")
	public String guest(){
		return "manage/guestbook";
	}
	//修改留言页面,并带入当前留言的值和选定项
	@RequestMapping(value="/guestmdf",method=RequestMethod.GET)
	public String guestmdf(){
		return "manage/guestbook-modify";
	}
	//修改后入库
	@RequestMapping(value="/guestmdf",method=RequestMethod.POST)
	public String guestmdf(Model model){
		return "manage/manage-result";
	}
	//六.-------------新闻 进入新闻页面，并传当前数据的值-------------
	@RequestMapping("/news")
	public String news(){
		return "manage/news";
	}
	//进入新闻修改页面并传当前选定的新闻
	@RequestMapping(value="/newsmdf",method=RequestMethod.GET)
	public String newsmdf(){
		return "manage/news-modify";
	}
	//修改后入库
	@RequestMapping(value="/newsmdf",method=RequestMethod.POST)
	public String newsmdf(Model model){
		return "manage/manage-result";
	}
	//进入新闻添加页面
	@RequestMapping(value="/newsadd",method=RequestMethod.GET)
	public String newsadd(){
		return "manage/news-add";
	}
    //增加新闻的值并入库
	@RequestMapping(value="/newsadd",method=RequestMethod.POST)
	public String newsadd(Model model){
		return "manage/manage-result";
	}
	
}
