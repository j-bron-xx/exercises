package math;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-07.
 *
 * https://www.hackerrank.com/challenges/ctci-fibonacci-numbers
 */
public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		System.out.println(fibonacciNumbers.calculate(n));
	}

	int calculate(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;

		return calculate(n - 1) + calculate(n - 2);
	}
}
