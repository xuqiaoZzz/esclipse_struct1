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
		//在方法之前执行代码
		System.out.println(" method  begin");
		
		String result = invocation.invoke();//调用action中的方法
		System.out.println(result);
		//在方法之后执行代码
		System.out.println("method after");
		return result;
	}

}
