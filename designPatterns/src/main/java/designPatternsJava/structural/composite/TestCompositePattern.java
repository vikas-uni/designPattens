package designPatternsJava.structural.composite;

/**
 * When to use composite design pattern :Composite design pattern compose objects
 * into tree structures to represent whole-part hierarchies. Composite lets
 * clients treat individual objects and compositions of objects uniformly.
 * 
 * When application has hierarchical structure and needs generic functionality
 * across the structure. 
 * When application needs to aggregate data across a
 * hierarchy. 
 * When application wants to treat composite and individual objects
 * uniformly. 
 * 
 * Real life example usage of composite design pattern may be:
 * Building consolidate view of a customer’s account in bank (i.e. customer’s
 * portfolio) 
 * Building general ledgers Computer/network monitoring applications
 * Retail and inventory applications Directory structure in file system
 * implementations Menu items in GUI screens
 * 
 * Another good example- https://www.geeksforgeeks.org/composite-design-pattern/
 */

public class TestCompositePattern {

	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();

		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);

		drawing.draw("Red");

		drawing.clear();

		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
	}

}