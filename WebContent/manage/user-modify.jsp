<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <base href="<%=basePath%>">
<title>后台管理 - 易买网</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function-manage.js"></script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo"><img src="images/logo.gif" /></div>
	<div class="help"><a href="user/index">返回前台页面</a></div>
	<div class="navbar">
		<ul class="clearfix">
			<li><a href="manage/index">首页</a></li>
			<li class="current"><a href="manage/user">用户</a></li>
			<li><a href="manage/product">商品</a></li>
			<li><a href="manage/order">订单</a></li>
			<li><a href="manage/guest">留言</a></li>
			<li><a href="manage/news">新闻</a></li>
		</ul>
	</div>
</div>
<div id="childNav">
	<div class="welcome wrap">
		管理员pillys您好，今天是2012-12-21，欢迎回到管理后台。
	</div>
</div>
<div id="position" class="wrap">
	您现在的位置：<a href="manage/index">易买网</a> &gt; 管理后台
</div>
<div id="main" class="wrap">
	<div id="menu-mng" class="lefter">
		<div class="box">
			<dl>
				<dt>用户管理</dt>
				<dd><em><a href="manage/useradd">新增</a></em><a href="manage/user">用户管理</a></dd>
				<dt>商品信息</dt>
				<dd><em><a href="productClass-add.html">新增</a></em><a href="productClass.html">分类管理</a></dd>
				<dd><em><a href="manage/productadd">新增</a></em><a href="manage/product">商品管理</a></dd>
				<dt>订单管理</dt>
				<dd><a href="manage/order">订单管理</a></dd>
				<dt>留言管理</dt>
				<dd><a href="manage/guest">留言管理</a></dd>
				<dt>新闻管理</dt>
				<dd><em><a href="manage/newsadd">新增</a></em><a href="manage/news">新闻管理</a></dd>
			</dl>
		</div>
	</div>
	<div class="main">
		<h2>修改用户</h2>
		<div class="manage">
			<form action="manage/usermdf">
				<table class="form">
					<tr>
						<td class="field">用户名：</td>
						<td><input type="text" class="text" name="userName" value="zhangsan" readonly="readonly" /></td>
					</tr>
					<tr>
						<td class="field">姓名：</td>
						<td><input type="text" class="text" name="name" value="张三" /></td>
					</tr>
					<tr>
						<td class="field">密码：</td>
						<td><input type="text" class="text" name="passWord" value="zhangsan" /></td>
					</tr>
					<tr>
						<td class="field">性别：</td>
						<td><input type="radio" name="sex" value="1" checked="checked" />男 <input type="radio" name="sex" value="1" />女</td>
					</tr>
					<tr>
						<td class="field">出生日期：</td>
						<td>
							<select name="birthyear">
								<option value="2000">2000</option>
								<option value="1999" selected="selected">1999</option>
							</select>年
							<select name="birthmonth">
								<option value="12">12</option>
								<option value="11" selected="selected">11</option>
							</select>月
							<select name="birthday">
								<option value="2">2</option>
								<option value="1" selected="selected">1</option>
							</select>日
						</td>
					</tr>
					<tr>
						<td class="field">手机号码：</td>
						<td><input type="text" class="text" name="mobile" value="13800000000" /></td>
					</tr>
					<tr>
						<td class="field">送货地址：</td>
						<td><input type="text" class="text" name="address" value="高老庄" /></td>
					</tr>
					<tr>
						<td class="field">头像：</td>
						<td><input type="file" class="text" name="photo" /></td>
					</tr>
					<tr>
						<td></td>
						<td><label class="ui-blue"><input type="submit" name="submit" value="更新" /></label></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2017 爱苗科技 All Rights Reserved. 皖ICP证000001号
</div>
</body>
</html>
