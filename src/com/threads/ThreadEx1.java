package com.threads;

public class ThreadEx1 {

	public static void main(String arg[]) {

		Thread obj1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("first");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		});

		Thread obj2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("second");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
				}
			}
		});

		obj1.start();
		obj2.start();
	}

}
