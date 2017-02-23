package weekofcode29;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-02-23.
 * <p/>
 * https://www.hackerrank.com/contests/w29/challenges/megaprime-numbers
 */
public class MegaPrimeNumbers {
	static List<Character> nonPrimeDigits = Arrays.asList('0', '1', '4', '6', '8', '9');

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long first = in.nextLong();
		long last = in.nextLong();
		long counter = 0;

		for (long n = first; n <= last; n++) {
			if (areDigitsPrime(String.valueOf(n)) && isPrime(n)) {
				counter++;
			}
		}

		System.out.println(counter);
	}

	static boolean areDigitsPrime(String s) {

		boolean matchNonPrime = s.chars()
		                         .mapToObj(i -> (char) i)
		                         .anyMatch(nonPrimeDigits::contains);

		return !matchNonPrime;
	}

	static boolean isPrime(long n) {
		if (n <= 1) return false;
		if (n <= 3) return true;
		if (n % 2 == 0) return false;
		if (n % 3 == 0) return false;

		int i = 5;
		//have to check only to sqrt(n)
		while (i * i <= n) {
			//all possible primes represented by: 6k +- 1
			//since starting with i=5, so 6k - 1 = 5, for k=1
			if (n % i == 0) return false;
			//6k + 1 = 7, so +2 needed (i=5)
			if (n % (i + 2) == 0) return false;
			i += 6;
		}

		return true;
	}
}
