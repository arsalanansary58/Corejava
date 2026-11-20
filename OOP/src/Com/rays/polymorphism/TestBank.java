package Com.rays.polymorphism;
public class TestBank {
public static void main(String[] args) {
	
    Bank b = new Bank();
    
	System.out.println("Bank name = "+ b.getname());
    System.out.println("Interest = " + b.getinterest());
   
    System.out.println("-------------");
    
    Axis a = new Axis();
    System.out.println("Interest = " + a.getinterest());
	System.out.println("Bank name = " +a.getname());
	
	
  }	
}
