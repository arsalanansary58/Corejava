package com.rays.thread;
public class TestHelloRunnable {
public static void main(String[] args) {
	
    HelloRunnable r1 = new HelloRunnable("tom");	
    HelloRunnable r2 = new HelloRunnable("Tom");	
      
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
     t2.start();
     t1.start(); 
    
 }
}
