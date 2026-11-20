package in.com.rays.string;

public class Stringnamekashif {
	public static void main(String[] args) {
		int count = 0;
		String a = "kashif";
		for (char c = 'a'; c < 'z'; c++) {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == c) {
					count++;

				}
			}
		}
		System.out.println(count);

	}
}
