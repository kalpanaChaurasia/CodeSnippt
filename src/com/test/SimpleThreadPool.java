package com.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SimpleThreadPool {

	//A thread pool manages the pool of worker threads, it contains a queue that keeps tasks waiting to get executed. 
	//A thread pool manages the collection of Runnable threads and worker threads execute Runnable from the queue. 
	//java.util.concurrent.Executors provide implementation of java.util.concurrent.Executor interface to create the thread pool 
	//in java.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Workder thread
		ExecutorService executor=  Executors.newFixedThreadPool(5);
		 for (int i = 0; i < 10; i++) {			 
			  Runnable worker = new WorkerThread("" + i);
		            executor.execute(worker);
		   }
		      executor.shutdown();
		       while (!executor.isTerminated()) {
		        }
		        System.out.println("Finished all threads");

		        
		        // My monitor thread
		        
		        //RejectedExecutionHandler implementation
		        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
		        //Get the ThreadFactory to use
		        ThreadFactory threadFactory = Executors.defaultThreadFactory();
		        //creating the ThreadPoolExecutor
		        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);
		        //start the monitoring thread
		        MyMonitorThread monitor = new MyMonitorThread(executorPool, 3);
		        Thread monitorThread = new Thread(monitor);
		        monitorThread.start();
		        //submit work to the thread pool
		        for(int i=0; i<10; i++){
		            executorPool.execute(new WorkerThread("cmd"+i));
		        }

		        try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        //shut down the pool
		        executorPool.shutdown();
		        //shut down the monitor thread
		        try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        monitor.shutdown();

	}

}
