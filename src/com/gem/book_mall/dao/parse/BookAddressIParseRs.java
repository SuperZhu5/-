package com.gem.book_mall.dao.parse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gem.book_mall.pojo.User;
import com.gem.book_mall.util.IParseRs;

public class BookAddressIParseRs implements IParseRs<User> {

	List<User> list = new ArrayList<>();
	@Override
	public Object parseComplexRs(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()){
				String username = rs.getString(1);
				String phone = rs.getString(2);
				String address = rs.getString(3);
				User user = new User(0, username, phone, address);
				list.add(user);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> parseRs(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}


}
