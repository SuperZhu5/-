package com.gem.book_mall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.gem.book_mall.util.DBInfo;
import com.gem.book_mall.util.IParseRs;


public class BaseDAO<T> {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	private Connection getConnection(){
		try {
			Class.forName(DBInfo.DRIVER);
			return DriverManager.getConnection(DBInfo.URL,DBInfo.USER,DBInfo.PWD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
				
	}
	private void close(Connection conn,PreparedStatement psmt,ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
			}
			if(psmt!=null){
				psmt.close();
			
			}
			if(conn!=null){
				conn.close();
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	protected boolean executeUpdate(String sql,Object... params){
		try {
			conn=getConnection();
			//准备statement
			psmt=conn.prepareStatement(sql);
			//设置参数
			setParams(params);
			//
			int count=psmt.executeUpdate();
			return count>0; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			close(conn, psmt, rs);
		}
		return false;
	}
	
	private void setParams(Object... params) throws SQLException{
		for(int i=0;i<params.length;i++){
			
			psmt.setObject(i+1, params[i]);
		}
	}
	
	
	protected List<T> executeQuery(IParseRs<T> parse,String sql,Object... params){
		//查询多个，返回集合
		try {
			conn=getConnection();
			psmt=conn.prepareStatement(sql);
			setParams(params);
			rs=psmt.executeQuery();
			//解析结果集,不知道具体查询出的信息，rs解析不固定
			//定义一个解析结果的接口
			return parse.parseRs(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(conn, psmt, rs);
		}
		return null;
	}
	
	protected T load(IParseRs<T> parse,String sql,Object... params){
		//查询一个对象
		List<T> list= executeQuery(parse, sql, params);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	
	protected Object executeComplexQuery(IParseRs<T> parse,String sql,Object... params){
		//调用时，外部确定按照什么pojo解析
				try {
					conn=getConnection();
					psmt=conn.prepareStatement(sql);
					setParams(params);
					rs=psmt.executeQuery();
					//解析结果集,不知道具体查询出的信息，rs解析不固定
					//定义一个解析结果的接口
					return parse.parseComplexRs(rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					close(conn, psmt, rs);
				}
				return null;
	}
	
	
}
