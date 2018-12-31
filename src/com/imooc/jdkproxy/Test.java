package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.imooc.proxy.Car;
import com.imooc.proxy.Moveable;

public class Test {

	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		
		Class<?> cls = car.getClass();
		/**
		 * jdk��̬����
		 * 
		 * loader �������
		 * interfaces ʵ�ֽӿ�
		 * h invocationHandler
		 * 
		 * ʹ�� Proxy ��̬���� newProxyInstance ����������
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		
		InvocationHandler h2 = new LogHandler(m);
		Class<?> cls2 = m.getClass();
		Moveable m2 = (Moveable) Proxy.newProxyInstance(cls2.getClassLoader(), cls2.getInterfaces(), h2);
		m2.move();
	}

}
