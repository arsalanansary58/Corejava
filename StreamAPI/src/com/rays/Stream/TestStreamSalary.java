package com.rays.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStreamSalary {
	public static void main(String[] args) {
   
		List<Double> list = new ArrayList();
		list.add(45990.77);
		list.add(87870.66);
		list.add(99490.11);
		list.add(55780.55);
		list.add(68000.22);
		list.add(99900.22);
		list.add(68000.22);
		list.forEach(System.out::println);
		System.out.println("---------");
		list.stream().sorted().forEach(System.out::println); 
		System.out.println("---------");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		System.out.println("---------");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("---------");
		System.out.println("first largest s  alary");
		list.stream().distinct().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);
		System.out.println("second largest salary");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);

		System.out.println("first smallest salary");
		list.stream().distinct().sorted().limit(1).forEach(System.out::println);
		System.out.println("second smallest salary");
		list.stream().distinct().sorted().skip(1).limit(1).forEach(System.out::println);

	}
}
