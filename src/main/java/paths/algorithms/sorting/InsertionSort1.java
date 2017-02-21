package paths.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-02-20.
 * <p/>
 * https://www.hackerrank.com/challenges/insertionsort1
 */
public class InsertionSort1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
//		int[] ar2 = {1, 3, 5, 9, 13, 22, 27, 35, 46, 51, 55, 83, 87, 23};
//		int[] ar3 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
		insertIntoSorted(ar);
	}

	public static void insertIntoSorted(int[] ar) {
		if (ar.length < 2) {
			printArray(ar);
			return;
		}

		int inserted = ar[ar.length - 1];
		ar[ar.length - 1] = ar[ar.length - 2];

		for (int i = ar.length - 2; i >= 0; i--) {
			if (inserted < ar[i]) {
				if (i != 0) {
					ar[i + 1] = ar[i];
				} else {
					ar[i + 1] = ar[i];
					printArray(ar);
					ar[i] = inserted;
					break;
				}
			} else {
				ar[i + 1] = inserted;
				break;
			}
			printArray(ar);
		}
		printArray(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
