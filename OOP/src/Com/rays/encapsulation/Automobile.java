package Com.rays.encapsulation;
public class Automobile {

	private String colour;
	private String make;
	private int speed;
	  public final static int GEAR = 5;
	public void setcoulour(String colour) {
		this.colour = colour;
	}
	public String getcolour() {
		return colour;
	}
	public void setmake(String make) {
		this.make = make;
	}
	public String getmake() {
		return make;
	}
	public void setspeed(int speed) {
		this.speed = speed;
	}
	public int getspeed() {
		return speed;
	}
	public void accelerator(int accelerator) {
       if(speed > 200) {
    	   System.out.println("slow your speed");
       }
       else {
   	   speed = speed + accelerator;
       }
	}
	public void changeGear(int changeGear){
		if(changeGear < GEAR){
			System.out.println("invalid gear");
		}
		if(changeGear == 1) {
		 System.out.println("applied 1 gear");		
	 }
		if(changeGear == 2) {
			System.out.println("applied 2 gear");
		}
		if(changeGear == 3) {
			System.out.println("applied 3 gear");
		}
		if(changeGear == 4) {
			System.out.println("applied 4 gear");
		}
		if(changeGear == 5) {
			System.out.println("applied 5 gear");
		}	
		else {
			System.out.println("reverse gear");
		}
	}
	}  
