package com.learn.work.java.inheritance.ambuiguity;

public class Test {

	public static void main(String[] args) {
		ITest it=new Testing();
		it.print(new B());
	}
}
