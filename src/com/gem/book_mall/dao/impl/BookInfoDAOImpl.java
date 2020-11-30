package com.gem.book_mall.dao.impl;

import java.util.List;

import com.gem.book_mall.dao.BaseDAO;
import com.gem.book_mall.dao.BookInfoDAO;
import com.gem.book_mall.dao.parse.BookInfoIParseRs;
import com.gem.book_mall.pojo.BookInfo;
import com.gem.book_mall.util.IParseRs;

public class BookInfoDAOImpl extends BaseDAO<BookInfo> implements BookInfoDAO {
	
	IParseRs<BookInfo> parse = new BookInfoIParseRs();
	@Override
	public List<BookInfo> getAllBook() {
		// TODO Auto-generated method stub
		String sql = "SELECT t1.id,t1.b_name,t1.new_price,"
				+ "t1.old_price,t1.author,t1.detail,t1.b_id,t2.picture from "
				+ "(SELECT *from b_message) t1 inner join "
				+ "(SELECT *from book_img) t2 on t1.id=t2.id1";
		return super.executeQuery(parse, sql);
	}
	@Override
	public List<BookInfo> getAllBooksById(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT t1.id,t1.b_name,t1.new_price,"
				+ "t1.old_price,t1.author,t1.detail,t1.b_id,t2.picture from "
				+ "(SELECT *from b_message where id=?) t1 inner join "
				+ "(SELECT *from book_img) t2 on t1.id=t2.id1";
		return super.executeQuery(parse, sql, id);
	}
	
}
