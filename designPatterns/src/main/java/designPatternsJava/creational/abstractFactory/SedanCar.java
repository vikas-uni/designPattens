package designPatternsJava.creational.abstractFactory;

import designPatternsJava.creational.factory.CarType;

public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub

	}

}
