package Com.rays.encapsulation;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	public final static int AGE = 18;
     public void setname(String name) {   
    	 this.name = name;
     }
	 public String getname() {
		 return name;
	 }
	public void setaddress(String address){
		this.address = address;
	}
	public String getaddress() {
		return address;
	}
     public void setdob(Date dob){
    	 this.dob = dob; 	 
     }
     public Date getdob() {
    	 return dob;  
     }
     public int getAge() {
    	 Date d = new Date();
    	 int age = d.getYear() - dob.getYear();
    	 return age;
     }
     
}