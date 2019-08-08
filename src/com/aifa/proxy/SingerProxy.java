package com.aifa.proxy;


public class SingerProxy implements ISinger {
    private ISinger targer;
    public  SingerProxy(ISinger targer) {
		this.targer=targer;
	}
	@Override
	public void sing() {
	  System.out.println("123");
      targer.sing();
      System.out.println(456);
	}
}
