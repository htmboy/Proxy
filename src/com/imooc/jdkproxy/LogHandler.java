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
	 * ����:
	 * proxy ���������
	 * method ���������ķ���
	 * args �����Ĳ���
	 * 
	 * ����ֵ
	 * Object �����ķ���ֵ
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��־��¼...");
		method.invoke(target);
		System.out.println("��¼����!");
		return null;
	}

}
