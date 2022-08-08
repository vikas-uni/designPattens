package designPatternsJava.behavioral.iterator;

import java.util.Iterator;

public interface MyList<E> {
	Iterator<E> getIterator();
}