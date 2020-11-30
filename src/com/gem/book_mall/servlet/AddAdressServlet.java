package com.gem.book_mall.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.book_mall.dao.BookAddressDAO;
import com.gem.book_mall.dao.impl.BookAddressDAOImpl;
import com.gem.book_mall.pojo.User;

public class AddAdressServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("add_name");
		String phone = request.getParameter("add_phone");
		String address = request.getParameter("add_address");
		BookAddressDAO bookAddressDAO = new BookAddressDAOImpl();
		User user = new User(0, username, phone, address);
		boolean flag = bookAddressDAO.addAddress(user);
		if(flag){
			response.sendRedirect("GetAllAddressServlet");
		}
	}

}
