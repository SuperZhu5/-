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
		// ˵���û������ڣ����Խ���ע��
		if(user1==null){
			User user2 = new User(0, username, pwd, sex, phone, address);
			boolean flag = userDAO.addUser(user2);
			// Ϊtrue ˵��ע��ɹ�
			if(flag){
				// ����ע��ɹ���Ϣ
				request.getSession().setAttribute("msg_sign_up", "��ϲ��ע��ɹ�");
				// �ض��򵽵�¼ҳ��
				response.sendRedirect("login.jsp");
			}else {
				// ����ʧ����Ϣ
				request.getSession().setAttribute("msg_sign_error", "ע��ʧ�ܣ�������ע�ᣡ");
				response.sendRedirect("signup.jsp");
			}
		}else{
			// ˵���û��Ѿ�����
			request.getSession().setAttribute("msg_sign_name", "�û��Ѿ����ڣ�������ע�ᣡ");
			response.sendRedirect("signup.jsp");
		}
		
	}

}
