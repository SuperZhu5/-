package com.gem.book_mall.pojo;

public class BookSort {
	private int cid;
	private String type_name;

	public BookSort() {
		super();
	}

	public BookSort(int cid, String type_name) {
		super();
		this.cid = cid;
		this.type_name = type_name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	@Override
	public String toString() {
		return "SortBook [cid=" + cid + ", type_name=" + type_name + "]";
	}

}
