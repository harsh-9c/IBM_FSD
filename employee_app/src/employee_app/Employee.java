package employee_app;
import java.util.UUID;

public class Employee {
	
	private String employeeId;
	private String employeeName;
	private int employeeSalary;
	private Department department;
	
	
	public Employee(String employeeName, int employeeSalary, Department department) {
		this.employeeId = UUID.randomUUID().toString().substring(0, 8);
		this.employeeName = employeeName;
		if(employeeSalary<1000) {
			this.employeeSalary=1000;
		}
		else {
			this.employeeSalary = employeeSalary;
		}
		this.department = department;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", department=" + department + "]";
	}

	
		

}
