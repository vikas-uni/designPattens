package designPatternsJava.structural.flyweight;

/*
A flyweight objects essentially has two kind of attributes – intrinsic and extrinsic.

An intrinsic state attribute is stored/shared in the flyweight object, and it is independent of flyweight’s context. As the best practice, we should make intrinsic states immutable.

An extrinsic state varies with flyweight’s context, which is why they cannot be shared. Client objects maintain the extrinsic state, and they need to pass this to a flyweight object during object creation.
*/

public class PaintBrushClient {
	public static void main(String[] args) {
		Pen yellowThinPen1 = PenFactory.getThickPen("YELLOW"); // created new pen
		yellowThinPen1.draw("Hello World !!");

		Pen yellowThinPen2 = PenFactory.getThickPen("YELLOW"); // pen is shared
		yellowThinPen2.draw("Hello World !!");

		Pen blueThinPen = PenFactory.getThickPen("BLUE"); // created new pen
		blueThinPen.draw("Hello World !!");

		System.out.println(yellowThinPen1.hashCode());
		System.out.println(yellowThinPen2.hashCode());

		System.out.println(blueThinPen.hashCode());
	}
}