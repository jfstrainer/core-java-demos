package gnc;

import adnl.Student;

public class SampleMain {

	public static void main(String[] args) {
		SampleStack<String> s = new SampleStack<String>();
		s.push("Hello");
		System.out.println("String value : "+s.pop());

		SampleStack<Integer> i = new SampleStack<Integer>();
		i.push(100);
		System.out.println("Integer value : "+i.pop());
		
		SampleStack<Student> st = new SampleStack<Student>();
		st.push(new Student(101, "Smith", 86.75f));
		System.out.println(st.pop());
		
	}

}
