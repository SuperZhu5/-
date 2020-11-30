package com.gem.book_mall.dao.impl;

import java.util.List;

import com.gem.book_mall.dao.BaseDAO;
import com.gem.book_mall.dao.BookChartDAO;
import com.gem.book_mall.dao.parse.BookChartIparseRs;
import com.gem.book_mall.pojo.BookChart;
import com.gem.book_mall.util.IParseRs;

public class BookChartDAOImpl extends BaseDAO<BookChart> implements BookChartDAO {
	
	IParseRs<BookChart> parse = new BookChartIparseRs();
	@Override
	public boolean addBook(BookChart book) {
		// TODO Auto-generated method stub
		String sql = "insert into b_chart VALUES(0,?,?,?,?,?,?)";
		return super.executeUpdate(sql, book.getB_name(),book.getNew_price(),book.getOld_price(),book.getAuthor(),book.getDetail(),book.getPicture());
	}
	@Override
	public List<BookChart> getAllBuy() {
		// TODO Auto-generated method stub
		String sql = "select * from b_chart";
		return super.executeQuery(parse, sql);
	}
	@Override
	public boolean delBook(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from b_chart where id=?";
		return super.executeUpdate(sql, id);
	}

}
