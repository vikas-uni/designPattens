package designPatternsJava.creational.prototype;

public interface PrototypeCapable extends Cloneable{
	public Object clone() throws CloneNotSupportedException;
}
