package weekofcode28;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-09.
 *
 * https://www.hackerrank.com/contests/w28/challenges/boat-trip
 */
public class BoatTrips {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		int m = in.nextInt();
		int pmax = 0;
		int capacitymax = c * m;
		int pcurr;
		for (int p_i = 0; p_i < n; p_i++) {
			pcurr = in.nextInt();
			if (pcurr > pmax) pmax = pcurr;
		}
		if (pmax <= capacitymax) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
