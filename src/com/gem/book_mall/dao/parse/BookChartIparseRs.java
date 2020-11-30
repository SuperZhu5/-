package com.gem.book_mall.dao.parse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gem.book_mall.pojo.BookChart;
import com.gem.book_mall.util.IParseRs;

public class BookChartIparseRs implements IParseRs<BookChart> {

	List<BookChart> list = new ArrayList<>();
	@Override
	public List<BookChart> parseRs(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()){
				int id= rs.getInt(1);
				String b_name = rs.getString(2);
				int new_price = rs.getInt(3);
				int old_price = rs.getInt(4);
				String author = rs.getString(5);
				String detail = rs.getString(6);
				String picture = rs.getString(7);
				BookChart book = new BookChart(id, b_name, new_price, old_price, author, detail, picture);
				list.add(book);
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
