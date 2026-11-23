package com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeSerilization {
	public static void main(String[] args) throws Exception {
	
		Employee e1 = new Employee(4500 , 12); 
		 
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C://Users//arsal//Desktop//Test//Employee.txt"));
		
	     out.writeObject(e1);
	     
	     System.out.println("Object Serialized sucessfully ");
	     out.close();
	
	     System.out.println("-------------");
	     
	     ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://Users//arsal//Desktop//Test//Employee.txt"));
	      e1 = (Employee) in.readObject();
	      System.out.println(e1);
	      in.close();
	     
	}
}
