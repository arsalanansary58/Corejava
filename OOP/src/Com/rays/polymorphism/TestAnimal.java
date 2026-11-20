package Com.rays.polymorphism;
public class TestAnimal {

    public static void main(String[] args) {
		
	Cat c = new Cat();
	System.out.println(c.getfood());
	System.out.println(c.getvoice());
	
	System.out.println("--------------");
	
	Dog d = new Dog();
	System.out.println(d.getfood());
	System.out.println(d.getvoice());
	  
	System.out.println("--------------");
	
	Tiger t = new Tiger();
	
	System.out.println(t.getfood());
	System.out.println(t.getvoice());
	
	}
  }
