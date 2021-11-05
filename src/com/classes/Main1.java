package com.classes;

import com.threads.ThreadEx3;

public class Main1{
	
	public static void main(String arg[]) {

		int a = 2;
		int n = a+a*a-a;
		
		for(int i=0; i<n; i++) {
			System.out.println(i+"");
			Thread obj = new Thread(new ThreadEx3());
			obj.start();
		}
	}
	
}