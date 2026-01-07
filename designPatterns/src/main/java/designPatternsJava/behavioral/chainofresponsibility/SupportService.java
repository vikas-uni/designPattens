package designPatternsJava.behavioral.chainofresponsibility;

public class SupportService implements ISupportService {

	private ISupportService handler = null;

	public ISupportService getHandler() {
		return handler;
	}

	public void setHandler(ISupportService handler) {
		this.handler = handler;
	}

	@Override
	public void handleRequest(ServiceRequest request) {
		handler.handleRequest(request);
	}
}