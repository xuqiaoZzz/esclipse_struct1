package com.igeek.action_01;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//�ڷ���֮ǰִ�д���
		System.out.println(" method  begin");
		
		String result = invocation.invoke();//����action�еķ���
		System.out.println(result);
		//�ڷ���֮��ִ�д���
		System.out.println("method after");
		return result;
	}

}
