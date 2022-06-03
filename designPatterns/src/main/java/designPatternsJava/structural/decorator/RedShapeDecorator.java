package designPatternsJava.structural.decorator;

import designPatternsJava.structural.adapter.Shape;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println("drawing in red colour");
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isHide() {
		// TODO Auto-generated method stub
		return false;
	}

}
