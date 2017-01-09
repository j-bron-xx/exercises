package stacksqueues;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-08.
 * <p/>
 * https://www.hackerrank.com/challenges/ctci-find-the-running-median
 */
public class RunningMedianArray {
	ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		double median;
		RunningMedianArray runningMedian = new RunningMedianArray();
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
			median = runningMedian.add(a[a_i]);
			System.out.println(median);
		}
	}

	double add(int a) {
		updateList(a);

		int size = list.size();

		if (size == 1) return list.get(0);
		if (size % 2 == 1) return list.get((size - 1) / 2);

		return ((double) list.get((size / 2) - 1) + (double) list.get(size / 2)) / 2;
	}

	void updateList(int a) {
		boolean inserted = false;
		for (int i = 0; i < list.size(); i++) {
			if (a <= list.get(i)) {
				list.add(i, a);
				inserted = true;
				break;
			}
		}
		if (!inserted) list.add(list.size(), a);
	}

}
