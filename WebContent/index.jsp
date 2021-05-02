<%@page import="com.onlineshop.pojo.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style type="text/css">

 /*  tr td{
  width:300px;
  
  
  } */
  
 
  .pinfo a{
  color:#123;/* 初始化的颜色 */
    width:15px;/*  所有a的width */
  float: left;/* 所有的a按照水平排列 */
  margin-left: 45px;/*a 与a之间有空隙  */
  }
 a:HOVER {
	color: #678;/*鼠标经过的颜色  */
}

</style>


</head>
<body>
<jsp:include page="nar/top.jsp"></jsp:include>

//////////产品展示
${success}
<p>${user.id}</p>
<p>${user.username}</p>
<p>${user.pwd}</p>
<p>${user.addr1}</p>
<p>${user.addr2}</p>
<p>${user.email}</p>
<p>${user.phone}</p>
<table>
<%-- <c:forEach items="${ps}" var="product"> --%>
<%
List<Product> products=(List)request.getAttribute("ps");
for(int i=0;i<products.size();i++){ %>
<tr>
<%for(int j=3*i;j<products.size();j++){ %>
<td>
<a href="" class="img"><img src="${pageContext.request.contextPath}/upload/<%=products.get(j).getpImgname()%>"/></a> 
<div  class="pinfo">
<a href="" class="pname"><%=products.get(j).getpName()%></a>
<a href="" class="pnumber"><%=products.get(j).getpNumber()%></a>
</div>

</td>

<% 
if(j==3*i+2){
	 
	  break; }

}%>
</tr>
<% }%>
<%-- </c:forEach> --%>
</table>
<jsp:include page="nar/bottom.jsp"></jsp:include>
<script type="text/javascript" src="js/jquery.js"></script>
 <script type="text/javascript" src="js/bootstrap.js"></script> 
<script type="text/javascript">
/*预编译相当于onload, 但是比onload快   */
$(function(){
	
	//alert("");
	//得到每一行的所有的a 多样式的a
	$(".img").each(function(index){
		
		$(this).click(function(){
			
			///alert(index);
			// 图片名称  产品名称  价格  数量
			//$("img")==> 单个的图片连接  多个.img 0  1 2
			// $(".pname")==>a的样式，但是
			var imgsrc=$("img").attr("src");
			var pname=$(".pname").eq(index).text();
			var pnumber=$(".pnumber").eq(index).text();
			/* alert(imgsrc);
			alert(pname); */
			$(this).attr("href","product/showOneProduct.jsp?imgsrc="+imgsrc+"&pname="+pname+"&pnumber="+pnumber);
			
		});
		
		
	});
	
});





</script>


</body>
</html>