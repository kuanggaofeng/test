package com.aifa.thread;

public class Test1 {  
    public static void main(String[] args) throws InterruptedException {  
        System.out.println(Thread.currentThread().getName());  
        ThreadOne myThreadOne=new ThreadOne();  
        ThreadTwo myThreadTwo=new ThreadTwo(); 
        myThreadOne.setName("�߳�һ");
        myThreadTwo.setName("�̶߳�");
        myThreadOne.start(); 
        myThreadTwo.start();  
        
        for(int i=0;i<100;i++){  
            System.out.println("main"+i);  
        }  
    }  
} 
