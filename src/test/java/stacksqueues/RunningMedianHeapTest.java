package stacksqueues;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Collections;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

/**
 * Created by broniowj on 2017-01-09.
 */
@RunWith(JUnit4.class)
public class RunningMedianHeapTest {

	@Test
	public void test() {
		RunningMedianHeap medianHeap = new RunningMedianHeap();
		assertEquals(5, medianHeap.calc(5), 0.0001);
		assertEquals(3.5, medianHeap.calc(2), 0.0001);
		assertEquals(5, medianHeap.calc(10), 0.0001);
		assertEquals(6.5, medianHeap.calc(8), 0.0001);
		assertEquals(8, medianHeap.calc(20), 0.0001);
	}

	@Test
	public void testPQApi() {
		PriorityQueue<Integer> reverse = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> normal = new PriorityQueue<>();
		normal.offer(1);
		normal.offer(2);
		normal.offer(3);
		reverse.offer(1);
		reverse.offer(2);
		reverse.offer(3);
		assertEquals(3, (int)reverse.peek());
		assertEquals(1, (int)normal.peek());
	}

}