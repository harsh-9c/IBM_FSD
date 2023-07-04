package com.treemap;

import java.util.*;


public class App {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
		
//		Program 1 - associate the specified value with the specified key in a Tree Map.
		
		tree_map.put(1,"Red");
		tree_map.put(2,"Green");
		tree_map.put(3,"Black");
		tree_map.put(4,"White");
		tree_map.put(5,"Blue");
		
		System.out.println(tree_map);
		
//		Program 2 - copy Tree Map's content to another Tree Map.
		
		TreeMap<Integer,String> tree_map2=new TreeMap<Integer,String>();   
		tree_map2.put(6, "Red");
		tree_map2.put(7, "Green");
		tree_map2.put(9, "Black");
		tree_map2.put(10, "White");
		tree_map2.put(11, "Blue");
		
		tree_map.putAll(tree_map2);
		
//		Program 3 - search for a value in a Tree Map.
		
		if(tree_map.containsValue("Green")){
            System.out.println("The TreeMap contains value Green");
        } else {
            System.out.println("The TreeMap does not contain value Green");
        }
		
//		Program 4 - delete all elements from a Tree Map.
		
		tree_map2.clear();
		
//		Program 5 - sort keys in a Tree Map by using a comparator.
		
		
		TreeMap<String,String> tree_map3=new TreeMap<String,String>(new TreeMapComparator());
		
		tree_map3.put("c1","Red");
		tree_map3.put("c2","Green");
		tree_map3.put("c3","Black");
		tree_map3.put("c4","White");
		tree_map3.put("c5","Blue");
		
		System.out.println(tree_map3);
		
		
//		Program 6 - get a key-value mapping associated with the greatest key and the least key in a map.
		
		System.out.println("Least key: "+tree_map.firstEntry());
		System.out.println("Greatest key: "+tree_map.lastEntry());
		
		
//		Program 7 - reverse order view of the keys contained in a given map.
		
		System.out.println("Reverse order: "+tree_map.descendingKeySet());
		
//		Program 8 - get a portion of a map whose keys are greater than or equal to a given key.
		
		System.out.println("Portion of a map having key greater than 4: "+tree_map.tailMap(4));
		
//		Program 9 - get the greatest key strictly less than the given key. Return null if there is no such key.
		
		System.out.println("key strictly less than 1: "+tree_map.lowerKey(1));
		System.out.println("key strictly less than 5: "+tree_map.lowerKey(5));
		
		
//		Program 10 - get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
		System.out.println("Portion of a map having key  >=3 and < 8: "+tree_map.subMap(3, 8));
		
		

	}

}
