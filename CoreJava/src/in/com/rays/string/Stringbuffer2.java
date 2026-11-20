package in.com.rays.string;
public class Stringbuffer2 {
public static void main(String[]arys) {
	
	StringBuffer s =new StringBuffer ("kashif");
	int count = 0;
	
	for(char c = 'a'; c <='z'; c++) {
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
	                
		} if(count > 0) {
			System.out.println( c + "=" + count);
			count = 0;
  
	   }
    }
  }
}
