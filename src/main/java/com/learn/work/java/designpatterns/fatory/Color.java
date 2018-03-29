package com.learn.work.java.designpatterns.fatory;

public interface Color {
  public void paint();
}

class Red implements Color{

	@Override
	public void paint() {
		System.out.println("im red");
		
	}
	
}

class Blue implements Color{

	@Override
	public void paint() {
		System.out.println("im blue");
		
	}
	
}

class ColorFactory implements Factory {
	public Color getInstance(String str) {
		if(str.equals("red"))
			return new Red();
		if(str.equals("blue"))
			return new Blue();
		return null;
	}

	@Override
	public Shape getShapeInstance(String str) {
		return null;
	}

}