package Com.rays.encapsulation;
public class TestAccount {
public static void main(String[] args) {
	  
		Account A1 = new Account();
	       A1.setaccount("saving");
	       A1.setbalance(1000);
	       A1.setnumber("7549728579");
	       A1.getdeposit(500);
	     //A1.getwithdrawal(100);
	       A1.getpaybill(1000);
	       
	           System.out.println("account number = "+ A1.getnumber());
	         System.out.println("your account type is = " + A1.getaccount());
	       System.out.println("avaliable balance = " + A1.getbalance( ));
	      
	
 }	
}
