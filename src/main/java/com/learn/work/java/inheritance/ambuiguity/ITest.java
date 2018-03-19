package com.learn.work.java.inheritance.ambuiguity;

public interface ITest {
 public void print(A a);
 public void print(B b);
}

class Testing implements ITest {

	@Override
	public void print(A a) {
		System.out.println("A");
		
	}

	@Override
	public void print(B b) {
		System.out.println("B");
		
	}
	
}
