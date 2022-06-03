package designPatternsJava.structural.decorator;

import designPatternsJava.structural.adapter.Shape;

public abstract class ShapeDecorator implements Shape{

	// Protected variable
    protected Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
}
