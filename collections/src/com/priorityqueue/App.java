package com.priorityqueue;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
//		Program 1 - add some colors (strings) and print out the elements of the priority queue.
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		
		queue.add("red");
		queue.add("blue");
		queue.add("green");
		queue.add("black");
		queue.add("white");
		
//		Program 2 - iterate through all elements in the priority queue.
		
		for(String str:queue) {
			System.out.println(str);
		}
		
//		Program 3 - remove all elements from a priority queue.
		
//		queue2.clear();
		
		
//		Program 4 - count the number of elements in a priority queue.
		
		System.out.println("The queue has "+queue.size()+" elements");
		
//		Program 5 - retrieve the first element of the priority queue.
		
		System.out.println("The first color of queue is "+queue.peek());
		
		
//		Program 6 - remove the first element.


		queue.remove(queue.peek());
//		OR
		queue.poll();
		System.out.println(queue);
		
//		Program 7 - convert a priority queue to an array containing all its elements.
		
		List<String> list=new ArrayList<String>(queue);
		System.out.println(list);
		
//		Program 8 - convert a Priority Queue element to string representations.
		
		String str=queue.toString();
		System.out.println(str);
		
		
//		Program 9 - change priorityQueue to maximum priority queue.

        PriorityQueue<String> maxPriority=new PriorityQueue<>(Collections.reverseOrder());
        
        for(String s:queue) {
			maxPriority.add(s);
		}
        
        System.out.println(maxPriority);
        
//      Program 10 - compare two priority queues. 
        
        for(String s:queue) {
			if(maxPriority.contains(s)) {
				System.out.println("queue contains "+s);
			}
			else {
				System.out.println("queue not contains "+s);
			}
		}
        
          
		

	}

}
