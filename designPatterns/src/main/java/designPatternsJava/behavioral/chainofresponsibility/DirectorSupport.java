package designPatternsJava.behavioral.chainofresponsibility;

public class DirectorSupport implements ISupportService {

	private ISupportService next = null;

	public ISupportService getNext() {
		return next;
	}

	public void setNext(ISupportService next) {
		this.next = next;
	}

	@Override
	public void handleRequest(ServiceRequest request) {
		if (request.getType() == ServiceLevel.LEVEL_FOUR) {
			request.setConclusion("Director solved level four reuqest !!");
		} else {
			if (next != null) {
				next.handleRequest(request);
			} else {
				request.setConclusion("You problem is none of our business");
				throw new IllegalArgumentException("You problem is none of our business :: " + request.getType());
			}
		}
	}
}