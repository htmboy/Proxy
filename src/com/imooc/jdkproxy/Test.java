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
		 * jdk动态代理
		 * 
		 * loader 类加载器
		 * interfaces 实现接口
		 * h invocationHandler
		 * 
		 * 使用 Proxy 静态方法 newProxyInstance 创建代理类
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		
		InvocationHandler h2 = new LogHandler(m);
		Class<?> cls2 = m.getClass();
		Moveable m2 = (Moveable) Proxy.newProxyInstance(cls2.getClassLoader(), cls2.getInterfaces(), h2);
		m2.move();
	}

}
