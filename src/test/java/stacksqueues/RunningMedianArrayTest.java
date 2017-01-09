package stacksqueues;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by broniowj on 2017-01-08.
 */
@RunWith(JUnit4.class)
public class RunningMedianArrayTest {

	@Test
	public void test() {
		RunningMedianArray runningMedian = new RunningMedianArray();
		assertEquals(5, runningMedian.add(5), 0.001);
		assertEquals(3.5, runningMedian.add(2), 0.001);
		assertEquals(5, runningMedian.add(10), 0.001);
		assertEquals(6.5, runningMedian.add(8), 0.001);
	}
}