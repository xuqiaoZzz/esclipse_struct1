package com.igeek.action_01;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("÷¥––¡ÀMyAction");
		return NONE;
	}
}
