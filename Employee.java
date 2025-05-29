package streamapi;

public class Employee {

	private String name;
	private String dept;
	private double salary;
	
	public Employee() { }
	
	public Employee(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
