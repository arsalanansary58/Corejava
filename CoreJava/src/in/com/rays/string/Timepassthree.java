package in.com.rays.string;
import java.util.Scanner;
public class Timepassthree {
public static void main(String[]arys) {
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter");
	String s = sc.nextLine();
	StringBuffer sb = new StringBuffer(s);
	
	for(char c = 'a'; c <= 'z'; c++) {
	for(int i = 0; i<s.length(); i++) {
		if(s.charAt(i) == c) {
		count++;
		}
	}
	}if(count > 0) {
		System.out.println(count);
    }
  } 
}
