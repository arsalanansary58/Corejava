package Com.rays.encapsulation;
public class Account {
 
	private String number;
	private String account;
	private double balance;
	
   public void setnumber(String number) {
	   this.number = number;
   }
	public String getnumber() {
		return number;
	}
	public void setaccount(String account) {
		this.account = account;
	}
	public String getaccount(){
		return account;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
    public double getbalance(){
    	return balance;
    }
    public void getdeposit(double deposit) {
             if(deposit < 0) {
            	 System.out.println("invalid balance");
             }
             else {
            	 balance = balance + deposit;
             }
     }
       public void getwithdrawal(double withdrawal) {
    	   if(withdrawal > balance) {
    		   System.out.println("invalid balance");
    	   }
    	   else {
    		   balance = balance - withdrawal;
    	   }
    	 }
       public void getpaybill(double bill) {
    	   if(bill > balance){
            System.out.println("invalid balance to pay bill");    		   
    	   }
    	   else {
    		   balance = balance - bill;
    		   System.out.println("your bill is paid");
    	   }
      }
}
