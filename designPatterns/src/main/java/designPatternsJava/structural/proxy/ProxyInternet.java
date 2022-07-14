package designPatternsJava.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

	private Internet internet = new RealInternet();
	 private static List<String> bannedSites;
     
	    static
	    {
	        bannedSites = new ArrayList<String>();
	        bannedSites.add("abc.com");
	        bannedSites.add("def.com");
	        bannedSites.add("ijk.com");
	        bannedSites.add("lnm.com");
	    }
	      
	    @Override
	    public String connectTo(String serverhost) 
	    {
	        if(bannedSites.contains(serverhost.toLowerCase()))
	        {
	            return "Access Denied";
	        }
	          
	       return internet.connectTo(serverhost);
	    }

}
