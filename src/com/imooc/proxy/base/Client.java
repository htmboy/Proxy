package com.imooc.proxy.base;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Car car = new Car();
//		car.move();
		// ���ɷ�ʽ
//		Moveable car2 = new Car2();
//		car2.move();
		// �ۺϷ�ʽ
		Moveable car3 = new Car3(new Car());
		car3.move();
	}

}
