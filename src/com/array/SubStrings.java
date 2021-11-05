package com.array;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String abc = "| kalpana | test";
		
		
		if(abc.substring(0,1).contains("|")) {			
			String xyz = abc.substring(1);
			System.out.print(xyz);
		}
	}

}
