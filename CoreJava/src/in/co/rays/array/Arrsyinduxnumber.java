package in.co.rays.array;

public class Arrsyinduxnumber {
	public static void main(String[] args) {
		int sum = 0;
		int a[] = { 10, 20, 30, 40, 50,30};
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 30) {
				sum = i;
				System.out.println(sum);
			}
			
		}
	}
}