<%@page import="java.net.URLDecoder"%>
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

<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/style1.css">


</head>

<body class="style-2">
<%
	// 保存账号密码匹配错误信息
	String str="";
	String message = (String)request.getSession().getAttribute("msg");
	if(message!=null){
		str=message;
	}
 %>
 <%
/*
读取名为uname的Cookie!
如果为空显示：""
如果不为空显示：Cookie的值
*/
String username = "";
String pwd = "";
String checked = "";
Cookie [] cookies = request.getCookies(); 
for (int i = 0; i < cookies.length; i++) {//对cookies中的数据进行遍历，找到用户名、密码的数据
        if ("username".equals(cookies[i].getName())) {
             username = cookies[i].getValue();
        } else if ("pwd".equals(cookies[i].getName())) {
             pwd = cookies[i].getValue();
         }
     }
%>
<%
	// 保存注册成功信息
	String success="";
	String mes = (String)request.getSession().getAttribute("msg_sign_up");
	if(mes!=null){
		success=mes;
	}
	
	// 保存密码更新成功信息
	String str1="";
	String update_suc = (String)request.getSession().getAttribute("msg_update_suc");
	if(update_suc!=null){
		str1=update_suc;
	}
 %>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
			
				<!-- Start Sign In Form -->
				<form action="LoginServlet" class="fh5co-form animate-box"
					data-animate-effect="fadeInLeft" method="post">
					
					<!-- 保存注册成功信息 -->
					<span style="color:red;font-size: 15px"><%=success %></span>
					<!-- 保存密码更新成功信息 -->
					<span style="color:red;font-size: 15px"><%=str1 %></span>
					<h2>登录</h2>
					<!-- 保存账号密码匹配错误信息 -->
					<span style="color:red;font-size: 15px"><%=str %></span>
					
					<div class="form-group">
						<label for="username" class="sr-only">Username</label> <input
							type="text" class="form-control" id="username" name="uname"
							placeholder="Username" autocomplete="off" value="<%=URLDecoder.decode(username, "utf-8") %>"/>
					</div>
					
					<div class="form-group">
					<!-- autocomplete="off" 是第二次输入时第一次将会清空 -->
						<label for="password" class="sr-only">Password</label> <input
							type="password" class="form-control" id="password" name="pwd"
							placeholder="Password" autocomplete="off" value="<%=URLDecoder.decode(pwd, "utf-8") %>"/>
					</div>
					
					<div class="form-group">
						<label for="remember"> <input type="checkbox"
							id="remember" name="rememberMe"value="1"> 记住我
						</label>
					</div>
					
					<div class="form-group">
						<p>
							没有注册? <a href="signup.jsp">注册</a> | <a href="forget.jsp">忘记密码?</a>
						</p>
					</div>
					
					<div class="form-group">
						<input type="submit" value="登录" class="btn btn-primary">
					</div>
				</form>
				<!-- END Sign In Form -->

			</div>
		</div>
	</div>
</body>
</html>
