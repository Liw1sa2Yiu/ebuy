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
		<h2>用户管理</h2>
		<div class="manage">
			<table class="list">
				<tr>
					<th>ID</th>
					<th>姓名</th>
					<th>性别</th>
					<th>Email</th>
					<th>手机</th>
					<th>操作</th>
				</tr>
				<tr>
					<td class="first w4 c">1</td>
					<td class="w1 c">张三丰</td>
					<td class="w2 c">男</td>
					<td>fengsan.zhang@prd.com</td>
					<td class="w4 c">13888888888</td>
					<td class="w1 c"><a href="manage/usermdf">修改</a> <a href="javascript:Delete(1);">删除</a></td>
				</tr>
				<tr>
					<td class="first w4 c">2</td>
					<td class="w1 c">杨二郎</td>
					<td class="w2 c">男</td>
					<td>fengsan.zhang@prd.com</td>
					<td class="w4 c">13888888888</td>
					<td class="w1 c"><a href="manage/usermdf">修改</a> <a href="javascript:Delete(1);">删除</a></td>
				</tr>
			</table>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2017 爱苗科技 All Rights Reserved. 皖ICP证000001号
</div>
</body>
</html>
