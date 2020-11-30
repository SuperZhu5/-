package com.gem.book_mall.dao;

import java.util.List;

import com.gem.book_mall.pojo.User;

public interface UserDAO {
	User getUser(String username,String pwd);
	List<User> getAllUser();
	User getUserByUsername(String username);
	List<User> getUserById(int id);
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean delUser(int id);
}
