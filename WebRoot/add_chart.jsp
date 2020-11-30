<%@page import="com.gem.book_mall.pojo.BookSort"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/head.css">
<!-- 轮播图样式 -->
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/htmleaf-demo1.css">
<link rel="stylesheet" href="css/slider.css">
<!-- 底部样式 -->
<link rel="stylesheet" type="text/css" href="css/foot.css">
<style type="text/css">
.container {
	/* max-width: 1024px; */
	width: 100%;
	margin: 0 auto;
	padding: 0px;
	font-size: 14px;
}

.preview {
	text-align: center;
	padding: 5px;
}

.preview a {
	display: inline-block;
	margin: 5px;
}

.preview img {
	display: block;
	width: 100%;
	height: auto;
}

.active {
	outline: 3px solid #196cd2;
	box-shadow: 2px 2px 20px 4px rgba(0, 0, 0, .5);
}
.menu ul{
	margin-top: 0px;
	margin-bottom: 0px;
}
.menu ul li{
	margin-top: 5px;
}
.div11{
	min-height: 100px;
	margin-top: 40px;
}
</style>
</head>

<body>
	<div class="head">
		<div class="menu">
			<ul>
				<li>
					<div class="div3" style="border:0px;">
						<img src="img/head.png" style="height: 20px; width: 20px; ">
					</div>
					<div class="div2">
						<a href="orderbooks.jsp"><span>我的账户</span></a>
					</div>
				</li>
				<li>
					<div class="div3">
						<img src="img/11.png" style="height: 20px; width: 20px; ">
					</div>
					<div class="div2">
						<a href="BuyGoodsServlet"><span>我的购物车</span></a>
					</div>
				</li>
				<li>
					<div class="div3">
						<img src="img/22.png" style="height: 20px; width: 20px;">
					</div>
					<div class="div2">
						<a href="#"><span>我的收藏</span></a>
					</div>
				</li>
				<li>
					<div class="div3">
						<img src="img/head.png" style="height: 20px; width: 20px; ">
					</div>
					<div class="div2">
						<a href="signup.jsp"><span>注册</span></a>
						<a href="login.jsp"><span>登录</span></a>
					</div>
				</li>
				<li>
					<div class="div3">
						<img src="img/head.png" style="height: 20px; width: 20px; ">
					</div>
					<div class="div2">
						欢迎：&nbsp;&nbsp;<span>${user.username}</span>&nbsp;&nbsp;回来
					</div>
				</li>
			</ul>
		</div>
		<div class="head2" style="border:0px;">
			<div class="div4">
				<img src="img/timg.jpg" style="height: 94px; width: 538px; ">
			</div>
			<div class="div5">
			
			</div>
		</div>
	</div>
	<!-- 分类信息 -->
	<%
		List<BookSort> list = (List<BookSort>)request.getSession().getAttribute("book_sort");
	 %>
	<div class="htmleaf-container">
		<nav>
		<ul id="main" style=" width: 1200px;">
			<li><a href="index.jsp">网站主页</a></li>
			<li>书籍分类
				<ul class="drop" style="width: 400px;">
					<div>
						<li>
						<span class="span1">
							<a href="SortBookServlet?sortid=1" class="a1">
								儿童/育儿
							</a>
						</span>
						<br>&nbsp;&nbsp;&nbsp;&nbsp;
						<span class="span2">
							<a href="#" class="a1">儿童文学</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">绘本</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">启蒙书</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">科普读物</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">启蒙认知</a>
						</span>
						</li>
						
						<li>
						<span class="span1">
							<a href="SortBookServlet?sortid=2" class="a1" >
								考试/教辅
							</a>
						</span>
						<br>&nbsp;&nbsp;&nbsp;&nbsp;
						<span class="span2">
							<a href="#" class="a1">考研</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">公务员</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">外语考试</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">中小学教辅</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">外文读物</a>
						</span>
						</li>
						<li>
						<span class="span1">
							<a href="SortBookServlet?sortid=3" class="a1">
								生活/社科
							</a>
						</span>
						<br>&nbsp;&nbsp;&nbsp;&nbsp;
						<span class="span2">
							<a href="#" class="a1">美容</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">境外游</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">两性情感</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">居家</a>
						</span>
						<span class="span2">
							<a href="#" class="a1">社科</a>
						</span>
						</li>
						
					</div>
				</ul>
			</li>
			<li>关于我们</li>
			<li>联系我们</li>
		</ul>
		</nav>
	</div>
	<div class="div11">
		<jsp:include page="mall1.jsp"></jsp:include>
	</div>

</body>
</html>
