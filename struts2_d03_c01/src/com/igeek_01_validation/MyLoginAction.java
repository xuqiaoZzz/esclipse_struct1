package com.igeek_01_validation;

import com.opensymphony.xwork2.ActionSupport;

public class MyLoginAction extends ActionSupport{
	private String username;
	private String pwd;
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
	
	@Override
	public String execute() throws Exception {
		System.out.println("½øÀ´ÁË");
		return SUCCESS;
	}
}
