package java8.interfaces;

/**
 * Created by broniowj on 2017-02-24.
 */
public class Vehicle implements Car, Bike {

	@Override
	public int accelerate0100() {
		return 0;
	}

	@Override
	public int drive() {//have to override this (2 defaults from ifcs)
		return 5;
	}
}
