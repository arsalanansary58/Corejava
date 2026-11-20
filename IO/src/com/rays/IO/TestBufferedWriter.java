package com.rays.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
	 public static void main(String[] args) throws IOException {
	  
		 BufferedWriter file = new BufferedWriter(new FileWriter("C://Usersarsal//Desktop//TestFileReader.txt"));
		 file.newLine();
		 file.write("you learn java");
		 file.newLine();
		 file.write("now you write java");
	   System.out.println("java file write successfully");
	}
}
