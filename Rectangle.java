package cj;

public class Rectangle implements Shape {

	@Override
	public float area(float a) {
		return 0;
	}

	@Override
	public float area(float length, float breadth) {
		System.out.println("Rectangle area");
		return length * breadth;
	}

}
