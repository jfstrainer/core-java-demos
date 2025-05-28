package cj;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape s;	// super type reference
		
		s = new Triangle();	// subtype to supertype, upcasting, implicitly
		System.out.println(s.area(6.2f, 10.5f));

		Triangle t = (Triangle)s;	// supertype to subtype, downcasting
		t.hi();
		
		s = new Rectangle(); // subtype to supertype, upcasting, implicitly
		System.out.println(s.area(5.6f, 4.8f));

		s = new Circle();
		System.out.println(s.area(4.2f));
		
		Shape.hello();
		s.hai();
		
	}

}
