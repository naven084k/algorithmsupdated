package com.learn.work.java.threading;

public class SynchronizationDelegation {

	public static void main(String[] args) throws InterruptedException {
		long start= System.currentTimeMillis();
		X x = new X();
		A a = new A(x);
		B b= new B(x);
		
		a.start();
		b.start();
		
		a.join();
		b.join();
		long end= System.currentTimeMillis();
		System.out.println(x.one+" "+x.two);
		System.out.println((end-start)/1000);
	}
}

class A extends Thread {
	X x;
	public A(X x) {
		this.x = x;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			try {
				x.add();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread {
	X x;
	public B(X x) {
		this.x = x;
	}
	public  void run() {
		for(int i=0;i<1000;i++) {
			try {
				x.add();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class X {
	Integer one = new Integer(1);
	Integer two = new Integer(1);
	
	public synchronized void add() throws InterruptedException {
        synchronized(this.one){
        	this.one = this.one+1;  
        	Thread.sleep(3);
        }
        synchronized(this.two){
        	this.two = this.two+2;
        	Thread.sleep(3);
        }
	}
}