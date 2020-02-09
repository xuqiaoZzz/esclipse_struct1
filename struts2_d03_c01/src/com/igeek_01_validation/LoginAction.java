package com.igeek_01_validation;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	

	private String username;
	private String pwd;
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("LoginActionִ����execute....");
		
		System.out.println(toString());
		
		return NONE;
	}
	
	public String login() throws Exception {
		
		System.out.println("LoginActionִ����....");
		
		System.out.println(toString());
		
		return NONE;
	}
	
	public String find() throws Exception {
		
		System.out.println("LoginActionִ����find....");
		
		System.out.println(toString());
		
		return NONE;
	}
	
	/*@Override
	public void validate() {
		
		//�û�������Ϊ�գ�
//		if(username==null||"".equals(username))
		if(StringUtils.isBlank(username))
		{
			//��Ӵ�����Ϣ
			this.addFieldError("usernameError", "�û�������Ϊ��");
		}
		//�ж��治��Ϊ��
		if(StringUtils.isBlank(pwd))
		{
			this.addFieldError("pwdError", "���벻��Ϊ��");
		}
		
	}*/
	
	//�ֲ�У��
	public void validateLogin(){
		//�û�������Ϊ�գ�
		if(StringUtils.isBlank(username))
		{
			//��Ӵ�����Ϣ
			this.addFieldError("usernameError", "�û�������Ϊ��");
		}
		//�ж��治��Ϊ��
		if(StringUtils.isBlank(pwd))
		{
			this.addFieldError("pwdError", "���벻��Ϊ��");
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
