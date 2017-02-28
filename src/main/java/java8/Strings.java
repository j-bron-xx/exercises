package java8;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by broniowj on 2017-02-24.
 */
public class Strings {

	public static void main(String[] args) {
		String a = "A";
		String a2 = "A";

		System.out.println(a == a2);

		String it = "it1";

		for (int i = 0; i < 2034; i++) {
			String l = "it"+i;
			String lintern = l.intern();
			if (it == lintern) System.out.println("Intern dynamic string as well");
		}

		joining();

		"foobar:foo:bar"
				.chars()
				.peek(System.out::println)
				.distinct()
				.peek(System.out::println)
				.mapToObj(c -> String.valueOf((char) c))
				.sorted()
				.peek(System.out::println)
				.collect(Collectors.joining());

		Pattern.compile(":")
		       .splitAsStream("foobar:foo:bar")
		       .filter(s -> s.contains("bar"))
		       .sorted()
		       .collect(Collectors.joining(":"));

		Pattern pattern = Pattern.compile(".*@gmail\\.com");
		Stream.of("bob@gmail.com", "alice@hotmail.com")
		      .filter(pattern.asPredicate())
		      .count();
	}

	static void joining() {
		String joined = String.join("", "a", "b", "c");
		System.out.println(joined);
	}
}
