package cj;

public interface Shape {
	final float PI = 3.14f;
	float area(float a);
	float area(float a, float b);
	default void hiii() { }
	static void hello() {
		System.out.println("static defined method");
	}
	default void hai() {
		System.out.println("default defined method");
	}
}
