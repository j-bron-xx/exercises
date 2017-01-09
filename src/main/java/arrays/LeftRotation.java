package arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by broniowj on 2017-01-05.
 *
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 *
 * Given an array of n integers and a number d, perform d left rotations on the array.
 * Then print the updated array as a single line of space-separated integers.
 *
 * Constrains:
 * 1 <= n <= 10^5
 * 1 <= d <= n
 * 1 <= a[i] <= 10^6
 */
public class LeftRotation {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line1 = in.readLine();
		String line2 = in.readLine();
		LeftRotation leftRotation = new LeftRotation();
		int[] result = leftRotation.run(line1, line2);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < result.length; i++) {
			out.write(result[i] + " ");
		}
		out.flush();
	}

	int[] run(String argLine1, String argLine2) {
		int n = Integer.valueOf(argLine1.split(" ")[0]);
		int d = Integer.valueOf(argLine1.split(" ")[1]);

		String[] arrayVals = argLine2.split(" ");
		int[] array = new int[n];
		for(int i = 0; i < n; ++i) {
			array[i] = Integer.valueOf(arrayVals[i]);
		}

		return perform(n, d, array);
	}

	int[] perform(int n, int d, int[] array) {
		int[] newArray = new int[n];
		int newIndex;

		for (int i = 0; i < n; i++) {
			if (i < d) {
				newIndex = n - d + i;
			} else {
				newIndex = i - d;
			}
			newArray[newIndex] = array[i];
		}

		return newArray;
	}
}
