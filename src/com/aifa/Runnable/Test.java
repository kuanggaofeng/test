package com.aifa.Runnable;

public class Test {
public static void main(String[] args) {
	Thread threadOne=new Thread(new ThreadOne());
	Thread threadTwo=new Thread(new ThreadTwo());
	threadOne.setName("线程一");
	threadTwo.setName("线程二");
	threadOne.start();
	threadTwo.start();
}
}
