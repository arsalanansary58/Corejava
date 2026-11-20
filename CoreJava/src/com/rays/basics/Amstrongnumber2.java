package com.rays.basics;
public class Amstrongnumber2 {
public static void main(String[]arys) {

   int number =	1634;
   
    int a = (number % 10);
    int b = (number / 10) % 10;
	int c = (number / 100) % 10;	
	int d =(number / 100) / 10; 	
		
	int sum = a*a*a*a + b*b*b*b + c*c*c*c + d*d*d*d;
	if(number == sum) {
		System.out.println("its a amstrong number");
	}
	else {
		System.out.println("its not a amstroung number");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
