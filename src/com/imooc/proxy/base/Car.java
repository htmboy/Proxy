package com.imooc.proxy.base;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {
		
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
