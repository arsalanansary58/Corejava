package com.rays.basics;

public class Armstrongnumber3 {
 
  public static void main(String []arys) {
	  
	  int number = 1634;
	  int rem = 0;
	  int sum = 0;
	  
	  int n = number;// n = 1643
	  
	  while (n > 0 ) {
		  
		  
		  rem = n % 10;
		  
		  sum = sum + ( rem * rem * rem * rem );
		  
		  n =  n / 10;
	  }
	  if (sum == number) {
		  System.out.println("its an amstrong number");
		  
	  }
	  else {
		  System.out.println("its not ");
		  
	  }
	  
  }
  
  
  
  
  
	
	
	
}
