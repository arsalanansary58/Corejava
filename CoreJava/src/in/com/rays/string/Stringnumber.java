package in.com.rays.string;
public class Stringnumber {
 public static void main(String[]arys) {
	 
	 String s = "ram12kaml056";
	
	 int count = 0;
	 for(char c = '0'; c<= '9'; c++) {
			for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == c ) {
				count++;
						
	       }
		}	
	 } 
	 
	 System.out.println(count);			
	 }
}