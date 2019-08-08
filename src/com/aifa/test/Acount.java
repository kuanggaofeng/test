package com.aifa.test;

public class Acount {
	private int count=0;
	 /**
	  * ��Ǯ
	  * @param money
	 */
	public void addAcount(String name,int money) {
		synchronized(this) {
			// ��Ǯ
			count += money;
			System.out.println(name+"...���룺"+money+"..."+Thread.currentThread().getName());
			SelectAcount(name);
		}
	}

	/**
	* ȡǮ
	* @param money
	*/
	public void subAcount(String name,int money) {
		 // ���ж��˻����ڵ�����Ƿ�ȡǮ���
		 synchronized(this) {
		 if(count-money < 0){  
		 System.out.println("�˻����㣡"); 
		 return;  
		 } 
		
		// ȡǮ
		count -= money;
		System.out.println(name+"...ȡ����"+money+"..."+Thread.currentThread().getName());
		SelectAcount(name);
		}
	}

	/**
	* ��ѯ���
	*/
	public void SelectAcount(String name) {
	 System.out.println(name+"...��"+count);
	}
}
