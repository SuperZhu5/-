package com.gem.book_mall.pojo;

public class BookAddress {
	private int id;
	
	private int uid;
	private int chartid;

	public BookAddress() {
		super();
	}

	public BookAddress(int id, int uid, int chartid) {
		super();
		this.id = id;
		this.uid = uid;
		this.chartid = chartid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getChartid() {
		return chartid;
	}

	public void setChartid(int chartid) {
		this.chartid = chartid;
	}

	@Override
	public String toString() {
		return "BookAddress [id=" + id + ", uid=" + uid + ", chartid="
				+ chartid + "]";
	}
	
}
