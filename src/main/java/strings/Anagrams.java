package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by broniowj on 2017-01-08.
 */
public class Anagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

	static int numberNeeded(String a, String b) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			Integer val = map.get(c);
			if (val == null) {
				map.put(c, 1);
			} else {
				map.put(c, val+1);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			Integer val = map.get(c);
			if (val == null) {
				map.put(c, -1);
			} else {
				map.put(c, val-1);
			}
		}
		int deletions = 0;
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for (Map.Entry<Character, Integer> e : entries) {
			Integer value = e.getValue();
			if (value != 0) {
				if (value < 0) value = -value;
				deletions = deletions + value;
			}
		}
		return deletions;
	}
}
