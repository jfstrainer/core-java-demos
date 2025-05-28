package gnc;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return this.id - emp.id;
	}

}
