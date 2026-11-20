package in.co.rays.array;

public class TestArraymissingterm {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20, 30, 40, 50, 60 };
		int missing = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {

				}
				if (b[i] != a[j]) {
					missing = b[i];
					break;
				}

			}

		} System.out.println(missing);

	}

}