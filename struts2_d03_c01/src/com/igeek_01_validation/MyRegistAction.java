package com.igeek_01_validation;

import com.opensymphony.xwork2.ActionSupport;

public class MyRegistAction extends ActionSupport{
		//用户名
		private String username;
		//密码
		private String pwd;
		//重复密码
		private String repwd;
		//年龄
		private int age;
		//手机号码:在实际项目中，手机号码都是使用String类型
		private String phone;
		//邮箱
		private String email;
		
		public String regist() throws Exception {
			
			System.out.println("MyRegistAction的myRegist方法被执行了...");
			System.out.println(toString());
			
			return SUCCESS;
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
		public String getRepwd() {
			return repwd;
		}
		public void setRepwd(String repwd) {
			this.repwd = repwd;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		@Override
		public String toString() {
			return "MyRegistAction [username=" + username + ", pwd=" + pwd
					+ ", repwd=" + repwd + ", age=" + age + ", phone=" + phone
					+ ", email=" + email + "]";
		}
		
}
