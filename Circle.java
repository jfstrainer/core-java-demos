package cj;

public class Circle implements Shape {

	@Override
	public float area(float r) {
		System.out.println("Circle area called");
		return PI * r * r;
	}

	@Override
	public float area(float a, float b) {
		return 0;
	}

}
