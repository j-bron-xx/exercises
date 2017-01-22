package math;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-22.
 * <p/>
 * https://www.hackerrank.com/challenges/ctci-big-o
 */
public class PrimalitySimple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		for (int a0 = 0; a0 < p; a0++) {
			int n = in.nextInt();
			if (calc(n)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}
	}

	static boolean calc(int n) {
		if (n <= 1) return false;
		if (n <= 3) return true;
		if (n % 2 == 0) return false;
		if (n % 3 == 0) return false;

		int i = 5;
		//have to check only to sqrt(n)
		while (i * i <= n) {
			//all possible primes represented by: 6k +-
			//since starting with i=5, so 6k - 1 = 5, for k=1
			if (n % i == 0) return false;
			//6k + 1 = 7, so +2 needed (i=5)
			if (n % (i + 2) == 0) return false;
			i += 6;
		}

		return true;
	}
}
