package com.imooc.proxy.base;

public class Car3 implements Moveable {
	private Car car;
	
	

	/**
	 * @param car
	 */
	public Car3(Car car) {
		super();
		this.car = car;
	}



	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("������ʻ��... ");
		car.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ... ������ʻʱ��: " + (endtime - starttime) + "����!");
	}

}
