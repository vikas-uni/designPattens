package designPatternsJava.creational.abstractFactory;

import designPatternsJava.creational.factory.CarType;

public class USACarFactory {

	public static Car buildCar(CarType carType) {
		Car car = null;
		switch (carType) {
		case LUXURY: {
			car = new LuxuryCar(Location.USA);
		}
			break;

		case SEDAN: {
			car = new SedanCar(Location.USA);
		}
			break;

		case SMALL: {
			car = new SmallCar(Location.USA);
		}
			break;

		default:
			break;
		}

		return car;
	}
}
