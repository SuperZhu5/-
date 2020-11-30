package com.gem.book_mall.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.book_mall.dao.BookChartDAO;
import com.gem.book_mall.dao.impl.BookChartDAOImpl;
import com.gem.book_mall.pojo.BookChart;

public class BuyGoodsServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookChartDAO bookChartDAO = new BookChartDAOImpl();
		List<BookChart> buylist = bookChartDAO.getAllBuy();
		System.out.println();
		if(buylist!=null&&buylist.size()>0){
			request.getSession().setAttribute("buylist", buylist);
			response.sendRedirect("buygoods.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
