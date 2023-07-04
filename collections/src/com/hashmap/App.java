package com.hashmap;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
//		Program 1 - associate the specified value with the specified key in a HashMap.
		
		map.put(1, "Lion");
		map.put(2, "Bear");
		map.put(3, "Cheetah");
		map.put(4, "Leopard");
		
//		Program 2 - count the number of key-value (size) mappings in a map.
		
		System.out.println("Size of the hash map is "+map.size());
		
//		Program 3 - copy all mappings from the specified map to another map.
		
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		
		map2.put(5, "Rabbit");
		map2.put(6, "Deer");
		
		map.putAll(map2);
		
		System.out.println(map);
		
//		Program 4 - test if a map contains a mapping for the specified key.
		
		if(map.containsKey(2)) {
			System.out.println("map contains the given key");
		}
		else {
			System.out.println("map not contains the given key");
		}
		
		
//		Program 5 - test if a map contains a mapping for the specified value.
		
		if(map.containsValue("Lion")) {
			System.out.println("map contains the Lion");
		}
		else {
			System.out.println("map not contains the given Lion");
		}
		
		
//		Program 6 - get the value of a specified key in a map.
		
		String animalAt3=map.get(3);
		System.out.println(animalAt3);	
		
//		Program 7 - remove all mappings from a map. 
		map2.clear();
		
//		Program 8 - check whether a map contains key-value mappings (empty) or not. 
		
		if(map2.isEmpty()) {
			System.out.println("Hash map is empty");
		}
		else {
			System.out.println("Hash map is not empty");
		}
		
//		Program 9 - get a shallow copy of a HashMap instance.
		
		HashMap<Integer,String> map3=new HashMap<Integer,String>();
		map3=(HashMap)map.clone();
		System.out.println("shallow copy: "+map3);
		
//		Program 10 - get a collection view of the values contained in this map.
		
		System.out.println("collection view of values: "+map.values());
		
		
		
	}

	
}
