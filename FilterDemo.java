package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
/*
		 ArrayList<Employee> empList = new ArrayList<>();
	     empList.add(new Employee("Peter", "Admin", 26500));
	     empList.add(new Employee("Zara", "Security", 17500));
	     empList.add(new Employee("Smith", "Accounts", 23000));
	     empList.add(new Employee("Mike", "Sales", 20500));
	     empList.add(new Employee("Mike", "Sales", 27000));

	     empList.stream().filter(emp -> emp.getSalary() > 25000).forEach(System.out::println);
	     */
/*	     
	     List<String> sList = Stream.of("bus", "car", "bike", "flight", "train")
         .filter(e -> e.length() > 3)
         .peek(e -> System.out.println("Filtered value: " + e))	// auto	flight	train
         .map(String::toUpperCase)
         .peek(e -> System.out.println("Transformed value: " + e))	// AUTO	FLIGHT	TRAIN
         .collect(Collectors.toList());
	     
	     System.out.println(sList);
	*/     
/*		
		Stream.of("bus", "car", "bycycle", "bus", "car", "car", "bike")
        .distinct()
        .forEach(System.out::println);
*/
//		Stream.of("bus", "car", "bicycle", "flight", "train").limit(3).forEach(System.out::println);
		
//		Stream.of("bus", "car", "bicycle", "flight", "train").skip(3).forEach(System.out::println);
/*		
		Stream.of("bus", "car", "bicycle", "flight", "train")
		.sorted()
		.forEach(System.out::println);
*/
		Stream.of(10,20,22,12,14).reduce((x,y)->x+y).ifPresent(System.out::println);

		Integer res = Stream.of(10,20,22,12,14).reduce(1000, Integer::sum);
		System.out.println(res);
		
	}

}
