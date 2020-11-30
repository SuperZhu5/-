package com.gem.book_mall.dao.parse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gem.book_mall.pojo.BookInfo;
import com.gem.book_mall.pojo.BookSort;
import com.gem.book_mall.util.IParseRs;

public class BookSortsIparseRs implements IParseRs<BookSort> {

	List<BookSort> list = new ArrayList<>();
	@Override
	public List<BookSort> parseRs(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()){
				int cid = rs.getInt(1);
				String type_name = rs.getString(2);
				BookSort bookSort = new BookSort(cid, type_name);
				list.add(bookSort);
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
