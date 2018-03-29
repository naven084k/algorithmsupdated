package com.learn.work.java.designpatterns.fatory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory.getFactory("shape").getShapeInstance("square").draw();
	}
}
