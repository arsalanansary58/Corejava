package in.com.rays.string;

public class Stringname3 {
public static void main(String[] args) {
	String s = "banana";
	int count = 0;
	for(char c = 'a'; c <='j'; c++) {
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == c){
				count++; 
	
				count++;
	}
      }	 if(count > 0) {
    	  System.out.println(c +"="+count);
    	  count = 0;
      }
   }
 }
}