package stacksqueues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-09.
 *
 * https://www.hackerrank.com/challenges/ctci-find-the-running-median
 */
public class RunningMedianHeap {
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	int counter = 0;
	double median;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double val;
		RunningMedianHeap runningMedian = new RunningMedianHeap();
		for (int a_i = 0; a_i < n; a_i++) {
			val = runningMedian.calc(in.nextInt());
			System.out.println(val);
		}
	}

	double calc(int number) {
		counter++;
		if (counter == 1) {
			maxHeap.offer(number);
			median = number;
			return median;
		}

		if (number < median) maxHeap.offer(number);
		else minHeap.offer(number);

		if (maxHeap.size() - minHeap.size() > 1) minHeap.offer(maxHeap.poll());
		if (minHeap.size() > maxHeap.size()) maxHeap.offer(minHeap.poll());

		if (maxHeap.size() == minHeap.size()) median = ((double)maxHeap.peek() + (double)minHeap.peek()) / 2;
		else median = maxHeap.peek();

		return median;
	}
}
