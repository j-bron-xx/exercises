package paths.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-02-27.
 * <p/>
 * https://www.hackerrank.com/challenges/runningtime
 */
public class InsertionSortRunningTime {

	public static void insertionSort(int[] A) {
		int swapCounter = 0;

		for (int i = 1; i < A.length; i++) {
			int temp = A[i];
			int index = i;
			for (int j = i - 1; j >= 0 && temp < A[j]; j--) {
				A[j + 1] = A[j];
				index = j;
				swapCounter++;
			}
			A[index] = temp;
		}
		System.out.println(swapCounter);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		insertionSort(ar);
	}
}
