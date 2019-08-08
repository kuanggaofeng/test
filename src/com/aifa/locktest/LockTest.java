package com.aifa.locktest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	 private Lock lock = new ReentrantLock();
	    /*
	     * ʹ������ͷź������̲߳��ܻ�ȡ��
	     */
	    public void lockTest(Thread thread) {
	        lock.lock();//��ȡ��
	        try {
	            System.out.println("�߳�"+thread.getName() + "��ȡ��ǰ��"); //��ӡ��ǰ��������
	            Thread.sleep(2000);//Ϊ����ִ��Ч�������̴߳˴�����2��
	        } catch (Exception e) {
	            System.out.println("�߳�"+thread.getName() + "�������쳣�ͷ���");
	        }finally {
	            System.out.println("�߳�"+thread.getName() + "ִ������ͷ���");
	            lock.unlock(); //�ͷ���
	        }
	    }
	     
	    public static void main(String[] args) {
	       LockTest lockTest = new LockTest();
	        //����һ���߳� ���߳�һ��
	        Thread thread1 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	            	//lockTest(Thread.currentThread());
	                lockTest.lockTest(Thread.currentThread());
	            }
	        }, "thread1");
	        //����һ���߳� ���̶߳���
	        Thread thread2 = new Thread(new Runnable() {
	 
	            @Override
	            public void run() {
	            	//lockTest(Thread.currentThread());
	                lockTest.lockTest(Thread.currentThread());
	            }
	        }, "thread2");
	        // ����2���߳�
	        thread2.start();
	        thread1.start();
	    }
}
