package com.gem.book_mall.dao.impl;

import com.gem.book_mall.dao.BaseDAO;
import com.gem.book_mall.dao.BookAddressDAO;
import com.gem.book_mall.dao.parse.BookAddressIParseRs;
import com.gem.book_mall.pojo.BookAddress;
import com.gem.book_mall.pojo.User;
import com.gem.book_mall.util.IParseRs;

public class BookAddressDAOImpl extends BaseDAO<BookAddress> implements BookAddressDAO {
	IParseRs<User> parse = new BookAddressIParseRs();

	@Override
	public boolean addAddress(User user) {
		// TODO Auto-generated method stub	
		String sql="insert into b_user values(0,?,null,null,?,?)";
		return super.executeUpdate(sql, user.getUsername(),user.getPhone(),user.getAddress());
	}
	

}
