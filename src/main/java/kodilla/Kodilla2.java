package kodilla;

/**
 * Created by broniowj on 2017-03-22.
 */
class Kodilla2 {

	public static void main(String[] args) {
		VehicleBuilder vb = new CarBuilder();

		vb.createNewVehicle();
		vb.withEngine(110);//imagine a client is changing engine power many times before obtaining an object, how to optimise calculation of powerToWeightTraction?
		vb.addSportTires();

		Vehicle myFavCar = vb.getVehicle();

		VehicleBuilder vb2 = new MotorcycleBuilder();

		vb2.createNewVehicle();
		vb2.withEngine(195);
		vb2.countWheels();//not important method exposed, design flaw, how to fix?

		Vehicle myFavBike = vb2.getVehicle();

	}
}

class Vehicle {
	int wheels;
	int power;
	double tractionPowerToWeight;

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void determinePowerToWeightTranction() {
		this.tractionPowerToWeight = power > 0 ? wheels / (double) power : 0;
	}

	public void determinePowerToWeightTranction(double coefficient) {
		this.tractionPowerToWeight = power > 0 ? coefficient * wheels / (double) power : 0;
	}
}

abstract class VehicleBuilder {
	private Vehicle vehicle;

	void createNewVehicle() {
		vehicle = new Vehicle();
		//or maybe setter directly in concrete builders?
		//Nah, it would cause to use external builder ifc, and we can access vehicle directly here
		vehicle.setWheels(this.countWheels());
	}

	Vehicle getVehicle() {
		if (vehicle != null) {
			return vehicle;
		}
		throw new IllegalStateException();
	}

	abstract void withEngine(int power);

	abstract void addSportTires();

	//could be done in concrete implementation constructor as well, with getVehicle().setWheels(...)
	//why taht would be better? Here we are exposing not important method to the client.
	abstract int countWheels();

}

class MotorcycleBuilder extends VehicleBuilder {

	@Override
	void withEngine(int power) {
		getVehicle().setPower(power);
		getVehicle().determinePowerToWeightTranction();
	}

	@Override
	void addSportTires() {
		getVehicle().determinePowerToWeightTranction(1.2);
	}

	@Override
	int countWheels() {
		return 2;
	}
}


class CarBuilder extends VehicleBuilder {

	@Override
	void withEngine(int power) {
		getVehicle().setPower(power);
		getVehicle().determinePowerToWeightTranction();
	}

	@Override
	void addSportTires() {
		getVehicle().determinePowerToWeightTranction(1.6);//4 wheels more impact than 2 in a bike
	}

	@Override
	int countWheels() {
		return 4;
	}
}


