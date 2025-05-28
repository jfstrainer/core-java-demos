package gnc;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Smith", 24);
		Employee emp2 = new Employee(102, "John", 28);
		Employee emp3 = new Employee(103, "Sam", 25);
		Employee emp4 = new Employee(104, "Mike", 32);
		Employee emp5 = new Employee(105, "Peter", 36);
		
		ArrayList<Employee> empList = new ArrayList<>();
		
		empList.add(emp3);
		empList.add(emp5);
		empList.add(emp2);
		empList.add(emp1);
		empList.add(emp4);

		System.out.println("Before Sort : "+empList);
		
		Collections.sort(empList);
		
		System.out.println("After Sort by Id : "+empList);
		
		Collections.sort(empList, new NameComparator());
		
		System.out.println("After Sort by Name : "+empList);
		
		Collections.sort(empList, new AgeComparator());
		
		System.out.println("After Sort by Age : "+empList);
		
		
		
		
		
	}

}
