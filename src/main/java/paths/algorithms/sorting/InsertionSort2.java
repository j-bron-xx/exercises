package paths.algorithms.sorting;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-02-20.
 * <p/>
 * https://www.hackerrank.com/challenges/insertionsort2
 */
public class InsertionSort2 {
	static LinkedList<Integer> list = new LinkedList<>();

	public static void insertionSortPart2() {
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > list.get(i-1)) {
				printArray(list);
			} else {
				int moved = list.get(i);
				list.remove(i);
				for (int j = 0; j < i; j++) {
					if (list.get(j) >= moved) {
						list.add(j, moved);
						break;
					}
				}
				printArray(list);
			}
		}
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		for (int i = 0; i < s; i++) {
			list.add(in.nextInt());
		}
		insertionSortPart2();

	}

	private static void printArray(List<Integer> ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
