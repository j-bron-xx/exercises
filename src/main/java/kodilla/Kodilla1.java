package kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by broniowj on 2017-03-22.
 */
public class Kodilla1 {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("Janusz"));
		users.add(new User("Seba"));
		users.add(new User("Andrzej"));
		users.add(new User("Zbychu"));

		List<User> filteredUsers = users.stream()
		                                .filter(user -> "Janusz".equals(user.getName()))
		                                .collect(Collectors.toList());

		System.out.println("Quantity of users named Janusz: " + filteredUsers.size());
	}
}

class User {
	private final String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
