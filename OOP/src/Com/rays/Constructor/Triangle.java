package Com.rays.Constructor;
public class Triangle extends Shape{
  
	private int height;
	
	public Triangle(int height,int radius,String colour){
		super(colour,radius);
		this.height = height;
		System.out.println(height);
	}
	
	
	
   }
