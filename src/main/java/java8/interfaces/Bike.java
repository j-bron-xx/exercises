package java8.interfaces;

/**
 * Created by broniowj on 2017-02-24.
 */
public interface Bike {

	default int drive() {
		return 3;
	}
}
