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
			// �û�����
			if(pwd1.equals(pwd2)){
				// �������������һ��
				// �����û���Ϣ
				User user2 = new User(0, username, pwd2);
				boolean flag = userDAO.updateUser(user2);
				// ���³ɹ�
				if(flag){
					// ������³ɹ���Ϣ
					request.getSession().setAttribute("msg_update_suc", "���³ɹ������¼��");
					// �ض��򵽵�¼ҳ��
					response.sendRedirect("login.jsp");
					return ;
				}else {
					// �������ʧ����Ϣ
					request.getSession().setAttribute("msg_update_error", "����ʧ�ܣ����ٴθ��£�");
					// �ض��򵽸���ҳ��
					response.sendRedirect("forget.jsp");
				}
				return;
			}else{
				// �������벻һ����Ϣ
				request.getSession().setAttribute("msg_up_pwd_error", "�������벻һ�£����������룡");
				// �ض��򵽸���ҳ��
				response.sendRedirect("forget.jsp");
			}
		}else{
			// �û�������
			// �����û���������Ϣ
			request.getSession().setAttribute("msg_up_user_error", "�û������ڣ����������룡");
			// �ض��򵽸���ҳ��
			response.sendRedirect("forget.jsp");
		}
	}

}
