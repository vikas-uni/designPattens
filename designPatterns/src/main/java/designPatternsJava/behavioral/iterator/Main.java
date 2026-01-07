package designPatternsJava.behavioral.iterator;

import java.util.Iterator;

/**
 * According to GoF definition, an iterator pattern provides a way to access the
 * elements of an aggregate object sequentially without exposing its underlying
 * representation. It is behavioral design pattern.
 * 
 * As name implies, iterator helps in traversing the collection of objects in a
 * defined manner which is useful the client applications. During iteration,
 * client programs can perform various other operations on the elements as per
 * requirements.
 * 
 * 1. When to use iterator design pattern Every programming language support
 * some data structures like list or maps, which are used to store a group of
 * related objects. In Java, we have List, Map and Set interfaces and their
 * implementations such as ArrayList and HashMap.
 * 
 * A collection is only useful when it’s provides a way to access its elements
 * without exposing its internal structure. The iterators bear this
 * responsibility.
 * 
 * So any time, we have collection of objects and clients need a way to iterate
 * over each collection elements in some proper sequence, we must use iterator
 * pattern to design the solution.
 * 
 * The iterator pattern allow us to design a collection iterator in such a way
 * that –
 * 
 * we are able to access elements of a collection without exposing the internal
 * structure of elements or collection itself. iterator supports multiple
 * simultaneous traversals of a collection from start to end in forward,
 * backward or both directions. iterator provide a uniform interface for
 * traversing different collection types transparently. The key idea is to take
 * the responsibility for access and traversal out of the aggregate object and
 * put it into an Iterator object that defines a standard traversal protocol.
 * 
 * Design participants The participants of iterator pattern are as follows:
 * 
 * Iterator: An interface to access or traverse the elements collection. Provide
 * methods which concrete iterators must implement. ConcreteIterator: implements
 * the Iterator interface methods. It can also keep track of the current
 * position in the traversal of the aggregate collection. Aggregate: It is
 * typically a collection interface which defines a method that can create an
 * Iterator object. ConcreteAggregate: It implements the Aggregate interface and
 * its specific method returns an instance of ConcreteIterator.
 */

public class Main {
	public static void main(String[] args) {
		Topic[] topics = new Topic[5];
		topics[0] = new Topic("topic1");
		topics[1] = new Topic("topic2");
		topics[2] = new Topic("topic3");
		topics[3] = new Topic("topic4");
		topics[4] = new Topic("topic5");

		MyList<Topic> list = new TopicList(topics);

		Iterator<Topic> iterator = list.getIterator();

		while (iterator.hasNext()) {
			Topic currentTopic = iterator.next();
			System.out.println(currentTopic.getName());
		}
	}
}
