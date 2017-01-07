package stacksqueues;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by broniowj on 2017-01-07.
 */
@RunWith(JUnit4.class)
public class BalancedBracketsTest {

	@Test
	public void test() {
		assertTrue(BalancedBrackets.isBalanced("(())[]"));
		assertTrue(BalancedBrackets.isBalanced("[{()()}]"));
		assertFalse(BalancedBrackets.isBalanced("[{()()}]}{"));
		assertFalse(BalancedBrackets.isBalanced("[{()]()}]"));
		assertFalse(BalancedBrackets.isBalanced("[{()(()}]"));
	}


}