package strings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by broniowj on 2017-01-08.
 */
@RunWith(JUnit4.class)
public class AnagramsTest {

	@Test
	public void test() {
		assertEquals(1, Anagrams.numberNeeded("ab", "abc"));
		assertEquals(4, Anagrams.numberNeeded("ab", "cd"));
		assertEquals(1, Anagrams.numberNeeded("abb", "ab"));
		assertEquals(2, Anagrams.numberNeeded("abcd", "abccdg"));
	}
}