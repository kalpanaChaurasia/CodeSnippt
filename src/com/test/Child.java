package com.test;


public class Child extends Parent {

		Child() {
			System.out.println("child");
		}
		
		public void setParent(String one) {
			System.out.println(one);
		}
		
		public static void main(String[] args) {
			Parent p = new Child();		
		}
	}



