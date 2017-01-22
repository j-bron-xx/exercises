package search;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-22.
 * <p/>
 * https://www.hackerrank.com/challenges/ctci-ice-cream-parlor
 */
public class BinarySearchIceCream {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int m = in.nextInt();
			int n = in.nextInt();
			int a[] = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			System.out.println(calc(a, m));
		}
	}

	static String calc(int[] a, int m) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) continue;
				if (a[i] + a[j] == m) {
					if (a[i] <= a[j]) {
						return((i + 1) + " " + (j + 1));
					} else {
						return((j + 1) + " " + (i + 1));
					}
				}
			}
		}
		return "";
	}
}
