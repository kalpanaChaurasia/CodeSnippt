package com.threads;



public class ThreadEx3 implements Runnable {

	public void run() {
		
			try {
				System.out.println(Thread.currentThread().getId());
			}catch(Exception e) {
				System.out.println("Exception");
			}
		
	}
	

}


