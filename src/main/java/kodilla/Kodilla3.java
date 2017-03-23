package kodilla;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by broniowj on 2017-03-22.
 */
class Kodilla3 {
	static Map<MyObject, Object> map = new HashMap<>();

	public static void main(String[] args) {
		MyObject myObject = new MyObject();
		myObject.modulo = 4;
		myObject.number = 12;

		map.put(myObject, new Object());
	}

}

class MyObject {
	//suppose these are equal if:
	int number; //this is same value
	int modulo; //result of modulo % 3 are equal

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MyObject myObject = (MyObject) o;

		if (number != myObject.number) return false;

		return modulo % 3 == myObject.modulo %3;

	}

	@Override
	public int hashCode() {
		int result = number;
		//result = 31 * result + modulo; //here with default intellij hashCode we would break
		//hashCode -> equals contract! for example number=2; modulo=3 and number=2; modulo=6
		return result * 31;
	}
}
