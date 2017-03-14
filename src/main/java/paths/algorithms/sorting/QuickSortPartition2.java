package paths.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-03-11.
 *
 * https://www.hackerrank.com/challenges/quicksort2
 */
public class QuickSortPartition2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			numbers.add(in.nextInt());
		}

		quicksort(numbers);
	}

	static List<Integer> quicksort(List<Integer> numbers) {
		if (numbers.size() < 2) return numbers;

		List<Integer> smaller = new ArrayList<>();
		List<Integer> bigger = new ArrayList<>();
		List<Integer> equal = new ArrayList<>();

		int pivot = numbers.get(0);
		equal.add(pivot);

		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > pivot) {
				bigger.add(numbers.get(i));
			} else if (numbers.get(i) == pivot) {
				equal.add(numbers.get(i));
			} else {
				smaller.add(numbers.get(i));
			}
		}

		List<Integer> smallerSorted = quicksort(smaller);
		List<Integer> biggerSorted = quicksort(bigger);

		smallerSorted.addAll(equal);
		smallerSorted.addAll(biggerSorted);

		smallerSorted.forEach(i -> System.out.print(i + " "));
		System.out.println();

		return smallerSorted;
	}
}
