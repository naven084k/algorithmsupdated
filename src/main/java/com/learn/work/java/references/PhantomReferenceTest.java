package com.learn.work.java.references;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

public class PhantomReferenceTest {

	public static void main(String[] args) {ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
	List<FinalizedPerson> references = new ArrayList<>();
	List<Person> largeObjects = new ArrayList<>();
	 
	for (int i = 0; i < 10; ++i) {
	    Person largeObject = new Person();
	    largeObjects.add(largeObject);
	    references.add(new FinalizedPerson(largeObject, referenceQueue));
	}
	 
	largeObjects = null;
	System.gc();
	 
	Reference<?> referenceFromQueue;
	for (PhantomReference<Person> reference : references) {
	    System.out.println(reference.isEnqueued());
	}
	 
	while ((referenceFromQueue = referenceQueue.poll()) != null) {
	    ((FinalizedPerson)referenceFromQueue).finalizeResources();
	    referenceFromQueue.clear();
	}}
}
