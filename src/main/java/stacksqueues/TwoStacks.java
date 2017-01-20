package stacksqueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-20.
 *
 * https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks
 */
public class TwoStacks<T> {
	Deque<T> stack = new ArrayDeque<>();



	public static void main(String[] args) {
		TwoStacks<Integer> queue = new TwoStacks<>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) {
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) {
				queue.dequeue();
			} else if (operation == 3) {
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}

	private T peek() {
		return stack.peek();
	}

	private T dequeue() {
		return stack.removeFirst();
	}

	private void enqueue(T i) {
		stack.addLast(i);
	}
}
