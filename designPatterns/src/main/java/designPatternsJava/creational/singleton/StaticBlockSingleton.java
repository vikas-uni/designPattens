package designPatternsJava.creational.singleton;

/**
 * The above code has one drawback. Suppose there are 5 static fields in a class
 * and the application code needs to access only 2 or 3, for which instance
 * creation is not required at all. So, if we use this static initialization, we
 * will have one instance created though it is required or not.
 * 
 * @author vikasgond
 *
 */
public class StaticBlockSingleton {
	private static final StaticBlockSingleton INSTANCE;

	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Uffff, i was not expecting this!", e);
		}
	}

	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}

	private StaticBlockSingleton() {
		// ...
	}
}
