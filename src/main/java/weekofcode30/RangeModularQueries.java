package weekofcode30;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-03-18.
 * <p/>
 * https://www.hackerrank.com/contests/w30/challenges/range-modular-queries
 */
public class RangeModularQueries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		for (int a0 = 0; a0 < q; a0++) {
			int left = in.nextInt();
			int right = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			int counter = 0;

			for (int i = left; i <= right; i++) {
				BigInteger X = BigInteger.valueOf(x);
				// if gcd(ai, x) = gcd(y, x)    [relation ai = y + kx  ===>  gcd... = gcd...]
				if (BigInteger.valueOf(y).gcd(X).equals(BigInteger.valueOf(a[i]).gcd(X))) {
					if (a[i] % x == y) counter++;
				}
			}
			System.out.println(counter);
		}
	}
}
