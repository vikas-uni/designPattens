package designPatternsJava.creational.singleton;

/**
 * As you can see, until we need an instance, the LazyHolder class will not be
 * initialized until required and you can still use other static members of
 * BillPughSingleton class.
 * 
 * @author vikasgond
 *
 */
public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class LazyHolder {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}
