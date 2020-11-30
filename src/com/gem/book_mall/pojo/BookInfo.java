package com.gem.book_mall.pojo;

public class BookInfo {
	private int cid;
	private String type_name;
	private int id;
	private String b_name;
	private int new_price;
	private int old_price;
	private String author;
	private String detail;
	private int b_id;
	private String picture;

	public BookInfo() {
		super();
	}

	public BookInfo(int id, String b_name, int new_price, int old_price,
			String author, String detail, int b_id) {
		super();
		this.id = id;
		this.b_name = b_name;
		this.new_price = new_price;
		this.old_price = old_price;
		this.author = author;
		this.detail = detail;
		this.b_id = b_id;
	}
	
	public BookInfo(int id, String b_name, int new_price, int old_price,
			String author, String detail,int b_id,String picture) {
		super();
		this.id = id;
		this.b_name = b_name;
		this.new_price = new_price;
		this.old_price = old_price;
		this.author = author;
		this.detail = detail;
		this.picture=picture;
		this.b_id=b_id;
	}

	public BookInfo(int id,String b_name, int new_price, int old_price,
			String author,int cid,String type_name) {
		super();
		this.id = id;
		this.b_name = b_name;
		this.new_price = new_price;
		this.old_price = old_price;
		this.author = author;
		this.type_name=type_name;
		this.cid=cid;
	}
	
	public BookInfo(int cid, String type_name, int id, String b_name,
			int new_price, int old_price, String author, String detail,
			int b_id, String picture) {
		super();
		this.cid = cid;
		this.type_name = type_name;
		this.id = id;
		this.b_name = b_name;
		this.new_price = new_price;
		this.old_price = old_price;
		this.author = author;
		this.detail = detail;
		this.b_id = b_id;
		this.picture = picture;
	}

	public BookInfo(int id, String b_name, int new_price,
			int old_price, String author, String picture) {
		// TODO Auto-generated constructor stub
		super();

		this.id = id;
		this.b_name = b_name;
		this.new_price = new_price;
		this.old_price = old_price;
		this.author = author;
		this.picture = picture;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
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

	public int getB_id() {
		return b_id;
	}


	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	@Override
	public String toString() {
		return "BookInfo [id=" + id + ", b_name=" + b_name + ", new_price="
				+ new_price + ", old_price=" + old_price + ", author=" + author
				+ ", detail=" + detail + ", b_id=" + b_id + ", picture="
				+ picture + ", cid=" + cid + ", type_name=" + type_name + "]";
	}
	

}
