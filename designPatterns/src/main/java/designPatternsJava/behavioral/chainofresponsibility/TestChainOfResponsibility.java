package designPatternsJava.behavioral.chainofresponsibility;

/**
 * The Chain of Responsibility is known as a behavioral pattern. The main
 * objective of this pattern is that it avoids coupling the sender of the
 * request to the receiver, giving more than one object the opportunity to
 * handle the request. The core logic defined by GoF is :
 * 
 * "Gives more than one object an opportunity to handle a request by linking
 * receiving objects together." Chain of Responsibility allows a number of
 * classes to attempt to handle a request, independently of any other object
 * along the chain. Once the request is handled, it completes it’s journey
 * through the chain.
 * 
 * Extra handlers can be added or removed from chain without modifying the logic
 * inside any of concrete handler.
 * 
 * Suggested usage: This pattern is recommended when multiple objects can handle
 * a request and the handler doesn’t have to be a specific object. Also, handler
 * is determined at runtime. Please note that that a request not handled at all
 * by any handler is a valid use case.
 * 
 * For example, event handling mechanism in windows OS where events can be
 * generated from either mouse, keyboard or some automatic generated events. All
 * such events can be handled by multiple handlers and correct handler is found
 * on runtime.
 * 
 * More general exampe can be a service request to call center. This request can
 * be handled at front desk level, supervisor level or any higher level. Correct
 * handler of request is only known at runtime when request is traversing at
 * various levels. We will solve this scenario in this post.
 * 
 * Participants in the solution 1) Handler : This can be an interface which will
 * primarily recieve the request and dispatches the request to chain of
 * handlers. It has reference of only first handler in the chain and does not
 * know anything about rest of the handlers.
 * 
 * 2) Concrete handlers : These are actual handlers of the request chained in
 * some sequential order.
 * 
 * 3) Client : Originator of request and this will access the handler to handle
 * it.
 * 
 * Proposed solution: Above problem is a good candidate for using chain of
 * responsibility pattern. We can define the handler at each level i.e. support
 * desk, supervisor, manager and director. Then we can define a chain for
 * handling the support request. This chain must follow the sequence:
 * 
 * Support desk > supervisor > manager > director Above chain can be managed
 * using programmatic solutions in java also, but in this tutorial i am using
 * spring for injecting the dependencies and thus forming this chain. Also,
 * System will first assign the request to front desk only.
 * 
 * @author vikasgond
 *
 */
public class TestChainOfResponsibility {
	public static void main(String[] args) {
		SupportService supportService = new SupportService();
		init(supportService);

		ServiceRequest request = new ServiceRequest();
		request.setType(ServiceLevel.LEVEL_ONE);
		supportService.handleRequest(request);
		System.out.println(request.getConclusion());

		request = new ServiceRequest();
		request.setType(ServiceLevel.LEVEL_THREE);
		supportService.handleRequest(request);
		System.out.println(request.getConclusion());

		request = new ServiceRequest();
		request.setType(ServiceLevel.INVALID_REQUEST);
		supportService.handleRequest(request);
		System.out.println(request.getConclusion());
	}

	private static void init(SupportService supportService) {
		FrontDeskSupport frontDeskSupport = new FrontDeskSupport();
		SupervisorSupport supervisorSupport = new SupervisorSupport();
		ManagerSupport managerSupport = new ManagerSupport();
		DirectorSupport directorSupport = new DirectorSupport();

		supportService.setHandler(frontDeskSupport);
		frontDeskSupport.setNext(supervisorSupport);
		supervisorSupport.setNext(managerSupport);
		managerSupport.setNext(directorSupport);

	}
}