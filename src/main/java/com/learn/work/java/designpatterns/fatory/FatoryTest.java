package com.learn.work.java.designpatterns.fatory;

/****
 * this pattern deals with creating object without exposing the object creation logic
 * @author npokal
 *
 */
public class FatoryTest {

	public static void main(String[] args) {
		ShapeFactory shape = new ShapeFactory();
		Shape p = shape.getShapeInstance(Shapes.CIRCLE.name());
		p.draw();
	}
}
