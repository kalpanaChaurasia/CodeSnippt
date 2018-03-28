package com.test;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String binary = sc.nextLine();
		System.out.println(Integer.parseInt(binary, 2));
		
	}
	
	public static int BinToDec(int binary){
		int decimal = 0;
		int p=0;
		while(true){
			if(binary == 0){
				break;
			}else{
				int temp = binary%10;
				decimal += temp*Math.pow(2,p);
				binary = binary/10;
				p++;
			}
		}
		return decimal;
	}
}
