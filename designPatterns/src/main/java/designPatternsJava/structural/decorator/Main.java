package designPatternsJava.structural.decorator;

import designPatternsJava.structural.adapter.Circle;
import designPatternsJava.structural.adapter.Rectangle;
import designPatternsJava.structural.adapter.Shape;

/*
 * https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/
Procedure:

Create an interface.
Create concrete classes implementing the same interface.
Create an abstract decorator class implementing the above same interface.
Create a concrete decorator class extending the above abstract decorator class.
Now use the concrete decorator class created above to decorate interface objects.
Lastly, verify the output
*/

public class Main {
	public static void main(String[] args) {

		// Creating an object of Shape interface
		// inside the main() method
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		// Display message
		System.out.println("Circle with normal border");

		// Calling the draw method over the
		// object calls as created in
		// above classes

		// Call 1
		circle.draw();
		
		 // Call 2
        redCircle.draw();
 
        // Display message
        System.out.println("\nRectangle of red border");
 
        // Call 3
        redRectangle.draw();
	}
}
