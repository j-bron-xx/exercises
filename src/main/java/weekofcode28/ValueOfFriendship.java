package weekofcode28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by broniowj on 2017-01-12.
 * <p/>
 * https://www.hackerrank.com/contests/w28/challenges/value-of-friendship
 * todo: pass all TCs
 */
public class ValueOfFriendship {

	static int[] friends;
	static int sum;
	static int relationGroups;
	static List<Integer> relations = new ArrayList<>();
	static List<Rel> rel = new LinkedList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			friends = new int[n];
			for (int a1 = 0; a1 < m; a1++) {
				int x = in.nextInt();
				int y = in.nextInt();
				x--;
				y--;
				if (x > y) {
					int temp = x;
					x = y;
					y = temp;
				}
				boolean added = false;
				for (int i = 0; i < rel.size(); i++) {
					if (rel.get(i).x <= x) {
						rel.add(new Rel(x, y));
						added = true;
						break;
					}
				}
				if (!added) rel.add(new Rel(x, y));
			}
			for (Rel r : rel) {
				grouping(r.x, r.y);

				count();
			}

			System.out.println(sum);
		}
	}

	static void count() {
		int s = 0;
		for (int i = 0; i < relationGroups; i++) {
			sum += relations.get(i) * (relations.get(i) - 1);
			s += relations.get(i) * (relations.get(i) - 1);
		}
		//System.out.println("current: " + s);
	}

	static void grouping(int x, int y) {
		if (friends[x] == 0 && friends[y] == 0) {
			relationGroups++;
			friends[x] = relationGroups;
			friends[y] = relationGroups;

			relations.add(2);
		} else if (friends[x] != 0 && friends[y] == 0) {
			friends[y] = friends[x];
			relations.set(friends[x] - 1, relations.get(friends[x] - 1) + 1);
		} else if (friends[y] != 0 && friends[x] == 0) {
			friends[x] = friends[y];
			relations.set(friends[y] - 1, relations.get(friends[y] - 1) + 1);
		} else if (friends[x] != 0 && friends[y] != 0 && friends[x] != friends[y]) {
			int friendy = friends[y];
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == friendy) {
					friends[i] = friends[x];
					relations.set(friends[x] - 1, relations.get(friends[x] - 1) + 1);
				}
			}
		}
	}
}

class Rel {
	int x;
	int y;

	public Rel(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
