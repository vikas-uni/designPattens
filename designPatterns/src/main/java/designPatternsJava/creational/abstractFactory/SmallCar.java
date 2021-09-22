package designPatternsJava.creational.abstractFactory;

import designPatternsJava.creational.factory.CarType;

public class SmallCar extends Car {

	public SmallCar(Location location) {
		super(CarType.SMALL, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub

	}

}
