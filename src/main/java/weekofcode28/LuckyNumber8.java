package weekofcode28;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by broniowj on 2017-01-11.
 * <p/>
 * https://www.hackerrank.com/contests/w28/challenges/lucky-number-eight
 * todo: solve
 */
public class LuckyNumber8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String number = in.next();

		long calc = calc(number, n);
		long result = calc % 1000000007;
		System.out.println(result);
	}

	static long calc(String number, int n) {
		long counter = 0;
		long poss3 = (long) Math.pow(2, n-3);

		if (n == 2) {
			int val1 = Integer.valueOf(number);
			int val2 = Integer.valueOf(number.substring(1, 2) + number.substring(0, 1));
			if (val1 % 8 == 0) counter++;
			if (val2 % 8 == 0) counter++;
			return counter;
		}

		if (n == 3) {
			int val1 = Integer.valueOf(number);
			int val2 = Integer.valueOf(number.substring(0, 1) + number.substring(2, 3) + number.substring(1, 2));
			int val3 = Integer.valueOf(number.substring(1, 2) + number.substring(0, 1) + number.substring(2, 3));
			int val4 = Integer.valueOf(number.substring(1, 2) + number.substring(2, 3) + number.substring(0, 1));
			int val5 = Integer.valueOf(number.substring(2, 3) + number.substring(1, 2) + number.substring(0, 1));
			int val6 = Integer.valueOf(number.substring(2, 3) + number.substring(0, 1) + number.substring(1, 2));
			int val7 = Integer.valueOf(number.substring(0, 1) + number.substring(1, 2));
			int val8 = Integer.valueOf(number.substring(0, 1) + number.substring(2, 3));
			int val9 = Integer.valueOf(number.substring(1, 2) + number.substring(0, 1));
			int val10 = Integer.valueOf(number.substring(1, 2) + number.substring(2, 3));
			int val11 = Integer.valueOf(number.substring(2, 3) + number.substring(0, 1));
			int val12 = Integer.valueOf(number.substring(2, 3) + number.substring(1, 2));
			if (val1 % 8 == 0) counter++;
			if (val2 % 8 == 0) counter++;
			if (val3 % 8 == 0) counter++;
			if (val4 % 8 == 0) counter++;
			if (val5 % 8 == 0) counter++;
			if (val6 % 8 == 0) counter++;
			if (val7 % 8 == 0) counter++;
			if (val8 % 8 == 0) counter++;
			if (val9 % 8 == 0) counter++;
			if (val10 % 8 == 0) counter++;
			if (val11 % 8 == 0) counter++;
			if (val12 % 8 == 0) counter++;
			return counter;
		}


		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1; j++) {
				for (int k = 0; k < n-1; k++) {
					if (i != j && i != k && j != k) {
						String sub3 = number.substring(i, i + 1);
						String sub2 = number.substring(j, j + 1);
						String sub1 = number.substring(k, k + 1);
						Integer val = Integer.valueOf(sub3 + sub2 + sub1);
						if (val % 8 == 0) counter += poss3;
					}
				}
			}
		}
		return counter;
	}
}
