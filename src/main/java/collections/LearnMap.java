package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {
	public static void main(String[] args) {
		Map<Character, Integer> am = new HashMap<Character, Integer>();
		am.put('o', 1);
		am.put('a', 0);
		am.put('c', 10);
		for(Entry<Character, Integer> as : am.entrySet()) {
			System.out.println(as);
		}
		System.out.println(am.entrySet());
		Map<Character, Integer> am1 = new TreeMap<Character, Integer>();
		am1.put('o', 8);
		am1.put('i', 90);
		Map<Character, Integer> am2 = new LinkedHashMap<Character, Integer>();
		am2.put('v', 7);
		am2.put('u', 7);
		System.out.println(am);
		System.out.println(am1);
		System.out.println(am2);
	
		}
}
