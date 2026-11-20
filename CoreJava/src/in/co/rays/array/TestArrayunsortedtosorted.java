package in.co.rays.array;
public class TestArrayunsortedtosorted {
	public static void main(String[] args) {
		int count = 0;
		int a[] = { 10, 20, 60, 40, 70 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] > count) {
				count = a[i];
			}
}      int sum = 0;
    for (int c = 0; c < a.length; c++) {
		if(a[c] > sum && count != a[c]) {
			sum = a[c];
		}
	} System.out.println(sum);    
 		

 







		
	}
}
