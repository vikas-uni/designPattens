package designPatternsJava.creational.factory;

public class CarFactoryTest {
	public static void main(String[] args) {
		Car sedan = CarFactory.getCar(CarType.SEDAN);
		
		System.out.println(sedan.getCarType().name()+":"+sedan.getYear());
	}

}
