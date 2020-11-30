package com.gem.book_mall.pojo;

public class BookChart {
	private int id;
	private String b_name;
	private int new_price;
	private int old_price;
	private String author;
	private String detail;
	private String picture;

	public BookChart() {
		super();
	}

	public BookChart(int id, String b_name, int new_price, int old_price,
			String author, String detail, String picture) {
		super();
		this.id = id;
		this.b_name = b_name;
		this.new_price = new_price;
		this.old_price = old_price;
		this.author = author;
		this.detail = detail;
		this.picture = picture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public int getNew_price() {
		return new_price;
	}

	public void setNew_price(int new_price) {
		this.new_price = new_price;
	}

	public int getOld_price() {
		return old_price;
	}

	public void setOld_price(int old_price) {
		this.old_price = old_price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "BookChart [id=" + id + ", b_name=" + b_name + ", new_price="
				+ new_price + ", old_price=" + old_price + ", author=" + author
				+ ", detail=" + detail + ", picture=" + picture + "]";
	}

}
