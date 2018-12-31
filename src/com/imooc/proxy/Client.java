package com.imooc.proxy;

public class Client {

	public static void main(String[] args) {
	
//		CarTimeProxy ctp = new CarTimeProxy(new Car());
//		CarLogProxy clp = new CarLogProxy(ctp);
//		clp.move();
		
		CarLogProxy clp = new CarLogProxy(new Car());
		CarTimeProxy ctp = new CarTimeProxy(clp);
		ctp.move();
	}

}
