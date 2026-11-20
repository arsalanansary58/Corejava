package Com.rays.Constructor;
public class Shape {
    
	private int radius;
	private String colour;
	
	public Shape() {
		System.out.println("its a defultt constructor");
	}
	 
	public Shape(int radius) {
		this();
		this.radius = radius;
		System.out.println(radius);
	}
	public Shape(String colour,int radius) {
		this(radius);
		this.colour = colour;
		System.out.println(colour);
	}
	
  }
