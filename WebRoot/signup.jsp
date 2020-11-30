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
<title>My JSP 'signup.jsp' starting page</title>

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
	String str="";
	String msg_name = (String)request.getSession().getAttribute("msg_sign_name");
	if(msg_name!=null){
		str=msg_name;
	}
 %>
 <%
	String str1="";
	String msg_error = (String)request.getSession().getAttribute("msg_sign_error");
	if(msg_error!=null){
		str1=msg_error;
	}
 %>
	<div class="container">

		<div class="row">
			<div class="col-md-4">
				<!-- Start Sign In Form -->
				<form action="SignUpServlet" class="fh5co-form animate-box"
					data-animate-effect="fadeInLeft" method="post">
					<label style="color: red;font-size: 20px;"><%=str1 %></label>
					<h2>注册</h2>
					<div class="form-group1">
						<div class="alert alert-success" role="alert">你的信息将被保留！</div>
					</div>
					<div class="form-group1">
						<label for="name" class="sr-only">Name</label> 
						<label style="color: red;font-size: 10px;"><%=str %></label>
						<input type="text" class="form-control" id="name" 
						placeholder="Name" autocomplete="off" name="sign_name">
					</div>
					<div class="form-group">
						<label for="password" class="sr-only">Password</label> 
						<input type="password" class="form-control" id="password"
							placeholder="Password" autocomplete="off" name="sign_pwd">
					</div>
					<!-- <div class="form-group">
						<label for="re-password" class="sr-only">Re-type Password</label>
						<input type="password" class="form-control" id="re-password"
							placeholder="Re-type Password" autocomplete="off">
					</div> -->
					<div class="form-group1">
						<label for="remember"> 
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="radio" id="remember" name="sign_sex">男
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="radio" id="remember" name="sign_sex">女
						</label>
					</div>
					<div class="form-group1">
						<label for="email" class="sr-only">phone</label> 
						<input type="text" class="form-control" id="email" 
						placeholder="Phone" autocomplete="off" name="sign_phone">
					</div>
					<div class="form-group">
						<label for="email" class="sr-only">address</label> 
						<input type="text" class="form-control" id="email" 
						placeholder="Address" autocomplete="off" name="sign_address">
					</div>
					<div class="form-group">
						<p>
							已经注册? <a href="login.jsp">登录</a>
						</p>
					</div>
					<div class="form-group">
						<input type="submit" value="注册" class="btn btn-primary">
					</div>
				</form>
				<!-- END Sign In Form -->


			</div>
		</div>

	</div>



</body>
</html>
