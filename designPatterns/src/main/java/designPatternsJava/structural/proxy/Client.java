package designPatternsJava.structural.proxy;

public class Client {
	public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
       
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        
    }
}
