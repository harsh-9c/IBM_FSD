package employee_app;

import java.util.*;

public class EmployeeFactory {
	
	static Scanner sc=new Scanner(System.in);
	static Vector<Employee>v=new Vector<>();
	
	public static Employee createEmployee() {
		System.out.println("Enter employee name: ");
		String name=sc.next();
		System.out.println("Enter employee salary: ");
		int salary=sc.nextInt();
		Department department=createDepartment();
		Employee e=new Employee(name,salary,department);
		v.add(e);
		return e;
		
	}
	
	public static Department createDepartment() {
		System.out.println("Enter department: ");
		String departmentName=sc.next();
		Location location=createLocation();
		Department department=new Department(departmentName,location);
		return department;
	}
	
	public static Location createLocation() {
		System.out.println("Enter location: ");
		String locationName=sc.next();
		System.out.println("Enter city: ");
		String cityName=sc.next();
		System.out.println("Enter zipcode: ");
		int zipcode=sc.nextInt();
		Location l=new Location(locationName,cityName,zipcode);
		return l;
	}
	
	public static void findEmployee(String id) {
		boolean f=false;
		for(Employee e:v) {
			if(e.getEmployeeId().equals(id)) {
				System.out.println("Employee found: "+e);
				f=true; break;
			}
		}
		if(!f) {
			System.out.println("Employee not found!");
		}
	}
	
	public static void removeEmployee(String name) {
		boolean f=false;
		Vector<Employee>employeeToBeRemoved=new Vector<>();
		for(Employee e:v) {
			if(e.getEmployeeName().equals(name)) {
				f=true;
				employeeToBeRemoved.add(e);
			}
		}
		if(f) {
			v.removeAll(employeeToBeRemoved);
			System.out.println("Employee removed successfully");
		}
	}
	
	public static void updateEmployee(String id) {
		Employee employee=null;
		for(Employee e:v) {
			if(e.getEmployeeId().equals(id)) {
				employee=e;

			}
		}
		
		System.out.println("Enter employee name: ");
		String name=sc.next();
		System.out.println("Enter employee salary: ");
		int salary=sc.nextInt();
		Department dept=createDepartment();
		Location loc=createLocation();
			
		employee.setEmployeeName(name);
		employee.setEmployeeSalary(salary);
		employee.setDepartment(dept);
		dept.setLocation(loc);
		
	}
	
	public static void displayEmployees() {
		
		for(Employee e:v) {
			System.out.println(e);
		}
		
	}
	

}
