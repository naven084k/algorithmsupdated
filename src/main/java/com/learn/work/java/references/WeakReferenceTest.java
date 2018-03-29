package com.learn.work.java.references;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakReferenceTest {

	public static void main(String[] args) {
		Person p=new Person();
		WeakReference<Person> weak = new WeakReference<Person>(p);
		
		p=weak.get();
		System.out.println(p);
		System.gc();
		
		p=null;
		System.gc();
		System.out.println(weak.get());
		
		WeakHashMap<Person, String> map = new WeakHashMap<>();
		map.put(new Person(), "");
		System.gc();
		System.out.println(map.size());
		
				
	}
}
