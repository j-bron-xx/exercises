package dp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by broniowj on 2017-01-09.
 * <p/>
 * https://www.hackerrank.com/challenges/ctci-coin-change
 * todo: pass all TCs
 */
public class CoinChange {
	int coins[];
	Map<Integer, Integer> cache = new HashMap<>();
	int minCoin = Integer.MAX_VALUE;

	public static void main(String[] args) {
		CoinChange cc = new CoinChange();

		Scanner in = new Scanner(System.in);
		int toChange = in.nextInt();
		int m = in.nextInt();
		cc.coins = new int[m];
		for (int coins_i = 0; coins_i < m; coins_i++) {
			cc.coins[coins_i] = in.nextInt();
			if (cc.coins[coins_i] < cc.minCoin) cc.minCoin = cc.coins[coins_i];
		}
		System.out.println(cc.calc(toChange));
	}

	int calc(int toChange) {
		if (toChange - minCoin == 0) return 1;
		if (toChange - minCoin < 0) return 0;

		int combinations = 0;

		Integer cached = cache.get(toChange);
		if (cached != null) return cached;

		for (int coin : coins) {
			if (coin == minCoin) continue;
			if (toChange - minCoin < coin) {
				combinations += calc(toChange - coin);
				combinations++;
			}
		}
		combinations += calc(toChange - minCoin);
		cache.put(toChange, combinations);

		return combinations;
	}
}
