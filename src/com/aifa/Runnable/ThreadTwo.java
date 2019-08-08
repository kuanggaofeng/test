package com.aifa.Runnable;

public class ThreadTwo implements Runnable{

	@Override
	public void  run() {
		for(int i=0;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+i);
			if (i%5==0) {
				Thread.yield();
			}
		}
	}
}
