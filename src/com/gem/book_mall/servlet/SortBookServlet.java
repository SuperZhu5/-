package com.gem.book_mall.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.book_mall.dao.BookSortDAO;
import com.gem.book_mall.dao.impl.BookSortDAOImpl;
import com.gem.book_mall.pojo.BookInfo;

public class SortBookServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("sortid"));
		BookSortDAO bookSortsDAO = new BookSortDAOImpl();
		if(cid==0){
			// 说明没有选任何分类，直接到转到主页面
			request.getRequestDispatcher("index.jsp").forward(request, response);
			return ;
		}else {
			List<BookInfo> list_book = bookSortsDAO.getAllBookSort(cid);
			request.getSession().setAttribute("sort_book", list_book);
			request.getRequestDispatcher("sort_index.jsp").forward(request, response);
			return;
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
