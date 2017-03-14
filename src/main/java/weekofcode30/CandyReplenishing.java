package weekofcode30;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-03-14.
 * <p/>
 * https://www.hackerrank.com/contests/w30/challenges/candy-replenishing-robot
 */
public class CandyReplenishing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int replenished = 0;
		int n = in.nextInt();
		int bowl = n;
		int t = in.nextInt();
		int c;
		for (int c_i = 0; c_i < t - 1; c_i++) {
			c = in.nextInt();
			bowl -= c;
			if (bowl < 5) {
				replenished += n - bowl;
				bowl = n;
			}
		}
		System.out.println(replenished);
	}
}
