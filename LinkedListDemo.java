package gnc;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> courses = new LinkedList<>();
		courses.add(new String("C"));
		courses.add(new String("C++"));
		courses.add(new String("Java"));
		courses.add(new String(".Net"));
		courses.add(new String("XML"));
		
		System.out.println(courses);
		
		ListIterator<String> iter = courses.listIterator();
		while(iter.hasNext()) {
			String course = iter.next();
			if(course.equals("C++"))
				iter.add("Oracle");
		}
		
		System.out.println(courses);
/*		
		System.out.println("Reverse");
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
		*/
	}

}
