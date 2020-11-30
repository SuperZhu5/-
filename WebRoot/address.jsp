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
	<div class="container">

		<div class="row">
			<div class="col-md-4">
				<!-- Start Sign In Form -->
				<form action="AddAdressServlet" class="fh5co-form animate-box"
					data-animate-effect="fadeInLeft" method="post">
					<label style="color: red;font-size: 20px;"></label>
					<h2>新增收获地址</h2>
					<div class="form-group1">
						<div class="alert alert-success" role="alert">你的信息将被保留！</div>
					</div>
					<div class="form-group1">
						<label for="name" class="sr-only">Name</label> 
						<label style="color: red;font-size: 10px;"></label>
						<input type="text" class="form-control" id="name" 
						placeholder="收货人姓名" autocomplete="off" name="add_name">
					</div>
					<div class="form-group1">
						<label for="email" class="sr-only">phone</label> 
						<input type="text" class="form-control" id="email" 
						placeholder="手机号" autocomplete="off" name="add_phone">
					</div>
					<div class="form-group">
						<label for="email" class="sr-only">address</label> 
						<input type="text" class="form-control" id="email" 
						placeholder="收货地址" autocomplete="off" name="add_address">
					</div>
					<div class="form-group">
						<p>
							已有收货地址? <a href="#">选择</a>
						</p>
					</div>
					<div class="form-group">
						<input type="submit" value="新增" class="btn btn-primary">
					</div>
				</form>
			</div>
		</div>

	</div>



</body>
</html>
