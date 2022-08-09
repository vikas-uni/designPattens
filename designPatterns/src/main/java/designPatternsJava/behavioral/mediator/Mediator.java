package designPatternsJava.behavioral.mediator;

//Mediator interface
public interface Mediator {
	public void send(String message, Colleague colleague);
}