package designPatternsJava.structural.proxy;

public class RealInternet implements Internet{

	@Override
	public String connectTo(String url) {

		System.out.println("Real Internet connecting to: "+url);
		return "connected real internet";
	}

}
