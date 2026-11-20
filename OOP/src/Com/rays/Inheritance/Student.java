package Com.rays.Inheritance;
public class Student extends Person{
 
	private String rollNumber;
	private int number;
	public void setrollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String rollNumber() {
		return rollNumber;
	}
	public void setnumber(int number) {
		this.number = number;
	}
	public int getnumber() {
		return number;
	}
	
}
