package Com.rays.Inheritance;
public class TestAnimal {
public static void main(String[] args) {
	
	Cat c = new Cat();
	 c.setage(5);
	 c.setcolour("brown");
	 c.seteat("cat food");
	 c.setname("cat");
c.setsleep("sleepingS");	 
	 System.out.println("my cat name is =" + c.getname());
	System.out.println(c.getage());
	 System.out.println(c.getcolour());
	 System.out.println(c.geteat());
	 System.out.println("cat is "+ c.getsleep());
	 
	 System.out.println("-----------------");
	 
	 Dog d = new Dog();
	 d.setbreed("husky kutta");
	 d.setage(5);
	 d.setisfriendly("yess");
	 d.setname("kutta ");
	 d.setsleep("sleeping");
	 

	 System.out.println(d.getbreed());
    System.out.println(d.getage());
	 System.out.println(d.getisfriendly());
	 System.out.println(d.getname());
	 System.out.println(d.getsleep());
	 
	

	
 }	
}
