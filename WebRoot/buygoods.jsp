<%@page import="com.gem.book_mall.pojo.BookChart"%>
<%@page import="com.gem.book_mall.pojo.BookSort"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script type="text/javascript" src="js/shopping.js"></script>
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

.menu ul {
	margin-top: 0px;
	margin-bottom: 0px;
}

.menu ul li {
	margin-top: 5px;
}

.content{
	margin-left:10%;
	width: 80%;
	min-height: 500px;
	margin-bottom: 30px;
	margin-top: 30px;
}
.cartList ul li{
	list-style: none;
	float: left;
	padding-top: 10px;
	padding-left: 60px;
	font-size: small;
}
.cartList ul {
	width: 100%;
}
  .content_account{
            width: 80%;
            margin-left: 10%;
            height: 50px;
            font-size: 10px;
            color: #737373;
            text-align: center;
            border: 1px solid #D9D9D9;
            margin-bottom: 100px;
        }
        .content_account a{
            text-decoration: none;
            color: #737373;
        }
        .content_account_img{
            float: left;
            width: 3%;
            margin-top: 15px;
            margin-left: 20px;

        }
        .content_account_word{
            float: left;
            width: 6%;
            margin-top: 14px;
            font-size: 15px;
            /*margin-left: 7px;*/

        }
        .content_account_word1{
            width: 10%;
            height: 50px;
            font-size: 20px;
            margin-top: -1.5px;
            padding: 10px;
            background-color: #FF6A00;
            color: white;
            float: right;
        }
        .content_account_word2{
            float: right;
            width: 12%;
            margin-right: 10px;
            margin-top: 20px;
            font-size: 12px;
        }
        .content_account_word2 span{
            font-size: 20px;
            color: #ff6a00;
        }
        .div123{
        	border:1px solid black;
        	width: 80%;
        	min-height:100px;
        	height:300px;
            margin-left: 10%;
            margin-top: 30px;
        }
         .div123 ul{
        	float:left;
        	height: 30px;	
        }
        .div123 ul li{
        	float:left;
        	list-style: none;	
        	margin-left: 40px;
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
			<div class="div5"></div>
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
	<%
		String mes1 = "";
		String msg1 = (String)session.getAttribute("msg1");
		if(msg1!=null){
			mes1=msg1;
		}
	 %>
<div class="content">
	<span style="color: red;">
		<%=mes1 %>
	</span>
    <div class="cartList" id="zong">
        <ul style="height: 40px;">
            <li>商品图片</li>
            <li style="padding-left: 110px;">商品信息</li>
            <li style="padding-left: 110px;">单价</li>
            <li style="padding-left: 110px;">数量</li>
            <li style="padding-left: 110px;">总价</li>
            <li style="padding-left: 110px;">操作</li>
        </ul>
        <c:forEach items="${buylist }" var="list">
        <hr style="border:0.5px dashed gray;margin-top: -20px;">
        <ul style="height: 150px;">
            <li style="margin-left: -40px;">
            	<img alt="" src="${list.picture}" style="width: 100px;height: 120px;;">
            </li>
            <li style="padding-left: 100px;">${list.b_name}</li>
            <li style="padding-left: 100px;">
            	<span id="price12">${list.new_price}元 </span>
            </li>
            <li style="padding-left: 100px;">
            	<!-- <input type="button" name="minus" value="-" onclick="jian()">
            	<input type="text" name="amount" value="1" style="width: 50px; ">
            	<input type="button" name="plus" value="+" onclick="plus(0);"> -->
            	<input type="button" name="minus" value="-" onclick="jian()">
				<input type="text" name="amount" value="1" id="shang" style="width: 50px;">
				<input type="button" name="plus" value="+" onclick="jia()">
            </li>
            <li id="price0" style="padding-left: 70px;">
            	¥<input type="text" name="price" value="${list.new_price}" id="yiqian" style="width: 60px;">
            </li>
            <li style="padding-left: 80px;margin-top: -10px;">
	            <p onclick="collection();">移入收藏</p>
				<a href="DelBuyGoodsServlet?id=${list.id}" style="color: black;" onclick="del();">
					删除
				</a>	
            </li>
        </ul>
       </c:forEach>
        <hr style="border:0.5px dashed gray;margin-top: -20px;">
    </div>
</div>
	
	<div class="div123">
		<c:forEach items="${list_user}" var="ulist">
		<ul>
			<li>${ulist.username}</li>
			<li>${ulist.phone}</li>
			<li>${ulist.address}</li>
			<li>
				<a href="DelAddressServlet?id=${ulist.id}" style="color:white;" onclick="del();">
					<label style="border: 1px gray solid;background-color: gray">
						删除地址
					</label>
				</a>
				<a href="UseAddressServlet?id=${ulist.id}" style="color:gray;">使用该地址</a>
			</li>
		</ul>
		</c:forEach>
		
	</div>
	<div style="width: 80%;margin-left: 10%;">
	<div style=" width: 10%;margin-left: 10%;height: 50px;float: left;">
		<p style="border: 1px solid red;background-color: red;width: 200px;text-align: center;margin-top: 0px;">
			<a href="address.jsp" style="color: white;font-size: 30px;">
				新增地址
			</a>
		</p>
	</div>
	<div style=" width: 10%;height: 50px;float: right;margin-right: 30%;">
		<p style="border: 1px solid red;background-color: red;width: 200px;text-align: center;margin-top: 0px;">
			<a href="GetAllAddressServlet" style="color: white;font-size: 30px;">
				管理地址
			</a>
		</p>
	</div>
	</div>
	<hr style="border:0.5px dashed gray;width: 80%;margin-left: 10%;">
    <div class="content_account">
        <div class="content_account_img">
        	<img src="img/leftarrow.png" ></div>
        <div class="content_account_word">
        	<a href="index.jsp">继续挑选</a>
        </div>
        <div class="content_account_word1">
        	<a href="SumServlet" style="color:white;" onclick="msg1();">去结算</a>
        </div>
        <div class="content_account_word2">
        	<a href="SumServlet" style="color:gray;">应付金额</a>
        	:&nbsp;&nbsp;&nbsp;&nbsp;
        	<span style="color: red;">¥${sum}</span>
        </div>
    </div>

</body>
<script type="text/javascript">
	function del(){
		var msg = "您真的确定要删除吗？\n\n请确认！";
		if (confirm(msg)==true){
			return true;
		}else{
			return false;
		}
	}
	function msg1(){
		var msg = "您确定要结算吗？\n\n请确认！\n\n然后请到我的账户查看！";
		if (confirm(msg)==true){
			return true;
		}else{
			return false;
		}
	}
	var price = 0.00;
	var price1 = 0.00;
	
	function jian() {
		var p = parseInt(document.getElementById("price11").valueOf().value);
	    var i = parseInt(document.getElementById("shang").valueOf().value) - 1;
	    if (i <= 0) {
	        i = 0;
	    }
	    document.getElementById("shang").valueOf().value = i;
	    price1 = p * i;
	    document.getElementById("yiqian").value=suan(price1);
	    zong();
	}
	function jia() {
		var p = parseInt(document.getElementById("price11").valueOf().value);
	    var i = parseInt(document.getElementById("shang").valueOf().value) + 1;
	    document.getElementById("shang").valueOf().value = i;
	    price1 = p * i;
	    document.getElementById("yiqian").value=suan(price1);
	    zong();
	}
	
	function suan(number) {
	    price = price1 + price;
	    if (isNaN(number)) {
	        return false;
	    }
	    number = Math.round(number * 100) / 100;
	    var s = number.toString();
	    var rs = s.indexOf(".");
	    if (rs < 0) {
	        rs = s.length;
	        s += ".";
	    }
	    while (s.length <= rs + 2) {
	        s += "0";
	    }
	    return s;
	}
	function zong() {
	    price = price1 + price;
	    if (isNaN(price)) {
	        return false;
	    }
	    price = Math.round(price * 100) / 100;
	    var s = price.toString();
	    var rs = s.indexOf(".");
	    if (rs < 0) {
	        rs = s.length;
	        s += ".";
	    }
	    while (s.length <= rs + 2) {
	        s += "0";
	    }
	    document.getElementById("totalPrice").innerHTML=s;
	}
</script>
</html>
