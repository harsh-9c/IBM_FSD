package com.linkedlist;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		
		
//		Program 1 - append the specified element to the end of a linked list.
		
		list.add("ram");
		list.add("vishal");
		list.add("mahesh");
		list.add("piyush");
		
//		Program 2 - iterate through all elements in a linked list.
		
		for(String names:list) {
			System.out.println(names);
		}
		
		
//		Program 3 -  iterate through all elements in a linked list starting at the specified position.
		
		Iterator itr=list.listIterator(1);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//		Program 4 - iterate a linked list in reverse order.
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
		
//		Program 5 - insert the specified element at the specified position in the linked list.
		
		list.set(0, "mihir");
		
//		Program 6 - get the first and last occurrence of the specified elements in a linked list.
		
		String first_occ=list.getFirst();
		String last_occ=list.getLast();
		System.out.println("First element is: "+first_occ);
		System.out.println("last element is: "+last_occ);
		
		
//		Program 7 - join two linked lists.
		
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("deepak");
		list2.add("amit");
		LinkedList<String> joinedLL=new LinkedList<String>();
		
		joinedLL.addAll(list);
		System.out.println(joinedLL);
		
//		Program 8 - convert a linked list to an array list.
		
		ArrayList<String> arr=new ArrayList<String> (list);
		System.out.println(arr);
		
//		Program 9 - check if a linked list is empty or not.
		
		if(list.isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List is not empty");
		}
		
		
		
//		Program 10 - replace an element in a linked list.
		
		list.set(2, "pushpak");
		System.out.println(list);
		
	
		
		
	}

}
