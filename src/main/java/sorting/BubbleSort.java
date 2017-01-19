package sorting;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-19.
 * <p/>
 * https://www.hackerrank.com/challenges/ctci-bubble-sort
 */
public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		bsort(a);
	}

	private static void bsort(int[] a) {
		int totalNumberOfSwaps = 0;

		for (int i = 0; i < a.length - 1; i++) {
			// Track number of elements swapped during a single array traversal
			int numberOfSwaps = 0;

			for (int j = 0; j < a.length - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					numberOfSwaps++;
				}
			}
			totalNumberOfSwaps += numberOfSwaps;
			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}
		System.out.println("Array is sorted in " + totalNumberOfSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);
	}
}
