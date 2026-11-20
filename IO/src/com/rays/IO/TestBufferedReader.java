package com.rays.IO;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedReader {
	
	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("C://Users//arsal//Desktop//Test//FileReader.txt",true);
		 
		file.write("you learn java");
		System.out.println("You successfully write in file");
		
		file.close();
	}

}