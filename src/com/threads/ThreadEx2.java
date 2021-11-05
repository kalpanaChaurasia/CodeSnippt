package com.threads;

public class ThreadEx2 {

	public static void main(String arg[]) {

		hack_t h1 = new hack_t();
		h1.start();
		while (h1.isAlive()) {
			try {
				h1.sleep(10);
			} catch (Exception e) {
				System.out.println("hello");
			}
			System.out.println("hackerath");

		}

	}

}

class hack_t extends Thread {

	public void run() {
		System.out.println("hi");
	}

}
