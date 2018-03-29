package com.learn.work.java.designpatterns.fatory;

import com.learn.work.java.designpatterns.fatory.Color;
import com.learn.work.java.designpatterns.fatory.Shape;

public interface Factory {
   public Shape getShapeInstance(String str);
   public Color getInstance(String str);
}
