package com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerialization {
public static void main(String[] args) throws Exception {

	Account a1 = new Account(45000 , 1552);
	 
	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C://Users//arsal//Desktop//Test//Account.txt"));
	out.writeObject(a1); 
	System.out.println("Object serialize successfully");
	out.close();
	System.out.println("----------------");
	ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://Users//arsal//Desktop//Test//Account.txt"));
	a1 = (Account) in.readObject();
	System.out.println(a1);
	in.close();
 }
}