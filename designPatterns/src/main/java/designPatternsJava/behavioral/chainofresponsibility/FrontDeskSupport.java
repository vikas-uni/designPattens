package designPatternsJava.behavioral.chainofresponsibility;

public class FrontDeskSupport implements ISupportService {

	private ISupportService next = null;

	public ISupportService getNext() {
		return next;
	}

	public void setNext(ISupportService next) {
		this.next = next;
	}

	@Override
	public void handleRequest(ServiceRequest service) {
		if (service.getType() == ServiceLevel.LEVEL_ONE) {
			service.setConclusion("Front desk solved level one reuqest !!");
		} else {
			if (next != null) {
				next.handleRequest(service);
			} else {
				throw new IllegalArgumentException("No handler found for :: " + service.getType());
			}
		}
	}
}