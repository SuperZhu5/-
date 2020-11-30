<%@ page language="java" import="java.util.*,com.gem.book_mall.pojo.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mall1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<!-- <link rel="stylesheet" type="text/css" href="css/new.css"> -->
	<style type="text/css">
		.img1{
			width: 80px;
			height: 100px;
		}
		
	</style>

  </head>
  
  <body>
    <table style="width: 80%;margin-left: 10%;">
    	<tr >
    		<td style="width: 40px;">编号</td>
    		<td style="width: 51px;">书名</td>
    		<td style="width: 171px;">图片</td>
    		<td style="width: 135px; ">价格</td>
    		<td style="width: 33px; ">作者</td>
    		<td style="width: 271px; ">操作</td>
    	</tr>
    	<%  
    		List<BookInfo> book = (List<BookInfo>)request.getSession().getAttribute("list1");
    		for(int i=0;i<book.size();i++){
    		
    	%>
    	<tr>
    		<td><%=book.get(i).getId() %></td>
    		<td><%=book.get(i).getB_name() %></td>
    		<td><img src='<c:url value="<%=book.get(i).getPicture() %>"/>' class="img1"></td>
    		<td><%=book.get(i).getNew_price() %>元</td>
    		<td><%=book.get(i).getAuthor() %></td>
    		<td class="td1">
    			<span style="background-color: #F0F0F0">
	    			<a href="index.jsp" style="color:gray;">再买一本</a>
    			</span>
	    		<span style="background-color: #F08D00;margin-left: 20px;">
	    			<a href="BuyGoodsServlet" style="color:white;">去购车结算</a>
	    		</span>
    		</td>
    	</tr>
    	<% }%>
    </table>
  </body>
</html>
