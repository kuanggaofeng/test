package com.aifa.Runnable;

public class Test {
public static void main(String[] args) {
	Thread threadOne=new Thread(new ThreadOne());
	Thread threadTwo=new Thread(new ThreadTwo());
	threadOne.setName("�߳�һ");
	threadTwo.setName("�̶߳�");
	threadOne.start();
	threadTwo.start();
}
}
