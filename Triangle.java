package cj;

public class Triangle implements Shape {

	@Override
	public float area(float a) {
		return 0;
	}

	@Override
	public float area(float base, float height) {
		System.out.println("Triangle area");
		return 0.5f * base * height;
	}
	
	public void hi() {
		System.out.println("Hi from Traingle class");
	}

}
