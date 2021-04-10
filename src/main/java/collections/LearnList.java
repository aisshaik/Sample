package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		System.out.println(al);
				al.add("reytye");
		al.add("745");
		al.add("hfuey");
		al.add(2, "uie");
		al.set(1, "Aisha");
		System.out.println(al);
		List<String> all = new LinkedList<String>();
		all.addAll(al);
		System.out.println(all.subList(2, 3));
		System.out.println(all);
		Collections.sort(all);
		System.out.println(all);
	}

}
