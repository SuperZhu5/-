package com.gem.book_mall.dao;

import java.util.List;

import com.gem.book_mall.pojo.BookInfo;

public interface BookSortDAO {
	List<BookInfo> getAllBookSort(int cid);
	
}
