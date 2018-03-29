package com.learn.work.java.threading;

import java.util.Stack;

class Producer extends Thread {
	Stack<Integer> stack;
	int value=0;
	public Producer(Stack<Integer> stack) {
		this.stack = stack;
	}
	public void run() {
		
		while(true) {
		
			synchronized(stack) {
				
				while(stack.size() == 5)
					try {
						stack.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				stack.push(value++);
				System.out.println("pushing item"+value);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stack.notify();
			}
		}
		
	}
}
class Consumer extends Thread {
	Stack<Integer> stack;
	public Consumer(Stack<Integer> stack) {
		this.stack = stack;
	}
	public void run() {
		while(true) {
			
			synchronized(stack) {
				
				while(stack.size() == 0)
					try {
						stack.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				System.out.println(stack.pop());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				stack.notify();
			}
		}
	}
}

public class ProducerConsumerTest {

	public static void main(String[] args) {
		Stack<Integer> items = new Stack<>();
		Producer producer = new Producer(items);
		Consumer consumer = new Consumer(items);
		
		producer.start();
		consumer.start();
		
	}

}
