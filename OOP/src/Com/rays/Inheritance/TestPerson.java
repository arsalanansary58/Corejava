package Com.rays.Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
 public static void main(String[] args)throws Exception {
  
	Businessman b = new Businessman(); 
	b.setaddress("indore ");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date = sdf.parse("2006-12-6");
    b.setDate(date);
	b.setname("kashif");
	b.setincome(100);
	System.out.println("MY NAME bnIS = "+b.getname());
	System.out.println("ADDRESS is = "+b.getaddress());
	System.out.println("MY INCOME = " +b.getincome());
	
	System.out.println("MY DATE OF BIRTH = "+sdf.format(b.getdob(date)));
	
	System.out.println("------------------");
	
	Doctor d = new Doctor();
	d.setaddress("indore");
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	Date I = sdf1.parse("2015-02-30");
  
	d.setDate(date);
	d.setname("naved");
	d.setregistrationNo("ABI81 C");
	 
	System.out.println("MY NAME = "+d.getname());
	System.out.println("ADDRES IS ="+d.getaddress());
	System.out.println("REGISTRATIONUMBER = "+d.getregistrationNo());
	System.out.println("MY DATE OF BIRT = "+sdf1.format(d.getdob(date)));
	
    System.out.println("------------------");
	
	Student s = new Student();
	s.setaddress("indore");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	Date k = sdf1.parse("2015-02-30");
	
	s.setDate(k);
	s.setname("arsalan");
	s.setnumber(77);
	s.setrollNumber("08344564");
		
	System.out.println("MY NAME IS =" + s.getname());
	System.out.println("ADDRESS IS =" + s.getaddress());
	System.out.println("NUMBER ="+s.getnumber());
	System.out.println("DATE OF BIRTH ="+sdf2.format(s.getdob(k)));
    System.out.println();
    
   }
 }
