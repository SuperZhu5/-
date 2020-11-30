package com.gem.book_mall.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.book_mall.dao.BookChartDAO;
import com.gem.book_mall.dao.BookInfoDAO;
import com.gem.book_mall.dao.impl.BookChartDAOImpl;
import com.gem.book_mall.dao.impl.BookInfoDAOImpl;
import com.gem.book_mall.pojo.BookChart;
import com.gem.book_mall.pojo.BookInfo;

public class AddGoodsServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		BookInfoDAO bookInfoDAO = new BookInfoDAOImpl();
		List<BookInfo> list1 = bookInfoDAO.getAllBooksById(id);
		BookChartDAO bookChartDAO = new BookChartDAOImpl();
		BookChart book = new BookChart(0, list1.get(0).getB_name(), list1.get(0).getNew_price(), 
				list1.get(0).getOld_price(), list1.get(0).getAuthor(), list1.get(0).getDetail(), list1.get(0).getPicture());
		boolean flag = bookChartDAO.addBook(book);
		if(flag){
			request.getSession().setAttribute("list1", list1);
			request.getRequestDispatcher("add_chart.jsp").forward(request, response);
			return;
		}			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
