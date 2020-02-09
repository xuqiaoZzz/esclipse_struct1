package com.igeek_01_validation;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	

	private String username;
	private String pwd;
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("LoginAction执行了execute....");
		
		System.out.println(toString());
		
		return NONE;
	}
	
	public String login() throws Exception {
		
		System.out.println("LoginAction执行了....");
		
		System.out.println(toString());
		
		return NONE;
	}
	
	public String find() throws Exception {
		
		System.out.println("LoginAction执行了find....");
		
		System.out.println(toString());
		
		return NONE;
	}
	
	/*@Override
	public void validate() {
		
		//用户名不能为空，
//		if(username==null||"".equals(username))
		if(StringUtils.isBlank(username))
		{
			//添加错误信息
			this.addFieldError("usernameError", "用户名不能为空");
		}
		//判断面不能为空
		if(StringUtils.isBlank(pwd))
		{
			this.addFieldError("pwdError", "密码不能为空");
		}
		
	}*/
	
	//局部校验
	public void validateLogin(){
		//用户名不能为空，
		if(StringUtils.isBlank(username))
		{
			//添加错误信息
			this.addFieldError("usernameError", "用户名不能为空");
		}
		//判断面不能为空
		if(StringUtils.isBlank(pwd))
		{
			this.addFieldError("pwdError", "密码不能为空");
		}
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
}
