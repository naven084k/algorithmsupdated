package com.learn.work.java.designpatterns.singleton;

class Singleton {
	static Singleton INSTANCE1;
	private Singleton() {

	}

	public static class Singleton1 {
		static Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return Singleton1.INSTANCE;
	}
	
	public static Singleton getInstance1() {

		if(INSTANCE1 == null) {
			synchronized(Singleton.class) {
				if(INSTANCE1 == null) {
					INSTANCE1 = new Singleton();
				}
			}
		}
		return INSTANCE1;
	}
}

public class SingleTonTest {
	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
	}
}
