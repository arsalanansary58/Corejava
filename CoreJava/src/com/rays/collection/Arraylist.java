package com.rays.collection;
import java.util.ArrayList; 
import java.util.List;
//duplicate elements(different element)
//fast in search
//insertion deletion slow
public class Arraylist {
public static void main(String[] args) {
   	
	  List list = new ArrayList();
	   list.add(0, "orange");
	   list.add("55");
	  list.add("apple");
	 // list.clear();
   
  //    list.remove("orange");
	  System.out.println(list);
	  System.out.println(list.get(0));
	  System.out.println(list.contains("apple"));
	  System.out.println(list.size());
	  System.out.println(list.indexOf("apple"));
  // System.out.println(list);

	  
   }
  }
