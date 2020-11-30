package com.gem.book_mall.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodeFilter implements Filter{
	private String encode="utf-8";//Ĭ����
	private final String ENCODE_NAME="encode";//
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		//���ñ���,Ӳ����   ʹ�������ļ�
		request.setCharacterEncoding(encode);
		chain.doFilter(request, response);//����
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		//��ȡ��ʼ������
		String str=config.getInitParameter(ENCODE_NAME);
		if(str!=null&&!str.equals("")){//web.xml�����˱���
			encode=str;//encode��ֵΪ�������ļ��ж�ȡ����ֵ
		}
		
	}

}
