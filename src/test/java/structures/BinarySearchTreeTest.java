package structures;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.Assert.assertTrue;

/**
 * Created by broniowj on 2017-01-06.
 */
@RunWith(JUnit4.class)
public class BinarySearchTreeTest {

	private Node tree1;

	@Before
	public void prepareTrees() {
		tree1 = new Node();
		tree1.data = 5;

		Node node1 = new Node();
		node1.data = 3;
		Node node2 = new Node();
		node2.data = 7;
		Node node3 = new Node();
		node3.data = 9;
		Node node4 = new Node();
		node4.data = 1;
		Node node5 = new Node();
		node5.data = 4;
		Node node6 = new Node();
		node6.data = 11;

		tree1.left = node5;
		node5.left = node1;
		node1.left = node4;

		tree1.right = node2;
		node2.right = node3;
		node3.right = node6;
	}

	@Test
	public void testTree1() {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		assertTrue(binarySearchTree.checkBST(tree1));
	}
}
