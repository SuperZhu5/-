package com.gem.book_mall.util;

import java.sql.ResultSet;
import java.util.List;

public interface IParseRs<T> {
	
	List<T> parseRs(ResultSet rs);
	
	Object parseComplexRs(ResultSet rs);
}
