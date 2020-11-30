package com.gem.book_mall.biz.impl;

import java.util.List;

import com.gem.book_mall.biz.BookSortBiz;
import com.gem.book_mall.dao.BookInfoDAO;
import com.gem.book_mall.dao.BookSortDAO;
import com.gem.book_mall.dao.impl.BookInfoDAOImpl;
import com.gem.book_mall.dao.impl.BookSortDAOImpl;
import com.gem.book_mall.pojo.BookInfo;

public class BookSortBizImpl implements BookSortBiz {

	@Override
	public List<BookInfo> getAllBooks() {
		// TODO Auto-generated method stub
		BookInfoDAO bookInfoDAO = new BookInfoDAOImpl();
		BookSortDAO bookSortDAO = new BookSortDAOImpl();
		
		return null;
	}

}
