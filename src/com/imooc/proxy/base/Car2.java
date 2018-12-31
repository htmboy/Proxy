package com.imooc.proxy.base;

public class Car2 extends Car {

	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车行驶中... ");
		super.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶... 汽车行驶时间: " + (endtime - starttime) + "毫秒!");
	}
	
	
}
