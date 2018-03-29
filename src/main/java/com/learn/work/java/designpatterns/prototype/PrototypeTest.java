package com.learn.work.java.designpatterns.prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		Cache.loadCache();
		for(int i=0;i<10;i++) {
			System.out.println(Cache.getShape("CIRCLE"));
		}
	}
}
