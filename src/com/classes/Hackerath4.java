package com.classes;

public class Hackerath4 {

	public static void main(String[] args) {

		hack3 h1 = new hack3();
		hack5 h2 = new hack5();
		hack3 h;
		h = h1;
		h.hack_method();

	}

}

class hack3 {

	hack3() {
		System.out.println("hello");
	}

	void hack_method() {
		System.out.println("hackerath");
	}

}


class hack5 extends hack3{
	
	hack5(){
		 System.out.println("hi");
	}
	void hack_method() {
		 System.out.println("hello world");
	}	
}