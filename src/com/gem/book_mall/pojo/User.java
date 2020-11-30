package com.gem.book_mall.pojo;

public class User {
	private int id;
	private String username;
	private String pwd;
	private String sex;
	private String phone;
	private String address;

	public User(int id, String username, String pwd, String sex, String phone,
			String address) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
	}
	
	public User(int id, String username, String phone,
			String address) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
		this.address = address;
	}
	public User(int id, String username, String pwd) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pwd=" + pwd
				+ ", sex=" + sex + ", phone=" + phone + ", address=" + address
				+ "]";
	}

}
