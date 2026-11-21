package com.rays.io;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteEmail {
public static void main(String[] args) throws IOException {
	
	  FileWriter file = new FileWriter("C://Users//arsal//Desktop//email//Email.txt");
	  file.write("abc@gmail.com");
	  
	  file.write("xyz@yahoo.com");
	  
	  file.write("rahul@gmail.com");
	  
	  file.write("john@hotmail.com");
	  
	  file.write("jhone@gmail.com");
	 
	  file.write("red@vmail.com");
    System.out.println("data successfully write in file");
    file.close();

  }
}
