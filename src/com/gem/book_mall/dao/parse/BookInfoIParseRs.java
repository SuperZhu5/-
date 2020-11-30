package com.gem.book_mall.dao.parse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gem.book_mall.pojo.BookInfo;
import com.gem.book_mall.util.IParseRs;

public class BookInfoIParseRs implements IParseRs<BookInfo> {

	List<BookInfo> list = new ArrayList<>();
	@Override
	public List<BookInfo> parseRs(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()){
				int id= rs.getInt(1);
				String b_name = rs.getString(2);
				int new_price = rs.getInt(3);
				int old_price = rs.getInt(4);
				String author = rs.getString(5);
				String detail = rs.getString(6);
				int b_id = rs.getInt(7);
				String picture = rs.getString(8);
				BookInfo bookInfo = new BookInfo(id, b_name, new_price, old_price, author, detail,b_id,picture);
				list.add(bookInfo);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Object parseComplexRs(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

}
