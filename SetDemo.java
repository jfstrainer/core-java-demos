package gnc;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	
		HashSet<String> books = new HashSet<>();
		books.add(new String("HTML"));
		books.add(new String("XML"));
		books.add(new String("SQL"));
		books.add(new String("JAVA"));
		
		System.out.println(books);
		
		
/*		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(56);
		hs.add(23);
		hs.add(84);
		hs.add(39);
		hs.add(72);
		
		System.out.println("Size : "+hs.size());		
		System.out.println("HashSet, unordered : "+hs);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(56);
		lhs.add(23);
		lhs.add(84);
		lhs.add(39);
		lhs.add(72);
		
		System.out.println("Size : "+lhs.size());		
		System.out.println("LinkedHashSet, ordered : "+lhs);
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(56);
		ts.add(23);
		ts.add(84);
		ts.add(39);
		ts.add(72);
		
		System.out.println("Size : "+ts.size());		
		System.out.println("TreeSet, sorted : "+ts);
*/
	}

}
