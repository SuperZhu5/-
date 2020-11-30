package com.gem.book_mall.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.book_mall.dao.UserDAO;
import com.gem.book_mall.dao.impl.UserDAOImpl;
import com.gem.book_mall.pojo.User;

public class ReSetPasswordServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		String pwd1 = request.getParameter("pwd1");
		String pwd2 = request.getParameter("pwd2");
		UserDAO userDAO = new UserDAOImpl();
		User user1 = userDAO.getUserByUsername(username);
		if(user1!=null){
			// 用户存在
			if(pwd1.equals(pwd2)){
				// 两次输入的密码一致
				// 更新用户信息
				User user2 = new User(0, username, pwd2);
				boolean flag = userDAO.updateUser(user2);
				// 更新成功
				if(flag){
					// 保存更新成功信息
					request.getSession().setAttribute("msg_update_suc", "更新成功，请登录！");
					// 重定向到登录页面
					response.sendRedirect("login.jsp");
					return ;
				}else {
					// 保存更新失败信息
					request.getSession().setAttribute("msg_update_error", "更新失败，请再次更新！");
					// 重定向到更新页面
					response.sendRedirect("forget.jsp");
				}
				return;
			}else{
				// 保存密码不一致信息
				request.getSession().setAttribute("msg_up_pwd_error", "两次密码不一致，请重新输入！");
				// 重定向到更新页面
				response.sendRedirect("forget.jsp");
			}
		}else{
			// 用户不存在
			// 保存用户不存在信息
			request.getSession().setAttribute("msg_up_user_error", "用户不存在，请重新输入！");
			// 重定向到更新页面
			response.sendRedirect("forget.jsp");
		}
	}

}
