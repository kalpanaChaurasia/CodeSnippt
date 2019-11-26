package com.test;

public abstract class Fruite {

	public static void main(String[] args) {
		Apple ap = new Apple();
		ap.draw(7);
	}

}

class Apple extends Fruite implements myint1, myint2 {

//	@Override
//	public void draw() {
//		System.out.println("draw");
//	}

	@Override
	public void draw(int a) {
		System.out.println("draw"+a);
		
	}

}

abstract interface myint1 {
	void draw(int a);
}

abstract interface myint2 {
	void draw(int b);
}
