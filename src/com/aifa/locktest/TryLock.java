package com.aifa.locktest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {
	  private Lock lock = new ReentrantLock();
	    public void tryLockParamTest(Thread thread) throws InterruptedException {
	        if(lock.tryLock(3000, TimeUnit.MILLISECONDS)) { //���Ի�ȡ�� ��ȡ���������͵�3�룬���3����ǻ�ȡ�����ͷ���false  
	            try {
	                System.out.println("�߳�"+thread.getName() + "��ȡ��ǰ��"); //��ӡ��ǰ��������
	                Thread.sleep(2000);//Ϊ����ִ��Ч�������̴߳˴�����2��
	            } catch (Exception e) {
	                System.out.println("�߳�"+thread.getName() + "�������쳣�ͷ���");
	            }finally {
	                System.out.println("�߳�"+thread.getName() + "ִ������ͷ���");
	                lock.unlock(); //�ͷ���
	            }
	        }else{
	            System.out.println("�����߳�"+Thread.currentThread().getName()+"��ǰ��������ռ��,�ȴ�3s�����޷���ȡ,����");
	        }
	    }
	    public static void main(String[] args) {
	    	TryLock lockTest = new TryLock();
	        Thread thread1 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    lockTest.tryLockParamTest(Thread.currentThread());
	                } catch (InterruptedException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
	        }, "thread1");
	        //����һ���߳� ���̶߳���
	        Thread thread2 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    lockTest.tryLockParamTest(Thread.currentThread());
	                } catch (InterruptedException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
	        }, "thread2");
	        // ����2���߳�
	        thread2.start();
	        thread1.start();
	    }
}
