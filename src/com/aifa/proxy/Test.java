package com.aifa.proxy;

public class Test {

	public static void main(String[] args) {
		ISinger targer=new Singer();
		ISinger proxy=new SingerProxy(targer);
		proxy.sing();
	}

}
