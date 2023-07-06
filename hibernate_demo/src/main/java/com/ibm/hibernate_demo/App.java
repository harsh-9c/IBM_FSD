package com.ibm.hibernate_demo;



import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.ibm.*;
import com.ibm.hibernate_demo.model.Inventory;
import com.ibm.hibernate_demo.service.InventoryService;
import com.ibm.hibernate_demo.service.InventoryServiceImpl;



public class App {
	
    public static void main( String[] args ) {
    	
    	try {
      	  
    		InventoryService service=new InventoryServiceImpl();
      	    
      	    
      	  Scanner sc=new Scanner(System.in);
			
			int choice=0;
			
			do {
				System.out.println("1. Create Inventory");
				System.out.println("2. Display all inventories");
//				System.out.println("3. Find customer by Id");
//				System.out.println("4. Find customer by first name");	
//				System.out.println("5. Update customer by Id");
//				System.out.println("6. Delete customer by Id");
//				System.out.println("7. Delete all customers");
//				System.out.println("0. Close the session");
				System.out.println("\nEnter your choice: ");
				choice=sc.nextInt();
				
				switch (choice) {
				
				case 1:
					System.out.println("Enter inventory id: ");
					int iId1=sc.nextInt();
					System.out.println("Enter product id: ");
					int pId1=sc.nextInt();
					System.out.println("Enter product name: ");
					String name1=sc.next();
					System.out.println("Enter total pieces: ");
					int totalPieces1=sc.nextInt();
					Inventory i =service.createInventory(new Inventory(iId1,pId1,name1,totalPieces1));
					System.out.println("Inventory created: "+i);
					break;
					
				case 2: 
					System.out.println("All the inventories are given below:\n");
					List<Inventory>list=service.getAllInventory();
					for(Inventory inv:list) {
						System.out.println(inv);
					}
					
					
				case 0:
					System.out.println("Session ended");
					System.exit(1);
								
				default:
					System.out.println("Invalid choice!");
					break;
				
				
				
				
				}
				
				
				
				
				
			} while(choice!=0);
			
			
			
			
  		
  	} catch (Exception e) {
  		
  		e.printStackTrace();
  	}
        
    	
    	
    	
    }
}
