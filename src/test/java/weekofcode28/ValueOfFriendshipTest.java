package weekofcode28;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ValueOfFriendshipTest {

	@Test
	public void test() {
		ValueOfFriendship.friends = new int[4];
		ValueOfFriendship.grouping(1, 2);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(3, 2);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(4, 2);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(4, 3);
		ValueOfFriendship.count();
		assertEquals(32, ValueOfFriendship.sum);
	}

	@Test
	public void test2() {
		ValueOfFriendship.friends = new int[15];
		ValueOfFriendship.grouping(1, 2);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(2, 3);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(3, 4);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(4, 5);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(5, 6);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(6, 7);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(7, 8);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(8, 9);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(9, 10);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(10, 1);
		ValueOfFriendship.count();
//		ValueOfFriendship.grouping(1,11);
//		ValueOfFriendship.count();
		ValueOfFriendship.grouping(11, 12);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(12, 13);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(13, 14);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(14, 15);
		ValueOfFriendship.count();
		ValueOfFriendship.grouping(15, 11);
		ValueOfFriendship.count();
		assertEquals(1540, ValueOfFriendship.sum);
	}


}