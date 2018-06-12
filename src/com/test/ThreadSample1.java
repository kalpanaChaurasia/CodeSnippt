package com.test;

public class ThreadSample1 {
	
	private int count = 1;
	public static void main(String[] args) {
		
	//	new ThreadSample1().display(null);
		
		ThreadSample1 demo =new ThreadSample1();
		Thread a1 = new Example(demo);
		Thread a2 = new Example(demo);	
	}


	public synchronized void doSomething() {
		for(int i=0; i<10; i++) {
			System.out.println(count++);
		}
	}

	void display(ThreadSample1 dd) {
		
	}

	void display(String dd) {
		
	}



}

class Example extends Thread{
	ThreadSample1 demo;
	
	public Example(ThreadSample1 d) {
		demo = d;
	}
	
	public void run() {
		demo.doSomething();
	}
	

}
