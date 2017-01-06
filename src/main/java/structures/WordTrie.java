package structures;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-06.
 */
class WordNode {
	Character c;
	List<WordNode> children = new ArrayList<WordNode>();
	boolean isWord = false;

	WordNode(Character c) {
		this.c = c;
	}
}

public class WordTrie {
	WordNode root = new WordNode(null);

	public static void main(String[] args) throws IOException {
		WordTrie wordTrie = new WordTrie();

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int a0 = 0; a0 < n; a0++){
			String op = in.next();
			String contact = in.next();

			if ("add".equals(op)) {
				wordTrie.build(contact);
			}
			if ("find".equals(op)) {
				int occurrences = wordTrie.find(contact);
				out.write(occurrences + "\n");
				out.flush();
			}
		}
	}

	void build(String contact) {
		WordNode node = root;
		for (int i = 0; i < contact.length(); i++) {
			Character c = contact.charAt(i);
			WordNode cNode = findCInNode(c, node);
			if (cNode == null) {
				cNode = new WordNode(c);
				node.children.add(cNode);
			}
			node = cNode;
			if (i == contact.length() - 1) node.isWord = true;
		}
	}

	int findCounter = 0;

	int find(String contact) {
		WordNode node = root;
		for (int i = 0; i < contact.length(); i++) {
			Character c = contact.charAt(i);
			node = findCInNode(c, node);
			if (node == null) return 0;
		}
		findCounter = 0;
		return countLeafs(node);
	}

	int countLeafs(WordNode node) {
		if (node.isWord) {
			findCounter++;
		}

		for (WordNode n : node.children) {
			countLeafs(n);
		}

		return findCounter;
	}

	WordNode findCInNode(Character character, WordNode node) {
		for (WordNode n : node.children) {
			if (n.c == character) return n;
		}
		return null;
	}

}
