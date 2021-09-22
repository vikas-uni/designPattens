package designPatternsJava.creational.singleton;

/**
 * This is a design pattern where an instance of a class is created much before
 * it is actually required. Mostly it is done on system startup. In an eager
 * initialization singleton pattern, the singleton instance is created
 * irrespective of whether any other class actually asked for its instance or
 * not.
 * 
 * @author vikasgond
 *
 */

public class EagerSingleton {
	private static volatile EagerSingleton instance = new EagerSingleton();

	// private constructor
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}