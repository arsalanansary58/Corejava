package Com.rays.polymorphism;
public class Shape {	
	private String colour;
	private int boadwith;

	public void setboadwith(int boadwith) {
		this.boadwith = boadwith;
	}	
	public int getboadwith() {
		return boadwith;
	}
	public void setcolour(String colour) {
		this.colour = colour;
	}
	public String getcolour() {
		return colour;
	}
	public void area() {
		System.out.println("its the area");
	}
}
