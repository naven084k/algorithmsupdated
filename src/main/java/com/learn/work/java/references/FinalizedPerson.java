package com.learn.work.java.references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class FinalizedPerson extends PhantomReference<Person> {

	public FinalizedPerson(Person referent,ReferenceQueue<? super Person> queue) {
	    super(referent, queue);
	} 
	
	public void finalizeResources() {
        System.out.println("clearing ...");
    }
}
