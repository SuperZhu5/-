package com.gem.book_mall.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.book_mall.dao.BookChartDAO;
import com.gem.book_mall.dao.impl.BookChartDAOImpl;

public class DelBuyGoodsServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		BookChartDAO bookChartDAO = new BookChartDAOImpl();
		boolean flag = bookChartDAO.delBook(id);
		System.out.println(flag);
		if(flag){
			request.getSession().setAttribute("msg", "ɾ���ɹ�");
			response.sendRedirect("BuyGoodsServlet");
		}else {
			request.getSession().setAttribute("msg1", "ɾ��ʧ�ܣ������²�����");
			response.sendRedirect("buygoods.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
