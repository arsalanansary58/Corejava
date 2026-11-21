package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
   public static void main(String[] args) throws IOException {
	
    FileWriter file = new FileWriter("C://Users//arsal//Desktop//test//FileWriter.txt",true);
	file.write("hello");  
	 System.out.println("you successfully write in file");  
	 file.close();  
	   
	   
 } 
}