package designPatternsJava.behavioral.mediator;

/**
 * When to use mediator design pattern Mediator helps in establishing loosely
 * coupled communication between objects and helps in reducing the direct
 * references to each other. This helps in minimizing the complexity of
 * dependency management and communications among participating objects.
 * 
 * Mediator helps to facilitate the interaction between objects in a manner in
 * that objects are not aware of the existence of other objects. Objects depend
 * only on a single mediator class instead of being coupled to dozens of other
 * objects.
 * 
 * During designing a solution to a problem, if you encounter a situation where
 * multiple objects need to interact with each other to process the request, but
 * direct communication may create a complex system, you can consider using
 * mediator pattern.
 * 
 * The pattern lets you extract all the relationships between classes into a
 * separate class, isolating any changes to a specific component from the rest
 * of the components.
 * 
 * Real world example of mediator pattern A great real world example of mediator
 * pattern is traffic control room at airports. If all flights will have to
 * interact with each other for finding which flight is going to land next, it
 * will create a big mess. Rather flights only send their status to the tower.
 * These towers in turn send the signals to conform which airplane can take-off
 * or land. We must note that these towers do not control the whole flight. They
 * only enforce constraints in the terminal areas.
 * 
 * Another good example of mediator pattern is a chat application. In a chat
 * application we can have several participants. It’s not a good idea to connect
 * each participant to all the others because the number of connections would be
 * really high. The best solution is to have a hub where all participants will
 * connect; this hub is just the mediator class. In Java programming, the
 * execute() method inside the java.util.concurrent.Executor interface follows
 * this pattern. The different overloaded versions of various schedule() methods
 * of the java.util.Timer class also can be considered to follow this pattern.
 * 
 * Design participants Mediator – defines the interface for communication
 * between Colleague objects ConcreteMediator – implements the Mediator
 * interface and coordinates communication between Colleague objects. It is
 * aware of all of the Colleagues and their purposes with regards to
 * inter-communication. Colleague – defines the interface for communication with
 * other Colleagues through its Mediator ConcreteColleague – implements the
 * Colleague interface and communicates with other Colleagues through its
 * Mediator
 */

public class Client {
	public static void main(String[] args) {
		ApplicationMediator mediator = new ApplicationMediator();
		Colleague desktop = new ConcreteColleague(mediator);
		Colleague mobile = new MobileColleague(mediator);
		mediator.addColleague(desktop);
		mediator.addColleague(mobile);
		desktop.send("Hello World");
		mobile.send("Hello");
	}
}
