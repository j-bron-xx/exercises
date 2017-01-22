package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-20.
 * <p/>
 * https://www.hackerrank.com/challenges/ctci-comparator-sorting
 */
class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.score < o2.score) return 1;
		if (o1.score > o2.score) return -1;
		return String.CASE_INSENSITIVE_ORDER.compare(o1.name, o2.name);
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}
