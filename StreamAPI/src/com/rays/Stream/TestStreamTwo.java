package com.rays.Stream;
import java.util.ArrayList;
import java.util.List;
public class TestStreamTwo {
public static void main(String[] args) {

	List<Integer> list = new ArrayList<Integer>();
	for(int i = 1; i<=10; i++) {
		list.add(i);
	}
	
	list.stream().filter(i-> {int count = 0; 
	for(int j = 1 ; j <= i ; j++) {
		if(i %j == 0) {
			count++;
		}
	}  
	return count == 2;
	}).forEach(System.out::println);
 }
}
