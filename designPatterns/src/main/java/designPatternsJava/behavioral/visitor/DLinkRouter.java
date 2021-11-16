package designPatternsJava.behavioral.visitor;

public class DLinkRouter implements Router{
	 
    public void sendData(char[] data) {
    }
 
    public void acceptData(char[] data) {
    }
 
    public void accept(RouterVisitor v) {
        v.visit(this);
    }
}