package designPatternsJava.creational.singleton;

public class IdealSingleton {

	// this ensures object is same while serial/deserial if fields change in between
	private static final long serialVersionUID = 1L;

	private IdealSingleton() {
		// private constructor
	}

	// bill pugh singleton pattern
	private static class IdealSingletonHolder {
		public static final IdealSingleton INSTANCE = new IdealSingleton();
	}

	public static IdealSingleton getInstance() {
		return IdealSingletonHolder.INSTANCE;
	}

	// ensures same instance of class returned while serial/deserial
	protected Object readResolve() {
		return getInstance();
	}

}
