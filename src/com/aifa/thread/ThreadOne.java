package com.aifa.thread;

public class ThreadOne extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName()+i);
		}
	}
}
