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
		System.out.println("������ʻ��... ");
		m.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ... ������ʻʱ��: " + (endtime - starttime) + "����!");
	}

}
