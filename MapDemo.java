package gnc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import adnl.Student;



public class MapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, Student> map = new TreeMap<>();
		map.put(103, new Student(103, "Peter", 92.25f));
		map.put(105, new Student(105, "Sam", 90.25f));
		map.put(101, new Student(101, "Smith", 86.25f));
		map.put(104, new Student(104, "Mike", 84.25f));
		map.put(102, new Student(102, "John", 78.65f));
		
		System.out.println(map);
		
/*		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno : ");
		int rno = sc.nextInt();
		
		if(map.containsKey(rno))	
			System.out.println(map.get(rno));
		else
			System.out.println("No student found with this rno : "+rno);
*/
/*		
		Set keys = map.keySet();	// returns only keys
		for(Object obj : keys) {
			System.out.println(obj);
		}
*/
/*		
		Set keys = map.entrySet();	// returns both key-value pairs
		for(Object obj : keys) {
			System.out.println(obj);
		}
	*/	
	}

}
