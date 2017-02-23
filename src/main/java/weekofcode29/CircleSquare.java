package weekofcode29;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by broniowj on 2017-02-22.
 * <p/>
 * https://www.hackerrank.com/contests/w29/challenges/a-circle-and-a-square
 * <p/>
 * todo: add square
 */
public class CircleSquare {
	static int circleX;
	static int circleY;
	static int circleR;
	static int squareX1;
	static int squareY1;
	static int squareX3;
	static int squareY3;

	public static void main(String[] args) {
//		squareX1 = 0;
//		squareY1 = 0;
//		squareX3 = 10;
//		squareY3 = 0;
//		isInSquare(3, 2);

		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		circleX = in.nextInt();
		circleY = in.nextInt();
		circleR = in.nextInt();
		squareX1 = in.nextInt();
		squareY1 = in.nextInt();
		squareX3 = in.nextInt();
		squareY3 = in.nextInt();

		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				if (isInSquare(x, y) || isInCircle(x, y)) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}

	static boolean isInCircle(int x, int y) {
		int distanceX;
		if (x > circleX) {
			distanceX = x - circleX;
		} else {
			distanceX = circleX - x;
		}
		int distanceY;
		if (y > circleY) {
			distanceY = y - circleY;
		} else {
			distanceY = circleY - y;
		}

		double pitagoras = Math.sqrt(distanceX * distanceX + distanceY * distanceY);

		return pitagoras <= circleR;
	}

	static boolean isInSquare(int x, int y) {
		int x1 = squareX1;
		int y1 = squareY1;
		int x3 = squareX3;
		int y3 = squareY3;

		int xcenter = (x1 + x3) / 2;
		int ycenter = (y1 + y3) / 2;
		int xd = (x1 - x3) / 2;
		int yd = (y1 - y3) / 2;

		int x2 = xcenter - yd;
		int y2 = ycenter + xd;
		int x4 = xcenter + yd;
		int y4 = ycenter - xd;

		int line1 = (x1 - x2) / (y1 - y2);
		int deltaline1 = y1 - line1 * x1;
		int line2 = (x2 - x3) / (y2 - y3);
		int deltaline2 = y2 - line2 * x2;
		int line3 = (x3 - x4) / (y3 - y4);
		int deltaline3 = y3 - line3 * x3;
		int line4 = (x4 - x1) / (y4 - y1);
		int deltaline4 = y4 - line4 * x4;

		if (x == xcenter && y == ycenter) return true;

		int l1 = line1 * x + deltaline1;
		int l2 = line2 * x + deltaline2;
		int l3 = line3 * x + deltaline3;
		int l4 = line4 * x + deltaline4;

		int rl1 = (xcenter - x) * (xcenter - x) + (ycenter - l1) * (ycenter - l1);
		int rl2 = (xcenter - x) * (xcenter - x) + (ycenter - l2) * (ycenter - l2);
		int rl3 = (xcenter - x) * (xcenter - x) + (ycenter - l3) * (ycenter - l3);
		int rl4 = (xcenter - x) * (xcenter - x) + (ycenter - l4) * (ycenter - l4);

		Map<Integer, Integer> yline = new HashMap<>();
		yline.put(l1, rl1);
		yline.put(l2, rl2);
		yline.put(l3, rl3);
		yline.put(l4, rl4);

		List<Integer> collect = yline.entrySet()
		                             .stream()
		                             .sorted(Map.Entry.comparingByValue())
		                             .map(Map.Entry::getKey)
		                             .collect(Collectors.toList());

		Integer hy1 = collect.get(0);
		Integer hy2 = collect.get(1);

		if ((hy1 > hy2) && (y > hy1 || y < hy2)) {
			return false;
		} else if ((hy2 > hy1) && (y > hy2 || y < hy1)) {
			return false;
		}


		int lx1 = (y - deltaline1) / line1;
		int lx2 = (y - deltaline2) / line2;
		int lx3 = (y - deltaline3) / line3;
		int lx4 = (y - deltaline4) / line4;

		int rlx1 = (xcenter - x) * (xcenter - x) + (ycenter - lx1) * (ycenter - lx1);
		int rlx2 = (xcenter - x) * (xcenter - x) + (ycenter - lx2) * (ycenter - lx2);
		int rlx3 = (xcenter - x) * (xcenter - x) + (ycenter - lx3) * (ycenter - lx3);
		int rlx4 = (xcenter - x) * (xcenter - x) + (ycenter - lx4) * (ycenter - lx4);

		Map<Integer, Integer> xline = new HashMap<>();
		xline.put(lx1, rlx1);
		xline.put(lx2, rlx2);
		xline.put(lx3, rlx3);
		xline.put(lx4, rlx4);

		List<Integer> collect2 = xline.entrySet()
		                              .stream()
		                              .sorted(Map.Entry.comparingByValue())
		                              .map(Map.Entry::getKey)
		                              .collect(Collectors.toList());

		Integer hx1 = collect2.get(0);
		Integer hx2 = collect2.get(1);

		if ((hx1 > hx2) && (x > hx1 || x < hx2)) {
			return false;
		} else if ((hx2 > hx1) && (y > hx2 || y < hx1)) {
			return false;
		}

		return true;
	}
}
