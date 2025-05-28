package excp;

public class Student {

	private int rno;
	private String name;
	private float marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rno, String name, float marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) throws MaxMarksException {
		if(marks > 100)
			throw new MaxMarksException("Marks cannot exceed max marks (100)");
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", marks=" + marks + "]";
	}

}
