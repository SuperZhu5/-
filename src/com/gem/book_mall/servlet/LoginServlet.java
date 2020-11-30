package com.gem.book_mall.servlet;

import java.io.IOException;
import java.net.HttpCookie;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.book_mall.dao.UserDAO;
import com.gem.book_mall.dao.impl.UserDAOImpl;
import com.gem.book_mall.pojo.User;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		UserDAO userDAO = new UserDAOImpl();
		User user = userDAO.getUser(username, pwd);
		if (user != null && !user.equals("")) {
			request.getSession().setAttribute("user", user);
			// ����һ��cookie������ƶ�ֵ
			Cookie nameCookie = new Cookie("username", URLEncoder.encode(username, "utf-8"));
			Cookie pwdCookie = new Cookie("pwd", URLEncoder.encode(pwd, "utf-8"));
			
			// ����Cookie����Ч·�����ƶ���ǰĿ¼��
			nameCookie.setPath(request.getContextPath() + "/");
			pwdCookie.setPath(request.getContextPath() + "/");
			
			// ��ȡҳ�渴ѡ���ֵ(�����ж�)
			String rememberMe = request.getParameter("rememberMe");
			
			// ����ѡ�е������ ����Cookie����Чʱ�䣨1�죩
			if (rememberMe != null && rememberMe.equals("1")) {
				nameCookie.setMaxAge(24 * 60 * 60);
				pwdCookie.setMaxAge(24 * 60 * 60);
			}

			// ����û��ѡ�е����
			else {
				nameCookie.setMaxAge(0);
				pwdCookie.setMaxAge(0);
			}
			
			//��Cookie��ŵ�response��
			response.addCookie(nameCookie);
			response.addCookie(pwdCookie);

			response.sendRedirect("index.jsp");
		} else {
			// �����˺�����ƥ�������Ϣ
			request.getSession().setAttribute("msg", "����˺Ż�������������µ�¼��");
			response.sendRedirect("login.jsp");
		}
	}

}
