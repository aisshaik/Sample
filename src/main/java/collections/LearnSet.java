package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class LearnSet {
	
	public static void main(String[] args) {
		Set<String> as = new HashSet<String>();
		
		
		as.add("Shannu");
		as.add("Aisha");
		as.add("753");
		System.out.println(as);
		
		Set<String> as1 = new TreeSet<String>();
		as1.add("Shannu");
		as1.add("753");
		as1.add("Aisha");
		
		System.out.println(as1);
		Set<String> as2 = new LinkedHashSet<String>();
		as2.add("753");
		as2.add("Shanu");
		as2.add("Aisha");
		System.out.println(as2);
		
	}
}
