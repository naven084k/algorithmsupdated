package com.learn.work.java.designpatterns.fatory;

public abstract class Shape implements Cloneable {
   public abstract void draw();
   
   public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }
}

enum Shapes {
	CIRCLE,SQUARE,RECTANGLE
}
class ShapeFactory implements Factory{
	public  Shape getShapeInstance(String shape) {
		if(shape.equalsIgnoreCase(Shapes.CIRCLE.name()))
			return new Circle();
		if(shape.equalsIgnoreCase(Shapes.RECTANGLE.name()))
			return new Rectangle();
		if(shape.equalsIgnoreCase(Shapes.SQUARE.name()))
			return new Square();
		else return null;
	}

	@Override
	public Color getInstance(String str) {
		return null;
	}
}
