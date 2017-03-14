package weekofcode30;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-03-14.
 *
 * https://www.hackerrank.com/contests/w30/challenges/find-the-minimum-number
 */
public class FindMinimumNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		StringBuilder sb = new StringBuilder();
		sb.append("min(int, int)");

		for (int i = 2; i < n; i++) {
			sb.insert(0, "min(int, ");
			sb.append(")");
		}

		System.out.println(sb.toString());
	}
}
