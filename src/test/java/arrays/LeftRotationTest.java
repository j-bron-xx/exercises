package arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.Assert.assertEquals;

/**
 * Created by broniowj on 2017-01-05.
 */
@RunWith(JUnit4.class)
public class LeftRotationTest {

	private LeftRotation leftRotation = new LeftRotation();

	@Test
	public void runTest() {
		int[] result = leftRotation.run("5 3", "1 2 3 4 5");
		assertEquals(result[0], 4);
		assertEquals(result[1], 5);
		assertEquals(result[2], 1);
		assertEquals(result[3], 2);
		assertEquals(result[4], 3);
	}

	@Test
	public void runTest2() {
		int[] result = leftRotation.run("7 3", "11 22 33 44 55 66 77");
		assertEquals(result[0], 44);
		assertEquals(result[1], 55);
		assertEquals(result[2], 66);
		assertEquals(result[3], 77);
		assertEquals(result[4], 11);
		assertEquals(result[5], 22);
		assertEquals(result[6], 33);
	}
}
