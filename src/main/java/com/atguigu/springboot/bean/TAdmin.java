package com.atguigu.springboot.bean;

public class TAdmin {

	private Integer id;

	private String loginacct;

	private String userpswd;

	private String username;

	private String email;

	private String createtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginacct() {
		return loginacct;
	}

	public void setLoginacct(String loginacct) {
		this.loginacct = loginacct;
	}

	public String getUserpswd() {
		return userpswd;
	}

	public void setUserpswd(String userpswd) {
		this.userpswd = userpswd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "TAdmin [id=" + id + ", loginacct=" + loginacct + ", userpswd=" + userpswd + ", username=" + username
				+ ", email=" + email + ", createtime=" + createtime + "]";
	}

	public TAdmin(Integer id, String loginacct, String userpswd, String username, String email, String createtime) {
		super();
		this.id = id;
		this.loginacct = loginacct;
		this.userpswd = userpswd;
		this.username = username;
		this.email = email;
		this.createtime = createtime;
	}

	public TAdmin() {
		super();
	}
	
}
