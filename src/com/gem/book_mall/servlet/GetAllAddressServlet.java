package com.gem.book_mall.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.book_mall.dao.UserDAO;
import com.gem.book_mall.dao.impl.UserDAOImpl;
import com.gem.book_mall.pojo.User;

public class GetAllAddressServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDAO userDAO = new UserDAOImpl();
		List<User> list_user = userDAO.getAllUser();
		
		if(list_user!=null){
			request.getSession().setAttribute("list_user", list_user);
			request.getRequestDispatcher("buygoods.jsp").forward(request, response);
			return;
		}else{
			request.getRequestDispatcher("buygoods.jsp").forward(request, response);
			return;
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
