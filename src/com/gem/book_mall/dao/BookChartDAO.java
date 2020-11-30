package com.gem.book_mall.dao;

import java.util.List;

import com.gem.book_mall.pojo.BookChart;

public interface BookChartDAO {
	boolean addBook(BookChart book);
	List<BookChart> getAllBuy();
	boolean delBook(int id);
}
