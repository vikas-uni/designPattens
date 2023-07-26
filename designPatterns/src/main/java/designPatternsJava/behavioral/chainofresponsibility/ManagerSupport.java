package designPatternsJava.behavioral.chainofresponsibility;

public class ManagerSupport implements ISupportService {

	private ISupportService next = null;

	public ISupportService getNext() {
		return next;
	}

	public void setNext(ISupportService next) {
		this.next = next;
	}

	@Override
	public void handleRequest(ServiceRequest request) {
		if (request.getType() == ServiceLevel.LEVEL_THREE) {
			request.setConclusion("Manager solved level three reuqest !!");
		} else {
			if (next != null) {
				next.handleRequest(request);
			} else {
				throw new IllegalArgumentException("No handler found for :: " + request.getType());
			}
		}
	}
}