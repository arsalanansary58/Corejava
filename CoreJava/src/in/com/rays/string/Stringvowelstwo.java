package in.com.rays.string;

public class Stringvowelstwo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		int step = 0;
		String s = "kashif";
     
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == 'o' || s.charAt(i) == 'e' 
		|| s.charAt(i) == 'a'||s.charAt(i) == 'i'||s.charAt(i) == 'u') {
				step++;
				

			}

		}

		System.out.println("vowel = " + step);
		
	}

}
