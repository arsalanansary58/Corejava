package com.rays.thread;

public class HelloRunnable implements Runnable {

	private String name;

	public HelloRunnable() {

	}
	
	public HelloRunnable(String name) {
     this.name = name;
	}

	@Override
	public void run() {
		for(int i = 1; i<= 5; i++) {
			System.out.println(name + " = " + i);
		}

	}

}
