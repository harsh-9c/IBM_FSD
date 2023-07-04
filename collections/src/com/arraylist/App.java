package com.arraylist;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
		
//		program 1   create array list
		
		List<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("yellow");
		
		System.out.println(colors);	
		
//		program 2  Iterate through array list
		
		for(String str:colors) {
			System.out.println(str);
		}
		
		
//		Program 3   insert element at first position
		
		colors.add(0,"violet");
		
//		Program 4    retrieve an element from particular index
		
		System.out.println(colors.get(0));
		
//		Program 5     update element at particular index
		
		colors.set(1,"white");
		System.out.println(colors);	
		
//		Program 6     remove third element 
		
		colors.remove(2);
		
//		Program 7     search an element
		
		boolean found=colors.contains("blue");
		System.out.println("Blue color found: "+found);	
		
//		Program 8     sorting
		
		Collections.sort(colors);
		System.out.println(colors);	
		
		
//		Program 9     copy one array list into another
		
		List<String> colors_copy=new ArrayList<String>();
		Collections.copy(colors, colors_copy);
		
//		Program 10     shuffle elements in array list
		
		Collections.shuffle(colors);
		
//		Program 11     reverse array list
		
		Collections.reverse(colors);
		
//		Program 12     extract a portion of an array list
		
		List<String> sub_list=colors.subList(0, 2);
		System.out.println(sub_list);	
		
		
//		Program 13      compare two array lists
		
		List<String> compare=new ArrayList<String>();
		for(String str:colors) {
			if(colors_copy.contains(str)) {
				compare.add("Yes");
			}
			else compare.add("No");
		}
		
		System.out.println(compare);	
		
		
//		Program 14      swaps two elements in an array list
		
		Collections.swap(colors, 0,2);
		
//		Program 15       joined two array list
		
		List<String> joined_array_list=new ArrayList<String>();
		joined_array_list.addAll(colors);
		joined_array_list.addAll(colors_copy);
		System.out.println(joined_array_list);	
		
//		Program 16      clone an array list to another array list
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		ArrayList<String> cloned_list=(ArrayList<String>)list.clone();
		System.out.println(list + "\n" + cloned_list);	
		
		
//		Program 17     empty an array list
		
		cloned_list.removeAll(cloned_list);
		
		
//		Program 18     test whether an array list is empty or not
		
		if(cloned_list.isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List is not empty");
		}
		
//		Program 19     trim the capacity of an array list
		
		list.trimToSize();
		
//		Program 20     increase an array list size.
		
		list.ensureCapacity(10);
		list.add("how");
		list.add("are");
		list.add("you?");
		
		
//		Program 21     replace the second element of an ArrayList with the specified element
		
		list.set(1, "brother");
		System.out.println(list);	
		
		
//		Program 22     print all the elements of an ArrayList using the elements' position
		 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
