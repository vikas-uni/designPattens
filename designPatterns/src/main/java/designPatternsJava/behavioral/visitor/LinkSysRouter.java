package designPatternsJava.behavioral.visitor;

public class LinkSysRouter implements Router {

	public void sendData(char[] data) {
	}

	public void acceptData(char[] data) {
	}

	public void accept(RouterVisitor v) {
		v.visit(this);
	}
}
