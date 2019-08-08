package com.aifa.thread;

public class Test {

	public static void main(String[] args) {
		ThreadOne threadOne=new ThreadOne();
		ThreadTwo threadTwo=new ThreadTwo();
		threadOne.setName("œﬂ≥Ã“ª");
		threadOne.setPriority(10);
		threadTwo.setPriority(1);
        threadOne.start();
        //threadTwo.start();
	}
}
