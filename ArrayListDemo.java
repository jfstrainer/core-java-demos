package gnc;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> books = new ArrayList<>();
		books.add(new String("C"));
		books.add(new String("C++"));
		books.add(new String("Oracle"));
		books.add(new String("Java"));
		books.add(new String(".Net"));
	
		System.out.println(books);
		
//		System.out.println("4th element : "+books.get(3));
		
		Iterator<String> iter = books.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		iter.remove();
		
		System.out.println(books);
		
	}

}
