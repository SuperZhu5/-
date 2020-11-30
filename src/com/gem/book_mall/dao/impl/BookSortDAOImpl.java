package com.gem.book_mall.dao.impl;

import java.util.List;

import com.gem.book_mall.dao.BaseDAO;
import com.gem.book_mall.dao.BookSortDAO;
import com.gem.book_mall.dao.parse.BookSortIparseRs;
import com.gem.book_mall.dao.parse.BookSortsIparseRs;
import com.gem.book_mall.pojo.BookInfo;
import com.gem.book_mall.pojo.BookSort;
import com.gem.book_mall.util.IParseRs;

public class BookSortDAOImpl extends BaseDAO<BookInfo> implements BookSortDAO {
	IParseRs<BookInfo> parse = new BookSortIparseRs();
	@Override
	public List<BookInfo> getAllBookSort(int cid) {
		// TODO Auto-generated method stub
		String sql="select * from (SELECT * from b_classify where cid=?) t4 "
				+ "inner join  "
				+ "(SELECT t1.id,t1.b_name,t1.new_price,t1.old_price,t1.author,"
				+ "t1.detail,t1.b_id,t2.picture from (SELECT *from b_message) t1 "
				+ "inner join (SELECT *from book_img) t2 on t1.id=t2.id1) t3 "
				+ "on t4.cid=t3.b_id";
		return super.executeQuery(parse, sql,cid);
	}

}
