package designPatternsJava.creational.factory;

/**
 * Factory pattern is most suitable where there is some complex object creation
 * steps are involved. To ensure that these steps are centralized and not
 * exposed to composing classes, factory pattern should be used. We can see many
 * realtime examples of factory pattern in JDK itself e.g.
 * 
 * java.sql.DriverManager#getConnection() java.net.URL#openConnection()
 * java.lang.Class#newInstance() java.lang.Class#forName()
 * 
 * @author vikasgond
 *
 */
public class CarFactory {

	public static Car getCar(CarType type) {
		Car car = null;
		switch (type) {
		case LUXURY: {
			car = new LuxuaryCar();

			car.setYear(2000);

		}
			break;

		case SEDAN: {
			car = new LuxuaryCar();

			car.setYear(2000);

		}
			break;

		case SMALL: {
			car = new LuxuaryCar();

			car.setYear(2000);

		}
			break;

		default:
			throw new RuntimeException("invalid option");

		}

		return car;

	}

}
