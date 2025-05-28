package excp;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
				
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno");
		int rno = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter marks");
		float marks = sc.nextFloat();
		s.setRno(rno);
		s.setName(name);
		try {
			s.setMarks(marks);
			System.out.println(s);
		} catch (MaxMarksException e) {
			System.out.println(e.getMessage());
		} 	
	}

}
