package java8.interfaces;

/**
 * Created by broniowj on 2017-02-24.
 */
@FunctionalInterface
public interface Car {

	int accelerate0100();

	default int drive() {
		return 1;
	}

	static int turn() {
		return 1;
	}
}
