package Com.rays.encapsulation;

import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws Exception {

		Person p1 = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		p1.setname("kashif");
		p1.setaddress("indore");
		p1.setdob(sdf.parse("2006-12-06"));
		
		
		System.out.println(p1.getname());
		System.out.println(p1.getaddress());
		System.out.println(p1.getdob());
	
	}
}

