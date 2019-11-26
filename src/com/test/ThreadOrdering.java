package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadOrdering {
	public static void main(String[] args) {
		
		   ExecutorService executor = Executors.newFixedThreadPool(2);//creating a pool of 5 threads  
	        for (int i = 0; i < 5; i++) {  
	            Runnable worker = new WorkerThread("" + i);  
	            executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
	        

//		class MyRunnable implements Runnable {
//			private final int threadnumber;
//
//			MyRunnable(int threadnumber) {
//				this.threadnumber = threadnumber;
//			}
//
//			public void run() {
//				System.out.println(threadnumber);
//			}
//		}

		// for (int i = 1; i <= 10; i++) {
		// new Thread(new MyRunnable(i)).start();
		// }

//		TestSleepMethod1 t1 = new TestSleepMethod1();
//		TestSleepMethod1 t2 = new TestSleepMethod1();
//
//		t1.start();
//		t2.start();

		TestThreadTwice1 t1 = new TestThreadTwice1();
		t1.start();
		t1.start(); 
		//output
//		running
//	       Exception in thread "main" java.lang.IllegalThreadStateException

	}

	public static class TestSleepMethod1 extends Thread {
		public void run() {
			for (int i = 1; i < 5; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println(i);
			}
		}
	}

	public static class TestThreadTwice1 extends Thread {
		public void run() {
			System.out.println("running...");
		}
	}
}