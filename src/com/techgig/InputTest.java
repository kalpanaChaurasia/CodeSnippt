package com.techgig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner dd = new Scanner(System.in);
//		String val = dd.nextLine();
//		System.out.println(val);
////		String val1 = dd.nextLine();
////		System.out.println(val1);
//		
//		String[] numbers = val.split(" ");
//		System.out.println(numbers.length);
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		int[] vars = new int[3];
//
//		for (int i = 0; i < vars.length; i++) {
//			System.out.println("Enter next var: ");
//			vars[i] = dd.nextInt();
//		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String lines;
		try {
			String t = br.readLine();
			System.out.println(Integer.parseInt(t));
			
			lines = br.readLine();
			String[] strs = lines.trim().split("\\s+");
			System.out.println(strs[0]);
			System.out.println(strs[1]);
			System.out.println(strs[2]);
			
			lines = br.readLine();
			String[] strs1 = lines.trim().split("\\s+");
			System.out.println(strs1[0]);
			System.out.println(strs1[1]);
			System.out.println(strs1[2]);

//			for (int i = 0; i < strs.length; i++) {
//				System.out.println(Integer.parseInt(strs[i]));
//				//a[i] = Integer.parseInt(strs[i]);
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
