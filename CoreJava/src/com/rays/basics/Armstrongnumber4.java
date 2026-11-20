package com.rays.basics;

public class Armstrongnumber4 {

	
	public static void main (String[]arys) {
	
		int number = 1634;
		
		int rem = 0;
		int sum = 0;
		
		int n = number;
		
		
		while(n > 0) {
			
			rem = n % 10;
			
			sum = sum + (rem * rem * rem * rem);
			
			n = n / 10;
			 
			
}  if( number == sum) {
	System.out.println("its an armstrong number");
 } else {
	 System.out.println("its not sn armstrong number");
	 
	 
 }

		
		
		
		
		
	}
}
