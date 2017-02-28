package java8.interfaces;

/**
 * Created by broniowj on 2017-02-24.
 */
public class Interfaces {

	public static void main(String[] args) {
		System.out.println(Car.turn());//static from ifc only accessible by interface
		Car car = () -> 9;//functional interfaces can be created with lambdas
		System.out.println(car.drive());//default accessbile by instance


		Moto moto = () -> 3;
		System.out.println(moto.drive());

		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.drive());
	}
}
