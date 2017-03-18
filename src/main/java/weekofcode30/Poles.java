package weekofcode30;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-03-18.
 * <p/>
 * https://www.hackerrank.com/contests/w30/challenges/poles
 */
public class Poles {

	public static void main(String[] args) {
		List<Pole> poles = new LinkedList<>();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int x_i = in.nextInt();
			int w_i = in.nextInt();
			poles.add(new Pole(w_i, x_i));
		}

		long result = 0;

		while (poles.size() > k) {
			long bestRemoval = Long.MAX_VALUE;
			int bestIndex = -1;
			for (int i = 1; i < poles.size(); i++) {
				long altitude = poles.get(i).altitude;
				long weight = poles.get(i).weight;
				long prevAltitude = poles.get(i - 1).altitude;
				long removal = weight * (altitude - prevAltitude);
				if (removal < bestRemoval) {
					bestRemoval = removal;
					bestIndex = i;
				}
			}
			long weight = poles.get(bestIndex).weight;
			poles.get(bestIndex - 1).weight += weight;
			poles.remove(bestIndex);
			result += bestRemoval;
		}

		System.out.println(result);
	}

	static class Pole {
		int weight;
		int altitude;

		public Pole(int weight, int altitude) {
			this.weight = weight;
			this.altitude = altitude;
		}
	}
}
