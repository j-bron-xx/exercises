package weekofcode30;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-03-19.
 * <p/>
 * https://www.hackerrank.com/contests/w30/challenges/substring-queries
 */
public class SubstringQueries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		String[] s = new String[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.next();
		}
		for (int a0 = 0; a0 < q; a0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			String[] s1 = s[x].split("");
			String[] s2 = s[y].split("");
			int[][] table = new int[s1.length][s2.length];
			int biggest = 0;

			for (int i = 0; i < s1.length; i++) {
				for (int j = 0; j < s2.length; j++) {
					int previous = 0;

					int previ= i-1;
					int prevj = j-1;
					if (previ > 0 && prevj > 0) {
						previous = table[previ][prevj];
					}

					if (s1[i].equals(s2[j])) {
						table[i][j] = 1 + previous;
						if (biggest < 1 + previous) {
							biggest = 1 + previous;
						}
					}
				}
			}
			System.out.println(biggest);
		}
	}

}
