package in.com.rays.string;
public class Stringvowels {

	public static void main(String[]arys) {
		
		int step = 0;
		String s = "google";

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'o') {
				
				step++;
			}if (s.charAt(i) == 'e') {
				
				step++;
			}
		} System.out.println(step);

		
	}	
}
