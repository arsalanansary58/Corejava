package in.co.rays.array;
public class TestArraylargestnumber {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int a[] = {10,20,70,80,50};
      for(int i = 0; i <a.length; i++) {
    	  if(a[i] > sum ) {
    		  sum = a[i];
    	  }
    	}for(int c = 0; c<a.length; c++) {
    	if(a[c] > count && sum != a[c]) {
    		count = a[c];
    	}
    		
    		
    	}System.out.println(count);
	}
}