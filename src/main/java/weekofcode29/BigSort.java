package weekofcode29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-02-21.
 * <p/>
 * https://www.hackerrank.com/contests/w29/challenges/big-sorting
 */
public class BigSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> unsorted = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			unsorted.add(i, in.next());
		}

		Comparator<String> comp = (o1, o2) -> {
			if (o1.length() > o2.length()) return 2;
			if (o1.length() < o2.length()) return -2;

			for (int i = 0; i < o1.length(); i++) {
				Integer o1val = Integer.valueOf(String.valueOf(o1.charAt(i)));
				Integer o2val = Integer.valueOf(String.valueOf(o2.charAt(i)));
				if (o1val > o2val) {
					return 1;
				} else if (o1val < o2val) {
					return -1;
				}
			}
			return -1;
		};

		unsorted.sort(comp);

		unsorted.forEach(System.out::println);

	}
}
