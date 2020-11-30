package com.gem.book_mall.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.book_mall.dao.UserDAO;
import com.gem.book_mall.dao.impl.UserDAOImpl;
import com.gem.book_mall.pojo.User;

public class SignUpServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("sign_name");
		String pwd = request.getParameter("sign_pwd");
		String sex = request.getParameter("sign_sex");
		String phone = request.getParameter("sign_phone");
		String address = request.getParameter("sign_address");
		UserDAO userDAO = new UserDAOImpl();
		User user1 = userDAO.getUserByUsername(username);
		// 说明用户不存在，可以进行注册
		if(user1==null){
			User user2 = new User(0, username, pwd, sex, phone, address);
			boolean flag = userDAO.addUser(user2);
			// 为true 说明注册成功
			if(flag){
				// 保存注册成功信息
				request.getSession().setAttribute("msg_sign_up", "恭喜，注册成功");
				// 重定向到登录页面
				response.sendRedirect("login.jsp");
			}else {
				// 保存失败信息
				request.getSession().setAttribute("msg_sign_error", "注册失败，请重新注册！");
				response.sendRedirect("signup.jsp");
			}
		}else{
			// 说明用户已经存在
			request.getSession().setAttribute("msg_sign_name", "用户已经存在，请重新注册！");
			response.sendRedirect("signup.jsp");
		}
		
	}

}
