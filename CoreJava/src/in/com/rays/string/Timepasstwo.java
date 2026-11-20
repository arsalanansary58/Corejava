package in.com.rays.string;
import java.util.Scanner;
public class Timepasstwo {
public static void main(String[]arys) { 
     Scanner sc = new Scanner(System.in);
     System.out.print("enter name");
   String s = sc.nextLine();
	for(int i = 0; i<s.length(); i++) {
		
		if(s.charAt(i) == 'i'|| s.charAt(i) == 'a'){
			System.out.print(s.charAt(i));
		}
	}
	
	
	

  }
}