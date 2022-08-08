package designPatternsJava.behavioral.iterator;

import java.util.Iterator;

public class TopicIterator implements Iterator<Topic> {
   
  private Topic[] topics;
    private int position;
     
    public TopicIterator(Topic[] topics)
    {
        this.topics = topics;
        position = 0;
    }
 
  public void reset() {
    position = 0;
  }
 
  @Override
  public Topic next() { 
    return topics[position++];
  }
 
  public Topic currentItem() {
    return topics[position];
  }
 
  @Override
  public boolean hasNext() {
    if(position >= topics.length)
            return false;
        return true;
  }
}