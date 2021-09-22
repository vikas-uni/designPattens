package designPatternsJava.creational.factory;

public abstract class Car {
	private CarType carType;

	private String model;
	private int year;
	
	public Car(CarType carType) {
		this.carType = carType;
	}
	
	public abstract void runCar();
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	
}
