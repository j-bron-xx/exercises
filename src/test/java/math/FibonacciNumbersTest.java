package math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by broniowj on 2017-01-07.
 */
@RunWith(JUnit4.class)
public class FibonacciNumbersTest {

	@Test
	public void testCalculate() {
		FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
		assertEquals(0, fibonacciNumbers.calculate(0));
		assertEquals(1, fibonacciNumbers.calculate(1));
		assertEquals(1, fibonacciNumbers.calculate(2));
		assertEquals(2, fibonacciNumbers.calculate(3));
		assertEquals(3, fibonacciNumbers.calculate(4));
		assertEquals(5, fibonacciNumbers.calculate(5));
		assertEquals(8, fibonacciNumbers.calculate(6));
	}
}