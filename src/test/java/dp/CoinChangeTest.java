package dp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CoinChangeTest {

	@Test
	public void test() {
		CoinChange coinChange = new CoinChange();
		int[] c = new int[3];
		c[0] = 1;
		c[1] = 2;
		c[2] = 3;
		coinChange.minCoin = 1;
		coinChange.coins = c;
		int calc = coinChange.calc(4);
		assertEquals(4, calc);
	}


	@Test
	public void test2() {
		CoinChange coinChange = new CoinChange();
		int[] c = new int[3];
		c[0] = 1;
		c[1] = 2;
		c[2] = 4;
		coinChange.minCoin = 1;
		coinChange.coins = c;
		int calc = coinChange.calc(6);
		assertEquals(5, calc);
	}


}