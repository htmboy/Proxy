package com.imooc.proxy.base;

public class Car2 extends Car {

	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("������ʻ��... ");
		super.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ... ������ʻʱ��: " + (endtime - starttime) + "����!");
	}
	
	
}
