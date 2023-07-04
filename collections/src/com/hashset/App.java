package com.hashset;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		HashSet<String> places=new HashSet<String>();
		
//		Program 1 - append the specified element to the end of a hash set.
		
		places.add("pune");
		places.add("delhi");
		places.add("mumbai");
		places.add("banglore");
		places.add("hyderabad");
		
		System.out.println(places);
		
//		Program 2 - iterate through all elements in a hash list.
		
		Iterator<String> itr=places.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String str:places) {
			System.out.println(str);
		}
		
		
//		Program 3 - get the number of elements in a hash set.
		
		System.out.println("The size of hash set is: "+places.size());
		
//		Program 4 - clone a hash set to another hash set.
		
		HashSet<String> places2=(HashSet)places.clone();
		System.out.println(places2);
		
		
//		Program 5 - convert a hash set to an array.
		
		String arr[]=new String[places.size()];
		places.toArray(arr);
		for(String str:arr) {
			System.out.println(str);
		}
		
//		Program 6 - convert a hash set to a tree set.
		
		Set<String> tree_set=new TreeSet<String>(places);
		System.out.println(tree_set);
		
//		Program 7 - compare two sets and retain elements that are the same.
		
		places.retainAll(places2);
		
//		Program 8 - empty an hash set. 
		
		places2.clear();
		
		
//		Program 9 - test if a hash set is empty or not. 
		
		if(places2.isEmpty()) {
			System.out.println("Hash set is empty");
		}
		else {
			System.out.println("Hash set is not empty");
		}
		
		
//		Program 10 - remove all elements from a hash set. 
		
		places.removeAll(places);
		
		
		

	}

}
