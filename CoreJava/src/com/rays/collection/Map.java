package com.rays.collection;
import java.util.HashMap; 
// Map contain key = value pair
//order of HashMap not define
//Key always unique set type, value can be duplicate list type
//HasMap contain only one null key
public class Map {
public static void main(String[] args) {
	HashMap mp = new HashMap();
	mp.put("one", 1);
	mp.put("two", 2);
	mp.put("three", 3);
	  
	
	System.out.println(mp);
	System.out.println(mp.get("two"));
	System.out.println(mp.remove("three"));
	System.out.println(mp.get("one"));
	System.out.println(mp);
	System.out.println("Mape Size : " + mp.size());
	System.out.println(mp.containsKey("one"));
	System.out.println(mp.containsKey("three"));
    System.out.println(mp.containsValue(2));
    System.out.println(mp.containsValue(3));
    
    System.out.println("-----------------");
    
    System.out.println(mp.entrySet());
    System.out.println(mp.keySet());
    System.out.println(mp.values());
} 
 }