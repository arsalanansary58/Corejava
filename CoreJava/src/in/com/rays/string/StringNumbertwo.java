package in.com.rays.string;

public class StringNumbertwo {
	public static void main(String[] arys) {

		int count = 0;
		String a = "raksh10kumar253";
		for (int i = 0; i < a.length(); i++) {
			if (Character.isDigit(a.charAt(i))) {
					count++;
			}
			
		}		System.out.println(count);
	

	}

}
