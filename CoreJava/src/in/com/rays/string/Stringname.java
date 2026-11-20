package in.com.rays.string;
public class Stringname {
	public static void main(String[] arys) {
		int count = 0;
		String a = "kashif";
		
		for(char c = 'a'; c < 'z'; c++) {
			for(int i = 0; i<a.length(); i++) {
				if(a.charAt(i) == c) {
				count++;
		      }
	        }       	if(count > 0 ) {
				System.out.println (c+ "=" +count);
				count = 0;
			}	
		}  
	} 
}