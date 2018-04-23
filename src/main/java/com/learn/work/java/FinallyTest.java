package com.learn.work.java;

import java.util.Vector;

public class FinallyTest {
	public static void main(String[] args) {
System.out.println(test());

Vector<String> v= new Vector<>();
	}
	
	public static int test() {
		try {
			return 1;
		}catch(Exception e) {
			return 0;
		}
		finally {
			return 2;
		}
	}
}
