package java8.interfaces;

/**
 * Created by broniowj on 2017-02-24.
 */
@FunctionalInterface
public interface Moto extends Car {

	@Override
	default int drive() {
		return 2;
	}
}
