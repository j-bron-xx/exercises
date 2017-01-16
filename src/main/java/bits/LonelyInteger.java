package bits;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-10.
 *
 * https://www.hackerrank.com/challenges/ctci-lonely-integer
 */
public class LonelyInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int number = 0;
		for(int a_i=0; a_i < n; a_i++){
			number = number ^ in.nextInt();
		}
		System.out.println(number);
	}
}
