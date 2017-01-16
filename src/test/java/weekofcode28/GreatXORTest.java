package weekofcode28;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GreatXORTest {

	@Test
	public void testIsBitSet() {
		assertTrue(GreatXOR.isBitSet(3, 10));
		assertFalse(GreatXOR.isBitSet(2, 10));
		assertTrue(GreatXOR.isBitSet(1, 10));
		assertFalse(GreatXOR.isBitSet(0, 10));
	}
}