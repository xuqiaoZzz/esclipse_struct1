package com.igeek_01_validation;

import com.opensymphony.xwork2.ActionSupport;

public class MyRegistAction extends ActionSupport{
		//�û���
		private String username;
		//����
		private String pwd;
		//�ظ�����
		private String repwd;
		//����
		private int age;
		//�ֻ�����:��ʵ����Ŀ�У��ֻ����붼��ʹ��String����
		private String phone;
		//����
		private String email;
		
		public String regist() throws Exception {
			
			System.out.println("MyRegistAction��myRegist������ִ����...");
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
