package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

	private Object target;
	
	
	/**
	 * @param target
	 */
	public LogHandler(Object target) {
		super();
		this.target = target;
	}

	/**
	 * 参数:
	 * proxy 被代理对象
	 * method 被代理对象的方法
	 * args 方法的参数
	 * 
	 * 返回值
	 * Object 方法的返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("日志记录...");
		method.invoke(target);
		System.out.println("记录结束!");
		return null;
	}

}
