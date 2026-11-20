package Com.rays.polymorphism;
public class TestShape {
public static void main(String[] args) {
 	 
	Shape s = new Triangle();
	Triangle t = (Triangle)s;
	t.setBase(8);
	t.setheight(6);
	t.area();
	
  }	
}
