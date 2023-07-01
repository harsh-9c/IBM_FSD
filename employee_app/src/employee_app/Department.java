package employee_app;

public class Department {
	
	private String departmentName;
	public Location location;
	
	
	
	
	public Department(String departmentName, Location location) {
		this.departmentName = departmentName;
		this.location = location;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", location=" + location + "]";
	}
	

	
	

}
