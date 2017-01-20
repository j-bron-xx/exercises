package structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-20.
 * <p/>
 * https://www.hackerrank.com/challenges/ctci-ransom-note
 */
public class HashTableNote {
	Map<String, Integer> magazineMap = new HashMap<>();

	public HashTableNote(String magazine, String note) {
		String[] split = magazine.split(" ");
		for (String s : split) {
			int i = magazineMap.getOrDefault(s, 0);
			i++;
			magazineMap.put(s, i);
		}
		split = note.split(" ");
		for (String s : split) {
			int i = magazineMap.getOrDefault(s, 0);
			i--;
			magazineMap.put(s, i);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		scanner.nextLine();

		HashTableNote ransom = new HashTableNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = ransom.solve();

		if (answer) System.out.println("Yes");
		else System.out.println("No");

	}

	public boolean solve() {
		for (Integer val : magazineMap.values()) {
			if (val < 0) return false;
		}
		return true;
	}
}
