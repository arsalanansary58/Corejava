package Com.rays.Constructor;
public class Person {

	private String name;
	private String address;
	private String age;
	
	public Person(String name,String address,String age) {
		this.address = address;
		
		this.age = age;
		this.name = name;
	}
     public String getname() {
    	 return name;
     }
     public String getaddress() {
    	 return address;
     } 
     public String getage() {
    	 return age;
     }
}
