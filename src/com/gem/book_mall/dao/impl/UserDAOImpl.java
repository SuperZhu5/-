package com.gem.book_mall.dao.impl;

import java.util.List;

import com.gem.book_mall.dao.BaseDAO;
import com.gem.book_mall.dao.UserDAO;
import com.gem.book_mall.dao.parse.BookAddressIParseRs;
import com.gem.book_mall.dao.parse.UserIParseRs;
import com.gem.book_mall.pojo.User;

public class UserDAOImpl extends BaseDAO<User> implements UserDAO {
	UserIParseRs parse = new UserIParseRs();
	BookAddressIParseRs parse1 = new BookAddressIParseRs();

	@Override
	public User getUser(String username, String pwd) {
		// TODO Auto-generated method stub
		String sql = "select * from b_user where username=? and pwd=?";
		return super.load(parse, sql, username, pwd);
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		String sql = "select * from b_user where username=?";
		return super.load(parse, sql, username);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into b_user values(0,?,?,?,?,?)";
		return super.executeUpdate(sql, user.getUsername(), user.getPwd(),
				user.getSex(), user.getPhone(), user.getAddress());
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		String sql = "update b_user set pwd=? where username=?";
		return super.executeUpdate(sql, user.getPwd(), user.getUsername());
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		String sql = "select * from b_user ";
		return super.executeQuery(parse, sql);
	}

	@Override
	public boolean delUser(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from b_user where id=? ";
		return super.executeUpdate(sql, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserById(int id) {
		// TODO Auto-generated method stub
		String sql="SELECT * from b_user where id=?";
		return super.executeQuery(parse, sql, id);
	}

}
