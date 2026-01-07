package designPatternsJava.structural.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternet implements Internet {

	private Internet internet = new RealInternet();
	private static Set<String> bannedSites;

	static {
		bannedSites = new HashSet<String>();
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("ijk.com");
		bannedSites.add("lnm.com");
	}

	@Override
	public String connectTo(String serverhost) {
		if (bannedSites.contains(serverhost.toLowerCase())) {
			return "Access Denied";
		}

		return internet.connectTo(serverhost);
	}

}
