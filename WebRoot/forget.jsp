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

<title>My JSP 'forget.jsp' starting page</title>

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
	// 保存用户不存在信息
	String str1="";
	String user_error=(String)request.getSession().getAttribute("msg_up_user_error");
	if(user_error!=null){
		str1=user_error;
	}
	
	// 保存密码不一致信息
	String str2="";
	String pwd_error = (String)request.getSession().getAttribute("msg_up_pwd_error");
	if(pwd_error!=null){
		str2=pwd_error;
	}
	
	// 保存更新失败信息
	String str3="";
	String update_error = (String)request.getSession().getAttribute("msg_update_error");
	if(update_error!=null){
		str3=update_error;
	}
 %>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<!-- Start Sign In Form -->
				<form action="ReSetPasswordServlet" class="fh5co-form animate-box"
					data-animate-effect="fadeInLeft" method="post">
					<h2>重置密码</h2>
					<!-- 保存用户更新失败信息  -->
					<label style="color: red;font-size: 20px;"><%=str3 %></label>
					<div class="form-group">
						<div class="alert alert-success" role="alert">你将修改如下信息</div>
					</div>
					<div class="form-group">
						<label for="email" class="sr-only">用户名</label>
						<!-- 保存用户不存在信息  -->
						<label style="color: red;font-size: 20px;"><%=str1 %></label>
						 <input type="text" class="form-control" id="email" 
							placeholder="username" autocomplete="off" name="uname">
					</div>
					<div class="form-group">
						<label for="email" class="sr-only">密码</label> 
						<!-- 保存密码不一致信息  -->
						<label style="color: red;font-size: 10px;"><%=str2 %></label>
						<input type="password" class="form-control" id="email" 
							placeholder="password" autocomplete="off" name="pwd1">
					</div>
					<div class="form-group">
						<label for="email" class="sr-only">密码</label> <input
							type="password" class="form-control" id="email" 
							placeholder="reset-password" autocomplete="off" name="pwd2">
					</div>
					<div class="form-group">
						<p>
							<a href="login.jsp">登录</a> or <a href="signup.jsp">注册</a>
						</p>
					</div>
					<div class="form-group">
						<input type="submit" value="修改" class="btn btn-primary">
					</div>
				</form>
				<!-- END Sign In Form -->


			</div>
		</div>

	</div>
</body>
</html>
