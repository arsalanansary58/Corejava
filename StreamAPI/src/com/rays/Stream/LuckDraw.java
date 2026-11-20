package com.rays.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LuckDraw {
	public static void main(String[] args) {
		
	
	ArrayList<Contestant> list = new ArrayList<Contestant>();
	list.add(new Contestant("Ram","9912345678"));
	list.add(new Contestant("Ram", "9912345678"));
	list.add(new Contestant("Shyam", "9823456789"));
	list.add(new Contestant("Aman", "9876543210"));
	list.add(new Contestant("Rahul", "9123456780"));
	list.add(new Contestant("Rohit", "9988776655"));
	list.add(new Contestant("Vikas", "9876501234"));
	list.add(new Contestant("Karan", "9765432109"));
	list.add(new Contestant("Arjun", "9898765432"));

	list.stream().map(e ->e.phone);
	list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(System.out::println);
	System.out.println("-------------------------");
	list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct();
	list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e -> {
		
		Collections.shuffle(e);
		return e.stream();
	})).limit(3).forEach(System.out::println);
	

	
  }
}