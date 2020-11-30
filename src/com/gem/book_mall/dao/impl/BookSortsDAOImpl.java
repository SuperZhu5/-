package com.gem.book_mall.dao.impl;

import java.util.List;

import com.gem.book_mall.dao.BaseDAO;
import com.gem.book_mall.dao.BookSortsDAO;
import com.gem.book_mall.dao.parse.BookSortsIparseRs;
import com.gem.book_mall.pojo.BookSort;
import com.gem.book_mall.util.IParseRs;

public class BookSortsDAOImpl extends BaseDAO<BookSort> implements BookSortsDAO {
	
	IParseRs<BookSort> parse = new BookSortsIparseRs();

	@Override
	public List<BookSort> getAllBookSortsById() {
		// TODO Auto-generated method stub
		String sql = "select * from b_classify";
		return super.executeQuery(parse, sql);
	}
	
}
