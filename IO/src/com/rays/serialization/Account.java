package com.rays.serialization;

import java.io.Serializable;

public class Account implements Serializable {
	private int balance;
	private transient int pin;
	
	public Account() {
		
	}
	
	public Account (int balance,int pin){
		this.balance = balance;
		this.pin = pin;
	}
	 @Override 
	public String toString() {
		return "Balance:" + balance + ", Pin:" + pin; 
	}

}
