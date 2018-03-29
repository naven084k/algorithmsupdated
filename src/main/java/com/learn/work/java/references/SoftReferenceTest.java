package com.learn.work.java.references;

import java.lang.ref.SoftReference;

public class SoftReferenceTest {


	public static void main(String[] args) {
		Person p=new Person();
		SoftReference<Person> soft = new SoftReference<Person>(p);
		
		p=soft.get();
		System.out.println(p);
		System.gc();
		
		p=null;
		System.gc();
		System.out.println(soft.get());
				
	}


}
