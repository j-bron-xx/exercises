package kodilla;

import java.util.Arrays;

/**
 * Created by broniowj on 2017-03-22.
 */
public class Kodilla4 {

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person(1232, "ASzepciucha");
		persons[1] = new Person(1232, "BKuchta");
		persons[2] = new Person(1403, "CPrzadka");

		Arrays.sort(persons, (o1, o2) -> {
			int nameCompare = o1.name.compareTo(o2.name);
			if (nameCompare == 0) {
				return o1.age - o2.age;//possible int overflow, how?
			}
			return 0;
		});

		System.out.println(persons);
	}

}

class Person {
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
