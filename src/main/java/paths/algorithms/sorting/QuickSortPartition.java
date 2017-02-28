package paths.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-02-27.
 * <p/>
 * https://www.hackerrank.com/challenges/quicksort1
 */
public class QuickSortPartition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] tt = new int[s];
		for (int i = 0; i < s; i++) {
			tt[i] = in.nextInt();
		}

		List<Integer> smaller = new ArrayList<>();
		List<Integer> bigger = new ArrayList<>();
		List<Integer> equal = new ArrayList<>();

		int pivot = tt[0];
		equal.add(pivot);

		for (int i = 1; i < tt.length; i++) {
			if (tt[i] > pivot) {
				bigger.add(tt[i]);
			} else if (tt[i] == pivot) {
				equal.add(tt[i]);
			} else {
				smaller.add(tt[i]);
			}
		}

		smaller.addAll(equal);
		smaller.addAll(bigger);

		smaller.forEach(i -> System.out.print(i+" "));
	}

}
