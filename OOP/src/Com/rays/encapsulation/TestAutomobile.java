package Com.rays.encapsulation;
public class TestAutomobile {
public static void main(String[] args) {
	
	Automobile A1 = new Automobile();

	    A1.setmake("toyota");
		 A1.setcoulour("black");
          A1.setspeed(250);
           A1.accelerator(30);
             A1.changeGear(5);
System.out.println(A1.getmake()); 
	System.out.println(A1.getcolour());
     	System.out.println(A1.getspeed()+"km/h");
     	
     }
}