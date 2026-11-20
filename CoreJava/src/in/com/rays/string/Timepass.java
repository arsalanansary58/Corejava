package in.com.rays.string;

import java.util.Scanner;
public class Timepass {
	public static void main(String[] args) {
int count = 0;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("enter a number"); 
	  String s = sc.nextLine();
	 for(char c = 'a'; c <= 'z'; c++) {
		 for(int i = 0; i<s.length();i++) {
			 if(s.charAt(i) == c ) { 
				 count++;
			 }	 
		 } if(count > 0) {
			 System.out.println(c +"="+count);
			 count = 0;
		 }
	 }
	 
	  
  }
}