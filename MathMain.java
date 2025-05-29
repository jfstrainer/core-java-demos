package streamapi;

public class MathMain {

	public static void main(String[] args) {
		MathOperations a = (x, y) -> x + y;	// single line expression
		MathOperations s = (x, y) -> x - y;
		MathOperations m = (x, y) -> x * y;
		MathOperations d = (x, y) -> {		// multi-line expression
			if(y == 0)
				return 0;
			else
				return x / y;
		};

		System.out.println("Addition = "+ a.calculate(10, 5));
		System.out.println("Substraction = "+ s.calculate(10, 5));
		System.out.println("Multiplication = "+ m.calculate(10, 5));
		System.out.println("Division = "+ d.calculate(10, 5));
		
	}

}
