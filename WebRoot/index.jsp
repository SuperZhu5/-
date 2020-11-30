<%@page import="com.gem.book_mall.pojo.BookSort"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
	<div class="htmleaf-container">
		<nav>
		<ul id="main" style=" width: 1200px;">
			<li><a href="index.jsp">网站主页</a></li>
			<li>书籍分类
				<ul class="drop" style="width: 400px;">
					<div>
						<li>						
						<span class="span1">
							<a href="SortBookServlet?sortid=1" class="a1" >
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
							<a href="SortBookServlet?sortid=3" class="a1" >
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
			<div id="marker"></div>
		</ul>
		</nav>
	</div>
	<div class="htmleaf-container" style="background-color: white;">
		<div class="container" style="padding-bottom: 0px;padding-top: 0px;">
			<div class="slider-container">
				<div class="slider">
					<div class="slider__item">
						<img src="images/1.jpg" alt="" style="height: 300px;"> <span
							class="slider__caption">勇敢坚毅真正之才智乃刚毅之志向。 —— 拿破仑</a>
						</span>
					</div>
					<div class="slider__item">
						<img src="images/2.jpg" alt="" style="height: 300px;"> <span
							class="slider__caption">志向不过是记忆的奴隶，生气勃勃地降生，但却很难成长。 —— 莎士比亚</span>
					</div>
					<div class="slider__item">
						<img src="images/3.jpg" alt="" style="height: 300px;"> <span
							class="slider__caption">人所缺乏的不是才干而是志向，不是成功的能力而是勤劳的意志。 —— 部尔卫</span>
					</div>
				</div>
				<div class="slider__switch slider__switch--prev"
					data-ikslider-dir="prev">
					<span><svg xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 20 20">
						<path
							d="M13.89 17.418c.27.272.27.71 0 .98s-.7.27-.968 0l-7.83-7.91c-.268-.27-.268-.706 0-.978l7.83-7.908c.268-.27.7-.27.97 0s.267.71 0 .98L6.75 10l7.14 7.418z" /></svg></span>
				</div>
				<div class="slider__switch slider__switch--next"
					data-ikslider-dir="next">
					<span><svg xmlns="http://www.w3.org/2000/svg"
							viewBox="0 0 20 20">
						<path
							d="M13.25 10L6.11 2.58c-.27-.27-.27-.707 0-.98.267-.27.7-.27.968 0l7.83 7.91c.268.27.268.708 0 .978l-7.83 7.908c-.268.27-.7.27-.97 0s-.267-.707 0-.98L13.25 10z" /></svg></span>
				</div>
			</div>

		</div>
	</div>
	<!-- <div style="width: 90%;height: 500px;border: 1px black solid;">
		<iframe src="mall.jsp" name="mall_frame" width="100%" height="100%" frameborder="no">mall.jsp</iframe>
	</div>  -->
	<div>
		<jsp:include page="mall.jsp"></jsp:include>
	</div>
	<script src="http://cdn.bootcss.com/jquery/1.11.0/jquery.min.js" 
		type="text/javascript">
	</script>
	<script>
		window.jQuery
				|| document
						.write('<script src="js/jquery-1.11.0.min.js"><\/script>')
	</script>
	<script src="js/slider.js"></script>
	<script type="text/javascript">
		$(".slider-container").ikSlider({
			speed : 500
		});
		$(".slider-container").on('changeSlide.ikSlider', function(evt) {
			console.log(evt.currentSlide);
		});
	</script>
	<script type="text/javascript">
		var $preview = $('.preview a');

		function changeActivePreview(i) {
			$('.active').removeClass('active');
			$preview.eq(i).addClass('active');
		}

		$preview.on('click', function(e) {
			e.preventDefault();
			var index = $(this).index();
			$('.slider-container').ikSlider(index);
		});

		$('.slider-container').on('changeSlide.ikSlider', function(e) {
			changeActivePreview(e.currentSlide);
		});

		changeActivePreview(0)
	</script>
</body>
</html>
