package com.learn.work.java.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

import com.learn.work.java.designpatterns.fatory.Circle;
import com.learn.work.java.designpatterns.fatory.Rectangle;
import com.learn.work.java.designpatterns.fatory.Shape;
import com.learn.work.java.designpatterns.fatory.Square;


public class Cache {
  public static Map<String,Shape> map = new HashMap<String,Shape>();
  
  public static Shape getShape(String id) {
	  return (Shape) map.get(id).clone();
  }
  public static void loadCache() {
	  map.put("CIRCLE",new Circle());
	  map.put("RECTANGLE",new Rectangle());
	  map.put("SQUARE",new Square());
  }
}
