package com.threads;



public class ThreadEx extends Thread {

	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(10);
			}catch(Exception e) {
				System.out.println("hello");
			}
			System.out.println(i+" ");
			
		}
	}
	
	public static void main(String arg[]) {

		ThreadEx h1= new ThreadEx();
		ThreadEx h2= new ThreadEx();
		
		h1.start();
		
		try {
			h1.join();
		}catch(Exception e) {
			System.out.println("hi");
		}
		
		h2.start();
	}

}
