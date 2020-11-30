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

public class SumServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookChartDAO bookChartDAO = new BookChartDAOImpl();
		List<BookChart> list = bookChartDAO.getAllBuy();
		int sum=0;
		if(list!=null){
			for(int i=0;i<list.size();i++){
				sum+=list.get(i).getNew_price();
			}
			request.getSession().setAttribute("sum", sum);
			response.sendRedirect("buygoods.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
