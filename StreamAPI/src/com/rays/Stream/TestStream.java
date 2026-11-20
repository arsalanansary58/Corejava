package com.rays.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStream {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	list.add("kamlesh");
	list.add("vimlesh");
	list.add("suresh");
	list.add("mahesh");
	list.add("katappa");
	list.add("bahubali");
	list.add("bahubali");
	list.add("umesh");
	list.add("ramesh");
	
	list.forEach(System.out::println);
	System.out.println("----------");
	list.stream().map(s-> s.toLowerCase()).forEach(System.out::println);

	System.out.println("----------");
	list.stream().map(s-> s.toUpperCase()).forEach(System.out::println);
	System.out.println("-------------");
    list.stream().distinct().forEach(System.out::println);
    System.out.println("-----------");
    list.stream().map(s -> s.toUpperCase()).filter(s-> s.endsWith("esh")).forEach(System.out::println);
    System.out.println("----------");
    list.stream().sorted().forEach(System.out::println);   
    System.out.println("-----------");
    list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
 
    
  }
 }
