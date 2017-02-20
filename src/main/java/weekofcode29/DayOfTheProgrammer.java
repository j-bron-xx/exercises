package weekofcode29;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w29/challenges/day-of-the-programmer
 */
public class DayOfTheProgrammer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();

//		int year = 2017;

		Date julianToGregorianChange = new Date();
		julianToGregorianChange.setDate(31);
		julianToGregorianChange.setMonth(1);
		julianToGregorianChange.setYear(1918);

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setGregorianChange(julianToGregorianChange);

		calendar.set(year, Calendar.JANUARY, 0);

		calendar.add(Calendar.DATE, 256);

		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
		String day = ((Integer) calendar.get(Calendar.DATE)).toString();
		if (day.length() == 1) {
			day = "0" + day;
		}
		String month = ((Integer) (calendar.get(Calendar.MONTH) + 1)).toString();
		if (month.length() == 1) {
			month = "0" + month;
		}

		System.out.println(day + "." + month + "." + year);
	}
}
