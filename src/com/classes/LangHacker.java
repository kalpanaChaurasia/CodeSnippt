package com.classes;

public class LangHacker {

	public static void main(String[] args) {
		Language p = new Language();
		p.name = "Ejava";
		
		func1(p);
		System.out.println(p.name);
		func2(p);
		System.out.println(p.name);

	}
	
	static void func2(Language p) {
		p.name = "Python";
		System.out.println(p.name);
	}
	
	static void func1(Language p) {
		p = new Language();
		p.name = "Angular";
		System.out.println(p.name);
	}

}
