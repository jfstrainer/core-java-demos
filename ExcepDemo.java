package cj;

public class ExcepDemo {

	public static void main(String[] args) {
		try {

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("Result : "+c);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(e.toString());
		}
		catch(Exception e) {
			System.out.println("ERROR : "+e.toString());
		}
		finally {
			System.out.println("Done");
		}
	}

}
