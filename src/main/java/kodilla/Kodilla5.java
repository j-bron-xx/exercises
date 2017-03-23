package kodilla;

import java.util.Date;

/**
 * Created by broniowj on 2017-03-22.
 */
public class Kodilla5 {

	private final String name;
	private final Date date;

	public Kodilla5(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		//watch out for exposing a mutable object's reference!
		//use defensive copying (or don't use old Date object)
		return new Date(date.getTime());
	}
}
