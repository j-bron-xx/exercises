package structures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by broniowj on 2017-01-06.
 */
@RunWith(JUnit4.class)
public class WordTrieTest {

	@Test
	public void test1() {
		WordTrie wordTrie = new WordTrie();
		wordTrie.build("foo");
		wordTrie.build("foobar");
		assertEquals(2, wordTrie.find("foo"));
		assertEquals(0, wordTrie.find("joe"));
		wordTrie.build("hous");
		wordTrie.build("house");
		wordTrie.build("houses");
		assertEquals(3, wordTrie.find("hou"));
		assertEquals(2, wordTrie.find("house"));
		assertEquals(1, wordTrie.find("houses"));
		assertEquals(0, wordTrie.find("housess"));
	}

}