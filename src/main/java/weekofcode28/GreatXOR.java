package weekofcode28;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-10.
 *
 * https://www.hackerrank.com/contests/w28/challenges/the-great-xor
 */
public class GreatXOR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		long combinations;
		boolean isFirstBitPassed = false;
		for(int a0 = 0; a0 < q; a0++){
			long x = in.nextLong();
			combinations = 0;
			isFirstBitPassed = false;
			for (int b = 63; b >= 0; b--) {
				if (isBitSet(b, x)) {
					isFirstBitPassed = true;
					continue;
				} else if (isFirstBitPassed) {
					combinations += Math.pow(2, b);
				}
			}
			System.out.println(combinations);
		}
	}

	public static boolean isBitSet(int position, long x) {
		return 1 == ((x >> position) & 1);
	}
}
