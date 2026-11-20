package com.rays.basics;

public class Ifelse5 {
	public static void main(String[]arys) {
		
		int n = 14;
		
		int step = 0;
		
		
		while(n > 0) {
			if( n % 2 == 0 ) {
				n = n / 2 ;
		     step++;		
			
			} else {
				n = n - 1;
				
				step++;
			}
			
			
		}
		
		System.out.println(step);
		
	}
	

}
