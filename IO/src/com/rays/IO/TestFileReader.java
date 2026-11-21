package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
   
	public static void main(String[] args) throws IOException {
     
		FileReader file = new FileReader("C:\\Users\\arsal\\Desktop\\Test\\FileWriter.txt");
	     int i = file.read();
	     while(i != -1) {
	    	 System.out.println((char)i);
             i = file.read();
	     }
	      file.close();
 }
}
