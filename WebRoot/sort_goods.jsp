<%@page import="com.gem.book_mall.pojo.BookInfo"%>
<%@page import="com.gem.book_mall.dao.impl.BookInfoDAOImpl"%>
<%@page import="com.gem.book_mall.dao.BookInfoDAO"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/default.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<link rel="stylesheet" type="text/css" href="css/new.css" />
<script src="js/modernizr.custom.js"></script>
</head>

<body>
<%
	
	List<BookInfo> sort_books = (List<BookInfo>)request.getSession().getAttribute("sort_book");
 %>
	<div class="container" style="height: 770px;border:1px black solid;">
		<div class="main1"></div>
		<div class="main" style="margin-right:0px;float:right;border:1px blue solid;">
		
			<div id="cbp-vm" 
			class="cbp-vm-switcher cbp-vm-view-grid"
			>
					<!-- 循环打印每一条图书信息 -->
				<ul>
					<% for(int i=0;i<sort_books.size();i++){%>
					<li style="min-height: 320px;">
					<a class="cbp-vm-image" href="#">
						<!-- 循环打印出每一张图片 -->
						<img src='<c:url value="<%=sort_books.get(i).getPicture() %>"/>'>
					</a>
					<span class="cbp-vm-title"></span>
						<div class="cbp-vm-price">
							¥<%=sort_books.get(i).getNew_price() %>
							<span style="text-decoration:line-through;color:#c0c0c0;">
								¥<%=sort_books.get(i).getOld_price() %>
							</span>
						</div>
						<div class="cbp-vm-details">
							<%=sort_books.get(i).getAuthor() %>
						</div> 
						<a class="cbp-vm-icon cbp-vm-add" href="#">添加至购物车</a>
					</li>
					<% } %>
				</ul>
			</div>
		</div>
		<!-- /main -->
	</div>
	<!-- /container -->
	<script src="js/classie.js"></script>
	<script src="js/cbpViewModeSwitch.js"></script>
</body>
</html>
