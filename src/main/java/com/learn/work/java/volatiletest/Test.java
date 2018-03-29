package com.learn.work.java.volatiletest;

import java.util.Scanner;

class Counter extends Thread {

	private volatile boolean counting = true;
	private int counter=1;
	
	public void run() {
		while(counting) {
			System.out.println(counter);
			counter++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void stopCounting() {
		counting = false;
	}
}

public class Test {
  public static void main(String[] args) {
	Counter counter = new Counter();
	counter.start();
	//counter.run();
	Scanner scanner = new Scanner(System.in);
	scanner.nextLine();
	counter.stopCounting();
}	
}
