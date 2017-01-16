package weekofcode28;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class LuckyNumber8Test {



	@Test
	public void testCalc() throws Exception {
		assertEquals(45, LuckyNumber8.calc("12345", 5));
		assertEquals(67, LuckyNumber8.calc("1234567", 7));
	}
}