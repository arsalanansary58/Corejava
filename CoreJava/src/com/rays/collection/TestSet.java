package com.rays.collection;

import java.util.Set;
import java.util.TreeSet;

public class TestSet {
public static void main(String[] args) {
	
	
	 Set s = new TreeSet();
	s.add("apple");
	s.add("mango");
	s.add("orange");
//	s.remove("orange");
//	s.clear();
	System.out.println(s);
	System.out.println(s.size());
	System.out.println(s.contains("orange"));
  }
}
