package com.imooc.proxy;

public class CarTimeProxy implements Moveable {
	private Moveable m;
	
	

	/**
	 * @param car
	 */
	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}



	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车行驶中... ");
		m.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶... 汽车行驶时间: " + (endtime - starttime) + "毫秒!");
	}

}
