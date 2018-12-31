package com.imooc.proxy.base;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Car car = new Car();
//		car.move();
		// 集成方式
//		Moveable car2 = new Car2();
//		car2.move();
		// 聚合方式
		Moveable car3 = new Car3(new Car());
		car3.move();
	}

}
