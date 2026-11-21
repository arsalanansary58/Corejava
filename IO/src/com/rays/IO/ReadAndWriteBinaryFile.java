package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
public static void main(String[] args) throws IOException {
	
     String Source = "C:\\Users\\arsal\\Desktop\\images.jfif";
     String target = "C:\\Users\\arsal\\Desktop\\imagescopy.jfif"; 
     
     FileInputStream in = new FileInputStream(Source);
	 FileOutputStream out = new FileOutputStream(target);
	 int i = in.read();
	 while(i != -1) {
		 System.out.println(i);
		 out.write(i);
		 i = in.read();
 	 }
	 in.close();
	 out.close();
	 System.out.println("successfully........");
  }	
}
