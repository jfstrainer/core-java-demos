package cj;

public class MOverload {

	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public float sum(float a, float b) {
		return a+b;
	}
	public double sum(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		MOverload m = new MOverload();
		System.out.println("Sum of 2 doubles : "+m.sum(1.5, 2.1));
		System.out.println("Sum of 3 ints : "+m.sum(10, 20, 30));
		System.out.println("Sum of 2 ints : "+m.sum(10, 20));
		System.out.println("Sum of 2 floats : "+m.sum(2.4f, 4.6f));
	}

}
