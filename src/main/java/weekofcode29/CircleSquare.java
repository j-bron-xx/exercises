package weekofcode29;

import java.util.Scanner;

/**
 * Created by broniowj on 2017-02-22.
 * <p/>
 * https://www.hackerrank.com/contests/w29/challenges/a-circle-and-a-square
 *
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
				if (isInCircle(x, y)) {
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

		return false;
	}
}
