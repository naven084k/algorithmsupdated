package com.learn.work.java.designpatterns.fatory;

public class AbstractFactory {
  public static Factory getFactory(String str) {
	  if(str.equalsIgnoreCase("shape"))
		  return new ShapeFactory();
	  if(str.equalsIgnoreCase("color"))
		  return new ColorFactory();
	  return null;
  }
}
