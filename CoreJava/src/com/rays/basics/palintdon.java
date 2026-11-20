package com.rays.basics;

public class palintdon {
	public static void main(String[]arys) {

	  int num= 181;
	  int a = num % 10; // a = 1
	  int b = (num / 10) % 10;
	  int c = (num / 10) / 10;
	  
	  if (a == c && b == b && c == a ) {
		  System.out.println("its an pation number"); 
	  }
	  else {
		  System.out.println("it is not a palintdon number");
		  
	  }
}
	}

