package com.treeset;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		TreeSet<String> countries=new TreeSet<String>();
		
//	    Program 1 - append the specified element to the end of a hash set.
		
		countries.add("India");
		countries.add("Australia");
		countries.add("England");
		countries.add("USA");
		countries.add("Japan");
		
		System.out.println(countries);
		
//		Program 2 - iterate through all elements in a tree set.
		
		for(String str:countries) {
			System.out.println(str);
		}
		
//		Program 3 - add all the elements of a specified tree set to another tree set.
		
		TreeSet<String> set=new TreeSet<String>();
		set.add("Switzerland");
		set.add("Argentina");
		
		countries.addAll(set);
		System.out.println(countries);
		
//		Program 4 - create a reverse order view of the elements contained in a given tree set.
		
		Iterator itr=countries.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		Program 5 - get the first and last elements in a tree set.
		
		String first=countries.first();
		String last=countries.last();
		System.out.println(first+" "+last);
		
//		Program 6 - clone a tree set list to another tree set.
		
		TreeSet<String> new_countries=(TreeSet<String>)countries.clone();
		System.out.println(new_countries);
		
		
//		Program 7 - get the element in a tree set which is greater than or equal to the given element.
		
		TreeSet<Integer> tree_num=new TreeSet<Integer>();
		
		 
		   tree_num.add(25);
		   tree_num.add(16);
		   tree_num.add(70);
		   tree_num.add(82);
		   tree_num.add(89);
		   tree_num.add(14);
		   
		   System.out.println("Greater than or equal to 25 : "+tree_num.ceiling(25));
		   System.out.println("Greater than or equal to 10 : "+tree_num.ceiling(10));
		   
//		   Note: for less than or equal to - use floor()
		   
		   
//		   Program 8 - remove the first element of a tree set.
		   
		   tree_num.pollFirst();
		   System.out.println(tree_num);
		
		   
//		   Program 9 - remove a given element from a tree set.
		   
		   tree_num.remove(70); 
		   System.out.println(tree_num);
		   
//		   Program 10 - get an element in a tree set that has a lower value than the given element.
		   
		   System.out.println("The number lower than 40 is "+tree_num.lower(40));
		
		
		
		

	}

}
