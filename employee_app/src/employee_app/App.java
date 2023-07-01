package employee_app;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
		      System.out.println("1. Add employee");
		      System.out.println("2. Display employees");
		      System.out.println("3. Update employee by id");
		      System.out.println("4. Find employee by id");
		      System.out.println("5. Remove employee by name");
		      System.out.println("0. Exit");
		      choice=sc.nextInt();
		      switch(choice){
		      case 1:  
		    	  Employee employee=EmployeeFactory.createEmployee();
		    	  System.out.println("Employee created successfully");
		          break;
		      case 2:
		    	  EmployeeFactory.displayEmployees();
		          break;
		      case 3:
		    	  System.out.println("Enter employee id: ");
		          String id=sc.next();
		    	  EmployeeFactory.updateEmployee(id);
		          break;
		      case 4:
		    	  System.out.println("Enter employee id: ");
		          String id2=sc.next();
		          EmployeeFactory.findEmployee(id2);
		    	  break;
		      case 5:
		    	  System.out.println("Enter employee name: ");
		          String name=sc.next();
		          EmployeeFactory.updateEmployee(name);
		    	  break;  
		      default:
					System.out.println("Invalid Choice.... Try Again..");
					break;
		      
		      }
		}
		while(choice!=0);
		

	}

}
