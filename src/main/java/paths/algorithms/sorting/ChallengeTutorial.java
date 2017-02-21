package paths.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-02-20.
 *
 * https://www.hackerrank.com/challenges/tutorial-intro
 */
public class ChallengeTutorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int searched = in.nextInt();
		int length = in.nextInt();
		int [] sortedNumbers = new int[length];
		for (int i = 0; i < length; i++) {
			sortedNumbers[i] = in.nextInt();
			if (sortedNumbers[i] == searched) System.out.println(i);
		}

	}
}
