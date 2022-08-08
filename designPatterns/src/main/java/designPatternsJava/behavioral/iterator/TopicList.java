package designPatternsJava.behavioral.iterator;

import java.util.Iterator;

public class TopicList implements MyList<Topic> {
	private Topic[] topics;

	public TopicList(Topic[] topics) {
		this.topics = topics;
	}

	@Override
	public Iterator<Topic> getIterator() {
		return new TopicIterator(topics);
	}
}