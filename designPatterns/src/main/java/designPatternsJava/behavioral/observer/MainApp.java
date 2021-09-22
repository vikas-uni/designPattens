package designPatternsJava.behavioral.observer;

public class MainApp {

	public static void main(String[] args) {
		Observer ob1 = new MessageSubscriberOne();
		Observer ob2 = new MessageSubscriberTwo();
		
		Subject sub = new MessagePublisher();
		sub.attach(ob1);
		sub.attach(ob2);
		
		Message msg = new Message("Hi!");
		
		sub.notifyUpdate(msg);

	}

}
