package com.gem.book_mall.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodeFilter implements Filter{
	private String encode="utf-8";//默编码
	private final String ENCODE_NAME="encode";//
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		//设置编码,硬编码   使用配置文件
		request.setCharacterEncoding(encode);
		chain.doFilter(request, response);//放行
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		//获取初始化参数
		String str=config.getInitParameter(ENCODE_NAME);
		if(str!=null&&!str.equals("")){//web.xml配置了编码
			encode=str;//encode赋值为从配置文件中读取到的值
		}
		
	}

}
