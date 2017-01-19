package structures;

/**
 * Created by broniowj on 2017-01-19.
 *
 * https://www.hackerrank.com/challenges/ctci-linked-list-cycle
 *
 *
 */
public class LinkedListCycle {

	boolean hasCycle(Node head) {
		if (head == null) return false;
		int size = 1;
		while (head.next != null) {
			size++;
			if (size > 100) return true;
			head = head.next;
		}
		return false;
	}

	class Node {
		int data;
		Node next;
	}
}
