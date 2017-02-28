package weekofcode29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by broniowj on 2017-02-23.
 * <p/>
 * https://www.hackerrank.com/contests/w29/challenges/megaprime-numbers
 */
public class MegaPrimeNumbers {
	static List<Character> nonPrimeDigits = Arrays.asList('0', '1', '4', '6', '8', '9');//2 3 5 7

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long first = in.nextLong();
		long last = in.nextLong();
		long counter = 0;

		Set<Long> notPrimes = new HashSet<>();

		for (long n = 2; n < first; n++) {
			if (!notPrimes.contains(n)) {
				if (isPrime(n)) {
					for (long j = n + n; j <= last; j += n) {
						if (j > first)
							notPrimes.add(j);
					}
				}

			}
		}

		List<Long> toSearchIn = new ArrayList<>();
		for (long i = first; i <= last; i++) {
			toSearchIn.add(i);
		}
		toSearchIn.removeAll(notPrimes);


		Map<Long, Integer> isMegaPrimeMap = new HashMap<>();
		for (Long n : toSearchIn) {

//			if (isMegaPrimeMap.getOrDefault(n, 0) == 0) {
				if (areDigitsPrime(String.valueOf(n)) && isPrime(n)) //{
//					isMegaPrimeMap.put(n, 10);
					counter++;
//				} else {
//					isMegaPrimeMap.put(n, 1);
//				}

//				for (long j = n + n; j <= last; j += n) {
//					isMegaPrimeMap.put(j, 1);
//				}

//			}

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
