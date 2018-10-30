package com.test;

public class WorkerThread  implements Runnable{
	
	public String command;
	
	public WorkerThread(String s) {
		this.command = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
		 
		 processCommand();
		 
		 System.out.println(Thread.currentThread().getName()+" End.");

	}
	
	public void processCommand() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.command;
	}
	

}
