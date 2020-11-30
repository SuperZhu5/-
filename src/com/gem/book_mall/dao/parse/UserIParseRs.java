package com.gem.book_mall.dao.parse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gem.book_mall.pojo.User;
import com.gem.book_mall.util.IParseRs;

public class UserIParseRs implements IParseRs<User> {

	List<User> list = new ArrayList<>();
	@Override
	public List<User> parseRs(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()){
				int id = rs.getInt(1);
				String username = rs.getString(2);
				String pwd = rs.getString(3);
				String sex = rs.getString(4);
				String phone = rs.getString(5);
				String address = rs.getString(6);
				User user = new User(id, username, pwd, sex, phone, address);
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
	public Object parseComplexRs(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

}
