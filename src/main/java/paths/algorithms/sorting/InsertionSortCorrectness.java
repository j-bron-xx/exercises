package paths.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-02-27.
 * <p/>
 * https://www.hackerrank.com/challenges/correctness-invariant
 */
public class InsertionSortCorrectness {

	public static void insertionSort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int value = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > value) {
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = value;
		}

		printArray(A);
	}


	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		int[] ar = new int[4];
//		for (int i = 0; i < n; i++) {
//			ar[i] = in.nextInt();
//		}
		ar[0]=20;
		ar[1]=10;
		ar[2]=7;
		ar[3]=2;

		insertionSort(ar);
	}
}
