package designPatternsJava.behavioral.strategy;

public class OrkutStrategy implements ISocialMediaStrategy {

	public void connectTo(String friendName) {
		System.out.println("Connecting with " + friendName + " through Orkut [not possible though :)]");
	}
}