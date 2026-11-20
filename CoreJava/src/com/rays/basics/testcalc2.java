
package com.rays.basics;

import java.util.Scanner;

public class testcalc2 {
	
	public static void main(String[]arys) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your first number");
		int a = sc.nextInt();
		
		System.out.println("enter your second  number");
	    int b = sc.nextInt();
   
	    System.out.println("enter your operator");
	    String op = sc.next();
	    
	    switch(op) {
	    
	    case ("+"):
	    	System.out.println(a + b);
	    break;
	    case ("-"):
	    	System.out.println(a - b);
	    break;
	    case ("*"):
	    	System.out.println(a * b);
	    break;    case ("%"):
	    	System.out.println(a % b);
	    break;
	    case ("/"):
	    	System.out.println(a / b);
	    break;
	        
	    }
  
  }
  		
	}

