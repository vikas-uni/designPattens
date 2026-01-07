package designPatternsJava.creational.singleton;

/**
 * This type of implementation employs the use of enum. Enum, as written in the
 * java docs, provided implicit support for thread safety,reflection safety and
 * only one instance is guaranteed. Java enum singleton is also a good way to
 * have singleton with minimal effort.
 * 
 * @author vikasgond
 *
 */
public enum EnumSingleton {
	INSTANCE;
	public void someMethod(String param) {
		System.out.println("enum singleton:" + param);
	}
}