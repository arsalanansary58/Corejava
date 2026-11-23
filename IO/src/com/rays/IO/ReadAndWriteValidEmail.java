package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteValidEmail {
public static void main(String[] args) throws IOException {

	
	FileReader source = new FileReader("C://Users//arsal//Desktop//email//Email.txt");
	FileWriter target = new FileWriter("C://Users//arsal//Desktop//email//ValidEmail.txt");
	BufferedReader br = new BufferedReader(source);
	BufferedWriter bw = new BufferedWriter(target);
	 
	String email = br.readLine();
	while(email != null){ 
		if(email.endsWith("@gmail.com")){
			System.out.println(email);
			bw.write(email);
				bw.newLine();
		}
		email = br.readLine();
      }
	br.close();
	bw.close();
	  
 }
 
}
