package weekofcode30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-03-15.
 * <p/>
 * https://www.hackerrank.com/contests/w30/challenges/melodious-password
 */
public class MelodiousPassword {
	static List<String> vowels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
	static List<String> consonants = new ArrayList<>(
			Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"));
	static int n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		List<String> memory = new ArrayList<>(Arrays.asList(""));
		for (int i = 0; i < n; i++) {
			List<String> temp = new ArrayList<>();
			for (String m : memory) {
				if (i % 2 == 0) temp.addAll(addVowel(m));
				if (i % 2 == 1) temp.addAll(addConsonant(m));
			}
			for (String t : temp) {
				System.out.println(t);
			}
			memory = temp;
		}

		memory = new ArrayList<>(Arrays.asList(""));
		for (int i = 0; i < n; i++) {
			List<String> temp = new ArrayList<>();
			for (String m : memory) {
				if (i % 2 == 1) temp.addAll(addVowel(m));
				if (i % 2 == 0) temp.addAll(addConsonant(m));
			}
			for (String t : temp) {
				System.out.println(t);
			}
			memory = temp;
		}
	}

	static List<String> addVowel(String s) {
		List<String> vs = new ArrayList<>();
		for (String v : vowels) {
			vs.add(s + v);
		}
		return vs;
	}

	static List<String> addConsonant(String s) {
		List<String> cs = new ArrayList<>();
		for (String c : consonants) {
			cs.add(s + c);
		}
		return cs;
	}
}
