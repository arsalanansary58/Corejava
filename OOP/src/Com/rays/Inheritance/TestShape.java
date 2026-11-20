package Com.rays.Inheritance;
public class TestShape {
public static void main(String[] args) {
    
	Circle c = new Circle();
    c.setboradwith(5);
    c.setcolour("red");
	c.setradius(8);
	
      System.out.println("your boradwith is  =" + c.getboradwith());
      System.out.println("colour =" + c.getcolour());
      System.out.println("radius = " + c.getradius());
      
      
      System.out.println("---------------");
      
      
      Rectangale r = new Rectangale();
	r.setboradwith(0);
	r.setcolour("blue");
	r.setlenght(2);
    r.setwidth(5);
   
	System.out.println(r.getboradwith());
	System.out.println(r.getcolour());
	System.out.println(r.getlenght());
	System.out.println(r.getwidth());
	
	
	System.out.println("------------------");
	
	
	Triangle t = new Triangle();
	
	t.setbase(5);
	t.setboradwith(8);
	t.sethigth(5);
	
	
	
	System.out.println(t.getbase());
	System.out.println(t.getboradwith());
	System.out.println(t.getcolour());
	System.out.println(t.gethight());
	
	}
	
}
